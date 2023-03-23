package com.radix.api.infrastructure.controller;

import com.radix.api.domain.service.ClienteService;
import com.radix.api.infrastructure.persistence.jpa.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/inserts")
    public void saveCliente() {
        clienteService.saveCliente();
    }

    @PutMapping("/update")
    public void updateCliente() {
        clienteService.updateCliente();
    }

    @PostMapping("/delete")
    public void deleteCliente() {
        clienteService.deleteUpdate();
    }

    @GetMapping(path = "/todos")
    public @ResponseBody List<Cliente> findAll() {
       return clienteService.findAll();
    }
}
