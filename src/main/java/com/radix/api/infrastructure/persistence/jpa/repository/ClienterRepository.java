package com.radix.api.infrastructure.persistence.jpa.repository;

import com.radix.api.infrastructure.persistence.jpa.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienterRepository extends CrudRepository<Cliente , Integer> {

}
