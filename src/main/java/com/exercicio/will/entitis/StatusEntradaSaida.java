package com.exercicio.will.entitis;






import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_status")


public class StatusEntradaSaida {
	
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@NotBlank
		private Long id;
		private String name;
		private String status;
		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}


		
	
		
		



		public StatusEntradaSaida(){
			
		}
		



		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
