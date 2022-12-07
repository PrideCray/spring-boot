package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService { //acessa o repository para salvar os clientes

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }


    public void salvarCliente(Cliente cliente)
    {
        validarCliente(cliente);
        this.repository.salvar(cliente);
    }

    public void validarCliente(Cliente cliente)
    {
        //aplica validacoes
    }
}
