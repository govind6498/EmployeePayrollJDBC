package com.bridgelabz.employeepayrolljdbc;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.employeepayrolljdbc.EmployeePayrollService.IOService;

public class EmployeePayrollServiceMain {
	public static void main(String[] args) {

		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData(IOService.CONSOLE_IO);
	}
}
