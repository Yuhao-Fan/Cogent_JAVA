package com.cogent.sb3.exceptions;


import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.FieldError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class ExceptionController {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleValidationExceptions(
	 MethodArgumentNotValidException ex) {
	 Map<String, String> errors = new HashMap<>();
	 ex.getBindingResult().getAllErrors().forEach((error) -> {
	 String fieldName = ((FieldError) error).getField();
	 String errorMessage = error.getDefaultMessage();
	 errors.put(fieldName, errorMessage);
	 System.out.println("handleValidationExceptions"+error);
	 });
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}
	//Customized Exceptionssss
//	@ExceptionHandler(value = ResourceNotFoundException.class )
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public @ResponseBody ErrorResponse handleException(ResourceNotFoundException ex) {
//	System.out.println("Exception Caught.....");
//	return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
//	}
//	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	   public ResponseEntity<Object> exception3(ResourceNotFoundException exception) {
//		 Map<String, String> errors = new HashMap<>();
//		 exception.getBindingResult().getAllErrors().forEach((error) -> {
//		 String fieldName = ((FieldError) error).getField();
//		 String errorMessage = error.getDefaultMessage();
//		 errors.put(fieldName, errorMessage);
//		 System.out.println("Amanda ....."+error);
//		 });
//			return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
			      return new ResponseEntity<>(exception.getMessage()+"Resource not found2", HttpStatus.NOT_FOUND);
	   }

	
}

