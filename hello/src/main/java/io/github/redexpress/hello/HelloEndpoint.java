package io.github.redexpress.hello;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "hello")
@RequestMapping(path = "/")
public class HelloEndpoint {
    @GetMapping(path = "/hello")
    public String calculate() {
        return "Hello World!";
    }
}
