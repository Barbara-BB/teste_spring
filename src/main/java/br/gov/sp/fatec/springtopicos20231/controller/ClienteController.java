package br.gov.sp.fatec.springtopicos20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20231.entity.Cliente;

import br.gov.sp.fatec.springtopicos20231.service.IClienteService;
@RestController
@CrossOrigin
@RequestMapping(value = "/cliente")
public class ClienteController {
	

    @Autowired
    private IClienteService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Cliente novoCliente(@RequestBody Cliente cliente) {
        return service.novoCliente(cliente);
    }

    @GetMapping
    public List<Cliente> buscarTodosClientes(){
        return service.buscarTodosClientes();
    }

    @GetMapping(value = "/id/{cliente}")
    public Cliente buscarPorId(@PathVariable("cliente") Long id){
        return service.buscarPorId(id);
    }

}
