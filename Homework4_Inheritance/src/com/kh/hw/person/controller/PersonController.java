package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

public class PersonController extends Person {
	
	private Student[] s = new Student[SIZE1];
	public static final int SIZE1 = 3; 
	private Employee[] e = new Employee[SIZE2];
	public static final int SIZE2 = 10;
	
	
	
	// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	
	public int sudentCount() {
		
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public int employeeCount() {
		
		int count = 0;
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
//	public int[] personCount() {
//		int[] sizes = {s.length, e.length};
//		int[] count;
//		
//		for(int i = 0; i < sizes.length; i++) {
//			if(count.[i] != null) {
//				count++
//			}
//		}
//		return sizes;
//	}
	
	// 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
	public void inserStudent(String name, int age, double height, double weight, int grade, String major) {
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	// 학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		
		return null;
	}
	
	// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	// 사원 객체 배열의 주소를 반환하는 매소드
	public Employee[] printEmployee() {
		return null;
	}
}
