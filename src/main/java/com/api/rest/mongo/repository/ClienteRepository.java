package com.api.rest.mongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api.rest.mongo.documentos.Cliente;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {

}
