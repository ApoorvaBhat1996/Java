package practise11;

public class Employee {
	
	int iEmpID1;
	String sEmpName;
	float fEmpBasicSalary;
	float fAllowance;



Employee(int iEmpID1, String sEmpName, float fEmpBasicSalary ){
	this.iEmpID1=iEmpID1;
	this.sEmpName=sEmpName;
	this.fEmpBasicSalary=fEmpBasicSalary;
	System.out.println("Employee ID is:"+iEmpID1);
	System.out.println("Basic Salary of employee is"+fEmpBasicSalary);
	
}

void calNetSalary(){
	double incometax;
	double netsalary;
	double grosssalary;
	
	fAllowance=(float) ((0.46)*fEmpBasicSalary);
	System.out.println("Gross Salary of the Employee is:"+fAllowance);
	grosssalary=fEmpBasicSalary+fAllowance;
	System.out.println("Gross Salary of the Employee is:"+grosssalary);
	if(grosssalary<5000){
		incometax=0;
		System.out.println("incometax is Nill");
	}
	else if(grosssalary>=5001 && grosssalary<=10000){
		incometax=0.1*grosssalary;
		System.out.println("incometax to be paid is"+incometax);
	}
	else if(grosssalary>=10001 && grosssalary<=20000){
		incometax=0.2*grosssalary;
		System.out.println("incometax to be paid is"+incometax);
	}
	else{
		incometax=0.3*grosssalary;
	    System.out.println("incometax to be paid is"+incometax);
	}
	
	
	netsalary=grosssalary-incometax;
	System.out.println("Netsalary of the employee is"+netsalary);
	
	
	
}
}
