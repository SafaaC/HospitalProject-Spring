package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Hospital hospital=(Hospital)context.getBean("myhospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getBranch().getName());
		System.out.println(hospital.getBranch().getDname());
		System.out.println(hospital.getBranch().getPerson().getDiseaseCost());
	}

}
