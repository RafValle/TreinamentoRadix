package com.radix.api;

import com.radix.api.infrastructure.jpa.entity.Cliente;
import com.radix.api.infrastructure.jpa.repository.ClienterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class RadixTrainningJavaApplication implements CommandLineRunner {

	@Autowired
	private ClienterRepository clienterRepository;
	public static void main(String[] args) {
		SpringApplication.run(RadixTrainningJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente cliente = new Cliente();
		cliente.setCnpj("teste");
		cliente.setDataCriacao(new Date());
		cliente.setDataAtualizacao(new Date());
		cliente.setRazaoSocial("TesteTestando");

		clienterRepository.save(cliente);

	}
}
