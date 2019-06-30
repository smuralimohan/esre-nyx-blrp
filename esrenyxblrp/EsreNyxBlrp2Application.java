package com.paypal.esrenyxblrp;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.paypal.esrenyxblrp.model.Status;
import com.paypal.esrenyxblrp.repository.StatusRepository;

@EnableJpaRepositories("com.paypal.esrenyxblrp.repository")
@ComponentScan("com.paypal.esrenyxblrp")
@EntityScan("com.paypal.esrenyxblrp.model")
@EnableAutoConfiguration
@SpringBootApplication
@EnableWebMvc
public class EsreNyxBlrp2Application {
	
	@Autowired
	private StatusRepository statusRepository;
	
	@PostConstruct
	public void doThis() {
		List<Status> statuses=  statusRepository.findAll();
		for (Status status: statuses) {
			System.out.println(status.toString());
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EsreNyxBlrp2Application.class, args);
		
	}
	
}
