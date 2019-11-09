package com.pk.info;
import java.util.List;
import java.util.Set;
import com.pk.model.Student;
    public class OrgInfo {
	private Student[] stuArr = new Student[2];
	private List<Student> studLsit;
	private Set<Student>  stuSet;
	public Student[] getStuArr() {
		return stuArr;
	}
	public void setStuArr(Student[] stuArr) {
		this.stuArr = stuArr;
	}
	public List<Student> getStudLsit() {
		return studLsit;
	}
	public void setStudLsit(List<Student> studLsit) {
		this.studLsit = studLsit;
	}
	public Set<Student> getStuSet() {
		return stuSet;
	}
	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}
}
