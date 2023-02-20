package com.app.entities;

 

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
   private String	collageName;
   private String collageAddress;
   
   @OneToMany(mappedBy="college" ,cascade=CascadeType.ALL)
   private List<Student> studentList=new ArrayList<Student>();

public int getCollageId() {
	return collageId;
}

public void setCollageId(int collageId) {
	this.collageId = collageId;
}

public String getCollageName() {
	return collageName;
}

public void setCollageName(String collageName) {
	this.collageName = collageName;
}

public String getCollageAddress() {
	return collageAddress;
}

public void setCollageAddress(String collageAddress) {
	this.collageAddress = collageAddress;
}

public List<Student> getStudentList() {
	return studentList;
}

public void setStudentList(List<Student> studentList) {
	this.studentList = studentList;
}

@Override
public String toString() {
	return "College [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
			+ ", studentList=" + studentList + "]";
}
   
   
   
}