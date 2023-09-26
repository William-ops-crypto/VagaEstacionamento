package com.exercicio.will.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exercicio.will.entitis.StatusEntradaSaida;
import com.exercicio.will.entitis.Vaga;

public interface BuscarPlacaRepository extends JpaRepository<Vaga, Long> {
	
	
	
	
	
	
	Vaga findByPlaca(String placa);
	
	
	List<Vaga> findByPlacaContainingIgnoreCase(String placa);
	
	@Query(nativeQuery = true, value = "SELECT placa FROM tb_vaga placa WHERE placa LIKE %:placa% ")
	List<Vaga> findByPlacaLike(@Param("placa")String placa);
	

}


