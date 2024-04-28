package com.exercicio.will.entitis;








import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_vaga")

public class Vaga {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column
    private Long id;
    @Column
    
    private String pagamento;
    @Column
    @NotBlank
	private String name;
    @Column
    @NotBlank
	private String marcadocarro;
    @NotBlank
	@Column
	private String modelo;
	@Column
	@NotBlank
	@Size(min = 8, max = 8)
	private String placa;
	
	
	  
	private String dateTime ;
	
       
	
	
	public String getDateTime() {
		return dateTime;
	}



	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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



	public String getPagamento() {
		return pagamento;
	}



	public void setStatuspagamento(String pagamento) {
		this.pagamento = pagamento;
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