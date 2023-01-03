package com.akash.JavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ControlFlow.MatchCase;
import javalist.JavaList;
import Variables.Integer;

@SpringBootApplication
public class JavaProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaProjectApplication.class, args);
		JavaProjectApplication javaProjectApplication = new JavaProjectApplication();
		javaProjectApplication.mathcase();
		javaProjectApplication.variable();
		javaProjectApplication.list();

	}
	void mathcase(){
		MatchCase matchCase = new MatchCase();
		matchCase.matchcase(1);
	}
	void variable(){
		Integer integer = new Integer();
		System.out.println("setting i");
		integer.setI(4);
		System.out.println("Printing i");
		System.out.println(""+integer.getI());
	}
	void list(){
		JavaList javaList = new JavaList();
		System.out.println(javaList.getList());
		System.out.println("Inserting in list ");
		javaList.setList(2);
		javaList.setList(1);
		javaList.setList(3);
		System.out.println(javaList.getList());
		System.out.println("Sorting list");
		javaList.sort();
		System.out.println(javaList.getList());
		System.out.println("Sorting list");
		javaList.reversesort();
		System.out.println(javaList.getList());
		System.out.println("Finding 2 in list");
		javaList.find();
		System.out.println("Deleting list elements clearing list");
		javaList.remove();
		System.out.println(javaList.getList());
	}

}
