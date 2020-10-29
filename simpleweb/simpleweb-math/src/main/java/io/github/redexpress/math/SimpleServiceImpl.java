package io.github.redexpress.math;

import io.github.redexpress.hello.Hello;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.apache.servicecomb.serviceregistry.api.registry.MicroserviceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimpleServiceImpl implements SimpleService{

    private static RestTemplate restTemplate = RestTemplateBuilder.create();

    @RpcReference(microserviceName = "helloworld", schemaId = "hello")
    private static Hello hello;

    public HelloVO sayHello(String name) {
        String message = hello.hello();
//        message = restTemplate.getForObject("cse://helloworld/hello", String.class);
        return HelloVO.builder().message(message).name(name).instanceId(instanceId()).build();
    }

    public String instanceId() {
        MicroserviceInstance instance = RegistryUtils.getMicroserviceInstance();
        if (instance == null) {
            throw new IllegalStateException(
                    "unable to find any service instances, maybe there is problem registering in service center?");
        }
        return instance.getInstanceId();
    }
}
