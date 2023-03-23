package com.radix.api.infrastructure.jpa.repository;

import com.radix.api.infrastructure.jpa.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienterRepository extends CrudRepository<Cliente , Integer> {

}
