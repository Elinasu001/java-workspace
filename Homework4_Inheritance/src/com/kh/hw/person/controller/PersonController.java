package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	public static final int SIZE1 = 3;
	public static final int SIZE2 = 10;
	
	private Student[] s = new Student[SIZE1];
	private Employee[] e = new Employee[SIZE2];

	{ 	// 학생
		s[0] = new Student("난학생", 22, 169, 50, 4, "컴퓨터과학과");
		// 사원
		e[0] = new Employee("난사원", 22, 169, 50, 700, "개발부서");
	}

	// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int[] personCount() {

		int studentCount = 0;
		int employeeCount = 0;

		for (int i = 0; i < SIZE1; i++) {
			if (s[i] != null) {
				studentCount++;
			}
		}

		for (int i = 0; i < SIZE2; i++) {
			if (e[i] != null) {
				employeeCount++;
			}
		}
		return new int[] { studentCount, employeeCount };
	}

	// 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

		for (int i = 0; i < SIZE1; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}

	// 학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		return s;
	}

	// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

		for (int i = 0; i < SIZE2; i++) {
			if (e[i] != null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}

	}

	// 사원 객체 배열의 주소를 반환하는 매소드
	public Employee[] printEmployee() {
		return e;
	}
}
