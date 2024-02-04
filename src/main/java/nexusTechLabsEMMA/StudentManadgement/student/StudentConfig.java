package nexusTechLabsEMMA.StudentManadgement.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLinerunner (StudentRepository repository) {
		
		return args -> { 
			
			
			Student octave = new Student(
					"octave Emmanuel", 
					"Faye", 
					"fayeoctaveemmanuel5@gmail.com", 
					LocalDate.of(2000, 10, 18));
			Student daouda = new Student(
					"Daouda",
					"Sow",
					"swdaouda@gmail.com", 
					LocalDate.of(2001, 10, 18));
			Student moustapha = new Student(
					"Moustapha",
					"Seck", 
					"pogbaseck@gmail.com", 
					LocalDate.of(2000, 05, 25));
			Student jeremie = new Student(
					"Jeremie", 
					"Ndjoli", 
					"ndjolijay@gmail.com",
					LocalDate.of(2000, 01, 10));
			Student raphael = new Student(
					"Raphael Roland",
					"Faye",
					"raph@gmail.com", 
					LocalDate.of(2007,8, 16));
			repository.saveAll(List.of(octave,moustapha,jeremie,daouda,raphael));
	};
	
	
	
}
	
}