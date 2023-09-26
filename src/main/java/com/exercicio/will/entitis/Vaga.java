package com.exercicio.will.entitis;





import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_vaga")

public class Vaga {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
	private String name;
	private String marcadocarro;
	private String modelo;
	private String placa;
	private LocalDateTime datetime = LocalDateTime.now();
	
	public LocalDateTime getDatetime() {
		return datetime;
	}



	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}



	@ManyToOne
	@JoinColumn(name = "status_id")
	private StatusEntradaSaida status;

	
	
	public Vaga() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMarcadocarro() {
		return marcadocarro;
	}



	public void setMarcadocarro(String marcadocarro) {
		this.marcadocarro = marcadocarro;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public StatusEntradaSaida getStatus() {
		return status;
	}



	public void setStatus(StatusEntradaSaida status) {
		this.status = status;
	}





	

	

	
	

}
