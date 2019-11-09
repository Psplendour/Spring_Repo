package com.pk.model;
import java.util.List;
public class StudentListAccessor {
	private Student thirdStudentInList;
	private List<Student> failedStudent;
	private List<String> studentName;

	public Student getThirdStudentInList() {
		return thirdStudentInList;
	}

	public void setThirdStudentInList(Student thirdStudentInList) {
		this.thirdStudentInList = thirdStudentInList;
	}

	public List<Student> getFailedStudent() {
		return failedStudent;
	}

	public void setFailedStudent(List<Student> failedStudent) {
		this.failedStudent = failedStudent;
	}

	public List<String> getStudentName() {
		return studentName;
	}

	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}
}
