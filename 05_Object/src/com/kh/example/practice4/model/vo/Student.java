package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student(){
		this.grade = 4;
		this.classroom = 2;
		this.name = "박수현";
		this.height = 166;
		this.gender = 'F';
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void getGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("[ 학년: " + grade 
							+ ", 반: " + classroom 
							+ ", 이름: " + name 
							+ ", 키: " + height
							+ ", 성별: " + gender+"]");
	}
	
}
