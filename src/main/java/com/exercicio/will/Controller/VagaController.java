package com.exercicio.will.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.exercicio.will.Repository.VagaRepository;
import com.exercicio.will.entitis.StatusEntradaSaida;
import com.exercicio.will.entitis.Vaga;
import com.exercicio.will.services.SearchPlacaService;





@RestController
@RequestMapping(value = "/vagas")

public class VagaController {
	
	
	
	@Autowired
	private VagaRepository repository;
	@Autowired
	private SearchPlacaService searchplacaservice;
	
	
	
	
	@GetMapping
	public List<Vaga> findAll(){
		List<Vaga> result = repository.findAll();
		return result;
		}
	
	@GetMapping(value = "/get/{id}")
	public Vaga findById(@PathVariable Long id) {
		Vaga result = repository.findById(id).get();
		return result; 
		
	}
	
	
	

	
	
	
	@PostMapping(value = "/post")
	public Vaga insert(@RequestBody Vaga vaga) {
	Vaga result = repository.saveAndFlush(vaga);
			return result;
	
	}
		
		
		
	
	
	
	
	@PutMapping(value = "/put/{id}")
	public Vaga atualizar(@RequestBody Vaga vaga) {
		Vaga result = repository.saveAndFlush(vaga);
		return result;
		
		
	}
	
	
	@DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
    repository.deleteById(id);
    }
	
	

	@GetMapping(value = "/placa")
	
	public List<Vaga> findByPlaca(@RequestParam(value = "placa", required = true)String placa) {
		List<Vaga> result = searchplacaservice.findByPlacaLike(placa);
		return result;
	}
	
	
	@GetMapping(value = "/name")
	
	public List<Vaga> findByName(@RequestParam(value = "name", required = true)String name) {
		List<Vaga> result = searchplacaservice.findByNameLike(name);
		return result;
	}
	
	
			
	
	
	

}
