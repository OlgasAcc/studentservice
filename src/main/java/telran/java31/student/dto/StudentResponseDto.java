package telran.java31.student.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDto {
	Integer id; // if wasnt added - null (not 0)
	String name;
	Map<String, Integer> scores;
	
	
}
