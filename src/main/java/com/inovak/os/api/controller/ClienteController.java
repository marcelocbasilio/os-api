package com.inovak.os.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovak.os.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João das Couves");
		cliente1.setTelefone("+55 85 3333-4444");
		cliente1.setEmail("joao@joaodascouves.com.br");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("+55 85 4444-3333");
		cliente2.setEmail("maria@maria.com.br");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
