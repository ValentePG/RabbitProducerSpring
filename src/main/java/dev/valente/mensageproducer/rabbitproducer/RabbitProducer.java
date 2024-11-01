package dev.valente.mensageproducer.rabbitproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitProducer {

    private RabbitTemplate template;

    public RabbitProducer(RabbitTemplate template) {
        this.template = template;
    }

    public void sendMessage(String message){
        System.out.println("Sending Message");
        template.convertAndSend("Teste",
                "algumaroutingkey",
                message);
    }
}
