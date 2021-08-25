package Modules;

import java.util.List;

public class SubjectOffer {
	private Integer id;
	private String scheduleCron;
	private Subject subject;
	private List<Teacher> listTeacher;
	private List<Course> listCourse;
	private List<Student> listStudent;
	private String status;
	private EnrollmentInfo enrollmentInfo;

	public SubjectOffer(Integer id, String scheduleCron, Subject subject, String status, EnrollmentInfo enrollmentInfo) {
		super();
		this.id = id;
		this.scheduleCron = scheduleCron;
		this.subject = subject;
		this.status = status;
		this.enrollmentInfo = enrollmentInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScheduleCron() {
		return scheduleCron;
	}

	public void setScheduleCron(String scheduleCron) {
		this.scheduleCron = scheduleCron;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EnrollmentInfo getEnrollmentInfo() {
		return enrollmentInfo;
	}

	public void setEnrollmentInfo(EnrollmentInfo enrollmentInfo) {
		this.enrollmentInfo = enrollmentInfo;
	}
	
	

}
