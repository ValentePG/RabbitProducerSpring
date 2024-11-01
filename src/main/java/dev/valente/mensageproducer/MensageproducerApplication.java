package dev.valente.mensageproducer;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MensageproducerApplication  {

	static final String directExchangeName = "Teste";

	static final String queueName = "hello";

	@Bean
	Queue queue(){
		return new Queue(queueName, false);
	}

	@Bean
	DirectExchange exchange(){
		return new DirectExchange(directExchangeName);
	}

	@Bean
	Binding binding(Queue queue, DirectExchange directExchange){
		return BindingBuilder.bind(queue).to(directExchange).with("algumaroutingkey");
	}

	public static void main(String[] args)  {

		SpringApplication.run(MensageproducerApplication.class, args);

	}
}
