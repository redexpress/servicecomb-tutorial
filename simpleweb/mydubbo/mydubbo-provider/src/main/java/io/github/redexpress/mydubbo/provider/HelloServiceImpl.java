package io.github.redexpress.mydubbo.provider;

import io.github.redexpress.mydubbo.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello " + name + " from Dubbo provider!";
    }
}
