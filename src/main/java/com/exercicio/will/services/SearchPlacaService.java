package com.exercicio.will.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.exercicio.will.Repository.VagaRepository;
import com.exercicio.will.entitis.Vaga;



@Service
public class SearchPlacaService {
	
	
	@Autowired
	private VagaRepository repository;
	

	
	
	@Transactional(readOnly = true)
	public List<Vaga> findByPlacaLike(String placa) {
		List<Vaga> result = repository.findByPlacaContainingIgnoreCase(placa);
		return result;
				
				
				
	}
	
	@Transactional(readOnly = true)
	public List<Vaga> findByNameLike(String name) {
		List<Vaga> result = repository.findByNameContainingIgnoreCase(name);
		return result;
				
				
				
	}
	

				
				
	
	
	
    @Transactional
    public Vaga save(Vaga vaga) {
        Vaga result = repository.save(vaga);
        return result;
    }
	
	



	
	
				
				
				
	
}

