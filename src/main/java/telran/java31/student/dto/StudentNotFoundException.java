package telran.java31.student.dto;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class StudentNotFoundException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public StudentNotFoundException (int id) {
		super("Student with "+id+" is not found");
	}
}
