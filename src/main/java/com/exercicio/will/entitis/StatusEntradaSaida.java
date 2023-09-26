package com.exercicio.will.entitis;






import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")


public class StatusEntradaSaida {
	
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long id;
		private String status;
		
		
		
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
