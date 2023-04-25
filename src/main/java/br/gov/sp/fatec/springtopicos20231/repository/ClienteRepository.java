package br.gov.sp.fatec.springtopicos20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springtopicos20231.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	public Cliente findByCliente(String nomec);

}
