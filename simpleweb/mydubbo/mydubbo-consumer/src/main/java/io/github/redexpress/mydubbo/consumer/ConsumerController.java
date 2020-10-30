package io.github.redexpress.mydubbo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;
    @GetMapping("/msg/{user}")
    public String msg(@PathVariable("user") String user) {
        return consumerService.msg(user);
    }
}
