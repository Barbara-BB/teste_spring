package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20231.entity.Cliente;



public interface IClienteService {
	
    public Cliente novoCliente(Cliente cliente);

    public List<Cliente> buscarTodosClientes();

    public Cliente buscarPorId(Long id);

}
