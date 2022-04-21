package com.api.rest.mongo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.mongo.documentos.Cliente;
import com.api.rest.mongo.repository.ClienteRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Flux<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Mono<Cliente> findById(String id) {
		return clienteRepository.findById(id);
	}

	@Override
	public Mono<Cliente> save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Mono<Void> delete(Cliente cliente) {
		return clienteRepository.delete(cliente);
	}

	
}
