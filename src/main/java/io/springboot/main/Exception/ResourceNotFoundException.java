package io.springboot.main.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)            //if api doesnt 
public class ResourceNotFoundException  extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}


////restapi's throw this exception if data does not exist in database 