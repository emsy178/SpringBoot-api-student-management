package nexusTechLabsEMMA.StudentManadgement.student;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name= "student")
public class Student {
    @Id
    @SequenceGenerator(
    		name = "student_sequence",
    		sequenceName = "student_sequence",
    		allocationSize = 1
    	
    		)
    @GeneratedValue(
    		strategy =  GenerationType.SEQUENCE,
    		generator = "student_sequence"
    		
    		)
    @Column (name = "_id")
	private Long id;
    @Column (name = "first_name")
	private String firstName;
    @Column (name = "last_name")
	private String lastName;
    @Column(name="email", nullable = false, unique = true)
	private String email;
    @Column(name= "date_of-birth")
	private LocalDate dob;
    @Column(name="age")
  
    @Transient
    private Integer age;
    
    public Student() {
        
    }
	
	public Student(Long id , String firstName,String lastName, String email, LocalDate dob ) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		
	}
	public Student(String firstName,String lastName, String email, LocalDate dob ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long  getId () {
		return id;
	}
	
	public void setFirstName (String firstName ) {
		
		this.firstName = firstName;
		
	}
	public String getFirstName () {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	public Integer getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String stringify () {
		
		return  "[ " + id + ", " +  firstName + ", " + lastName + ", " + email + ", " + dob  + " ]" ;
	}
	
	
}