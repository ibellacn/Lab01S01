package Modules;

import java.util.Date;

public class EnrollmentInfo {
	private Integer id;
	private String semester;
	private Date enrollStart;
	private Date enrollFinish;
	public EnrollmentInfo(Integer id, String semester, Date enrollStart, Date enrollFinish) {
		this.id = id;
		this.semester = semester;
		this.enrollStart = enrollStart;
		this.enrollFinish = enrollFinish;
	}
	public Integer getId() {
		return id;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Date getEnrollStart() {
		return enrollStart;
	}
	public void setEnrollStart(Date enrollStart) {
		this.enrollStart = enrollStart;
	}
	public Date getEnrollFinish() {
		return enrollFinish;
	}
	public void setEnrollFinish(Date enrollFinish) {
		this.enrollFinish = enrollFinish;
	}
	
}
