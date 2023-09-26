package com.exercicio.will.Repository;





import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exercicio.will.entitis.Vaga;


public interface VagaRepository extends JpaRepository<Vaga, Long> {
	
	
	
		
		
		
		Vaga findByPlaca(String placa);
		
		List<Vaga> findByPlacaContainingIgnoreCase(String placa);
		
		@Query(nativeQuery = true, value = "SELECT placa FROM tb_vaga placa WHERE placa LIKE %:placa% ")
		List<Vaga> findByPlacaLike(@Param("placa")String placa);
		

	
		Vaga findByName(String name);
		
		List<Vaga> findByNameContainingIgnoreCase(String name);
		
		@Query(nativeQuery = true, value = "SELECT name FROM tb_vaga name WHERE name LIKE %:name% ")
		List<Vaga> findByNameLike(@Param("name")String name);

		
		



}

	
	
	
	

	


