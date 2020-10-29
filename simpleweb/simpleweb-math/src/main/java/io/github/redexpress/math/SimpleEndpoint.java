package io.github.redexpress.math;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "math")
@RequestMapping(path = "/")
public class SimpleEndpoint {
    SimpleService simpleService;

    @Autowired
    public SimpleEndpoint(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping(path = "/sayhello/{name}")
    public HelloVO sayHello (@PathVariable(value = "name", required = false) String name) {
        String user = name != null ? name : "Yang";
        return simpleService.sayHello(name);
    }
}