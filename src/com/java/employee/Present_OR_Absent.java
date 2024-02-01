package com.java.employee;

public class Present_OR_Absent {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int Emp_Rate_per_Hour=20;
		//Veriables
		int empHRS = 0;
		int empWages=0;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME) {
			empHRS=8;
		}else {
			empHRS=0;
			
		}
		empWages=empHRS*Emp_Rate_per_Hour;
		System.out.println("Emp Wage :"+empWages);

	}
}
