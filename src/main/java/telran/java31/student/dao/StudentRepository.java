package telran.java31.student.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import telran.java31.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	// List<Student> findByName(String name); // spring data analyzes request and
	// make it like mongo request (transforms to
	// its language)

	Stream<Student> findByName(String name);
	// query

	long countByNameIn(List<String> names); //если нет аннотации - строит запрос на основании метода
	
	//@Query("{scores.Math:{'$gte':90}}")  //can be tested in Atlas
	@Query("{'?0':{'$gte':?1}}") 
	Stream<Student>findByExamScore(String exam, int score);
}
