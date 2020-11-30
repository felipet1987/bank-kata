package cl.talavera.bank.controller;

import cl.talavera.bank.usecase.Sender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Sender sender;

    public HelloController(Sender sender) {
        this.sender = sender;
    }

    @RequestMapping("/")
    public String index() {
        return sender.send();
    }

}
