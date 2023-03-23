package com.radix.api.domain.service;

import com.radix.api.infrastructure.persistence.jpa.entity.Cliente;
import com.radix.api.infrastructure.persistence.jpa.repository.ClienterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienterRepository clienterRepository;

    public ClienteService(ClienterRepository clienterRepository) {
        this.clienterRepository = clienterRepository;
    }

    public void saveCliente(){

        Cliente cliente = new Cliente();
        cliente.setCnpj("teste");
        cliente.setDataCriacao(new Date());
        cliente.setDataAtualizacao(new Date());
        cliente.setRazaoSocial("TesteTestando");

        clienterRepository.save(cliente);
    }

    public void updateCliente(){

        List<Cliente> clienteList = (List<Cliente>) clienterRepository.findAll();
        clienteList.forEach(cliente -> {
            cliente.setRazaoSocial("TesteTestando");
            cliente.setDataAtualizacao(new Date());
            clienterRepository.save(cliente);
        });
    }

    public void deleteUpdate(){

        List<Cliente> clienteList = (List<Cliente>) clienterRepository.findAll();
        clienteList.forEach(cliente -> {
            clienterRepository.delete(cliente);
        });
    }

    public List<Cliente> findAll(){
        List<Cliente> clienteList = (List<Cliente>) clienterRepository.findAll();
        return clienteList;
    }
}
