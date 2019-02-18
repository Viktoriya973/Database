package zhuko.v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
	private int age;
	private String name;
	private int id;

	public Teacher(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	private Map<String, List<Student>> studentPerCourse = new HashMap<String, List<Student>>();

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, List<Student>> getStudentPerCourse() {
		return studentPerCourse;
	}
	public void setStudentPerCourse(Map<String, List<Student>> studentPerCourse) {
		this.studentPerCourse = studentPerCourse;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((studentPerCourse == null) ? 0 : studentPerCourse.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentPerCourse == null) {
			if (other.studentPerCourse != null)
				return false;
		} else if (!studentPerCourse.equals(other.studentPerCourse))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Teacher [age=" + age + ", name=" + name + ", id=" + id + ", studentPerCourse=" + studentPerCourse + "]";
	}
	
}


