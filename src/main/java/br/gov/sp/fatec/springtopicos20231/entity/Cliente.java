package br.gov.sp.fatec.springtopicos20231.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long id;

    @Column(name = "cliente_nome")
    private String nomec;

    @Column(name = "data_cliente")
    private LocalDateTime dataInicio;

    @Column(name = "cliente_uf")
    private String estado;

	public Cliente(String nomec, LocalDateTime dataInicio, String estado) {
		super();
		this.nomec = nomec;
		this.dataInicio = dataInicio;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomec() {
		return nomec;
	}

	public void setNome(String nomec) {
		this.nomec = nomec;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
}
