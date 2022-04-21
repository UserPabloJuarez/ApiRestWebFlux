package com.api.rest.mongo.Service;

import org.springframework.stereotype.Service;

import com.api.rest.mongo.documentos.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface ClientService {

	public Flux<Cliente> findAll();
	
	public Mono<Cliente> findById(String id);
	
	public Mono<Cliente> save(Cliente cliente);
	
	public Mono<Void> delete(Cliente cliente);
	
}
