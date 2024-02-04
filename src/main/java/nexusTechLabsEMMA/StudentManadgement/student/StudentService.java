package nexusTechLabsEMMA.StudentManadgement.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	public List <Student>  getStudent() {
	
		return  studentRepository.findAll();
	}
	
	public void addStudent(Student student) {
	
		System.out.println(student);
	}
	
}
