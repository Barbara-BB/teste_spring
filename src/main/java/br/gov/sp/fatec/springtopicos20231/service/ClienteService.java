package br.gov.sp.fatec.springtopicos20231.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;

import br.gov.sp.fatec.springtopicos20231.entity.Cliente;


import br.gov.sp.fatec.springtopicos20231.repository.ClienteRepository;


@Service
public class ClienteService implements IClienteService {
	

    @Autowired
    private ClienteRepository clienteRepo;

    public Cliente novoCliente(Cliente cliente) {        if(cliente == null
            || cliente.getNomec() == null
            || cliente.getEstado() == null)
   {
       throw new IllegalArgumentException("erro");
   }

            if(cliente.getDataInicio() == null){
                cliente.setDataInicio(LocalDateTime.now());
            }

       return clienteRepo.save(cliente);
}


public List<Cliente> buscarTodosClientes() {
   return clienteRepo.findAll();
}


public Cliente buscarPorId(Long id) {
   Optional<Cliente> clienteOp = clienteRepo.findById(id);
   if(clienteOp.isEmpty()) {
       throw new IllegalArgumentException("erro");
   }
   return clienteOp.get();
}}
