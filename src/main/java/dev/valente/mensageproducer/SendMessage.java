package dev.valente.mensageproducer;

import dev.valente.mensageproducer.rabbitproducer.RabbitProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SendMessage implements CommandLineRunner {


    private RabbitProducer rabbitProducer;

    public SendMessage(RabbitProducer rabbitProducer) {
        this.rabbitProducer = rabbitProducer;
    }

    @Override
    public void run(String... args) throws Exception {

        rabbitProducer.sendMessage("Hello World From Spring");
    }
}
