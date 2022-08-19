
package javaprogram;

import employee.employee;

public class HumanResource extends employee{
	
	int bonus=1000;  
	//where the payment which is not accepted by child class can also be changed according to child
	//class is known Method overriding (or)Run -time polymorphism.
	 float payment =45000;
	static void Extrabonus(double n) {
		 double extra =10.500;
		  
		 System.out.println("your ExtraBonus"+extra); 
	 }
	 public static void main(String args[]){  
		 HumanResource p=new HumanResource();  
		//Method can be called automatically according to their parameter assigned in the method is method Overloading(or)Compile-time polymorphism.
		 HumanResource E=new HumanResource();
		 E.Extrabonus(0);
		 
	   System.out.println("Programmer salary is:"+ p.payment);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}


