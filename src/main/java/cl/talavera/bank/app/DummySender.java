package cl.talavera.bank.app;

import org.springframework.stereotype.Service;

@Service
public class DummySender implements Sender{
    @Override
    public String send() {
        return "hello world!!";
    }
}
