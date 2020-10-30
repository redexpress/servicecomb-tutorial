package io.github.redexpress.mydubbo.consumer;

import io.github.redexpress.mydubbo.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @DubboReference
    HelloService service;

    public String msg(String name) {
        return service.sayHello(name);
    }
}
