package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Interns;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr= new HR();
		ConfirmedEmployee confirmedEmployee = new ConfirmedEmployee();
		confirmedEmployee.netSalary();// To see how it can also work
		Accounts accounts = new Accounts();
		
		accounts.processSalary(confirmedEmployee);
		Interns interns= new Interns();
		accounts.processSalary(interns);
		ContractEmployee contractEmployee=new ContractEmployee();
		accounts.processSalary(contractEmployee);
		
		
		
		
	}

}
