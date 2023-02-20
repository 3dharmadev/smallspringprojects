package com.app.usecases;

import com.app.entities.College;
import com.app.entities.Student;
import com.app.utiltiy.EMUtil;

import jakarta.persistence.EntityManager;

public class Demo {
	
	public static void main(String[] args) {
		
		
		EntityManager em=EMUtil.provideEntityManager();
		/*
		College c=new College(); c.setCollageAddress("BANGLADESH"); c.setCollageName("ISLAMIC JIHAD HABIBULAH COLLEGE"); 
		
		College c1=new College(); c1.setCollageAddress("PAKISTAN"); c1.setCollageName("ISLAMIC JIHAD INDEPEDENT COLLEGE"); 
		
		Student s1=new Student(); s1.setStudentName("Ahmed"); s1.setEmail("noorhoorahmed@gmail.com"); s1.setMobileNumber(921881881);
		s1.setCollege(c); c.getStudentList().add(s1);
		
		Student s2=new Student(); s2.setStudentName("Khatun"); s2.setEmail("khatunahmed@gmail.com"); s2.setMobileNumber(1828822);
		s2.setCollege(c); c.getStudentList().add(s2);
		 
		
		Student s3=new Student(); s3.setStudentName("alala"); s3.setEmail("laldjj@gmail.com"); s3.setMobileNumber(921881881);
		s3.setCollege(c1);  c1.getStudentList().add(s3);
		
		Student s4=new Student(); s4.setStudentName("mllejamar"); s4.setEmail("bak-e-rid@gmail.com"); s4.setMobileNumber(1330);
		
		s4.setCollege(c1);	 c1.getStudentList().add(s4);
		
		
            em.getTransaction().begin();
            
          //  em.persist(c);   em.persist(c1);
            
            em.persist(s4);   em.persist(s1);   em.persist(s2);   em.persist(s3);
            
            em.getTransaction().commit(); */
		
		
		
		
		
		
		
	}

}
