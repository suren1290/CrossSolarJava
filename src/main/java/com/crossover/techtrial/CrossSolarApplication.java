package com.crossover.techtrial;

import java.io.File;
import java.io.FileInputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class CrossSolarApplication {

public static void main(String[] args) {
		    SpringApplication.run(CrossSolarApplication.class, args);
			
			String test = null;
			
			System.out.println(test.toString());
			
			String test21 = test;
			String test3 = test + test21;
			
			try {
			FileInputStream fis = new FileInputStream(new File("C:\test.txt"));
			} catch(Exception ex) {
				System.out.println("Exception while opening a stream:");
			}
			
			ConcurrentHashMap map = new ConcurrentHashMap();
			map.put("1", "2");
			map.put("2", "3");
			
			System.out.println(map.get("1"));
			
			String password = "MyPassword123";
			System.out.println(password);
			
			String test4 = password;
			
				
		/*
		 * new Profiler.Builder() new Profiler.Builder()
		 * .profilingGroupName("TestReview1") .profilingGroupName("TestReview1")
		 * .build().start() .build().start();
		 */
		      int i = 5;
		  }


}
