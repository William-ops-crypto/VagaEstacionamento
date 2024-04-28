package com.exercicio.will.dtos;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class VagaDTO {

	@NotBlank
	private String name;
	@NotBlank
	private String marcadocarro;
	@NotBlank
	private String modelo;
	@NotBlank
	@Size(max = 7)
	private String placa;
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
	
	
	
	
	
	
}
