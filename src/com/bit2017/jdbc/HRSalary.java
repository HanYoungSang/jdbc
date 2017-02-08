package com.bit2017.jdbc;

import java.util.Scanner;

public class HRSalary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int minSalary = scanner.nextInt();
		int maxSalary = scanner.nextInt();
		
		System.out.println( "=========================" );
		searchEmployeesBySalary( minSalary, maxSalary );
		
		scanner.close();
	}
}
