package nexusTechLabsEMMA.StudentManadgement.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {

	private final StudentService  studentService ;
	
	
	public StudentController(StudentService  studentService ) {
		this.studentService =  studentService ;
	}
	
	@GetMapping
	public List <Student>  getStudent() {
		
		return  studentService.getStudent();
	}
	
	@PostMapping
	public  void registerNewaStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
}
