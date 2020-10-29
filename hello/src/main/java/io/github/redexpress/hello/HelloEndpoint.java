package io.github.redexpress.hello;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "hello")
@RequestMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
public class HelloEndpoint implements Hello {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World!";
    }
}
