package com.exercicio.will.exceptions;





import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;







@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e) {
		
		return new ResponseEntity<String>("Error, todos os campos devem ser preenchido e placa não pode ser menor ou maior que 8 carácter, exemplo: (***-****) .", HttpStatus.EXPECTATION_FAILED);
		
		
		
	}
	

	
	
	
	
}
