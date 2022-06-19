package program.jav.inner.classes;

import program.jav.inner.classes.Member_Inner.Inner;

public class Assignment1_Employee {
	
	int salary = 1000;
	
	
	class PerEmployee{

        // members of nested class
		String code = "PE01";
		float hike = 0.45f;

        public double new_salary(){
            return salary+(salary*hike);
        }
        
        public void display(){
        	System.out.println(salary);
        	System.out.println(code);
        	System.out.println(new_salary());
        }
    }
	
	class TempEmployee{

		// members of nested class
				String code = "TE01";
				float hike = 0.30f;

        public double new_salary(){
            return salary+(salary*hike);
        }
        
        public void display(){
        	System.out.println(salary);
        	System.out.println(code);
        	System.out.println(new_salary());
        }
    }
	
	void role() { 
        
        class ContractEmployee { 
        	
        	// members of nested class
			String code = "CE01";
			float hike = 0.30f;
			
        	public double new_salary(){
                return salary+(salary*hike);
            }
            
            public void display(){
            	System.out.println(salary);
            	System.out.println(code);
            	System.out.println(new_salary());
            } 
        } 
        ContractEmployee y = new ContractEmployee();  //---> object creation of the local innerClass
        y.new_salary();
        y.display();  // calling inner class method
    }
	
	public static void main(String args[]){ 
		  
		Assignment1_Employee obj=new Assignment1_Employee();     // creating object of Outer class
		System.out.println("\n------Per Emp-------------------");  
		Assignment1_Employee.PerEmployee per=obj.new PerEmployee();   // creating object of Inner class
		per.new_salary();  
		per.display(); 
		System.out.println("\n--------Temp Emp-----------------"); 
		  Assignment1_Employee.TempEmployee temp=obj.new TempEmployee();   // creating object of Inner class
		  temp.new_salary();  
		  temp.display(); 
		  System.out.println("\n--------Contract Emp-----------------"); 
		  obj.role();
	
		 }
}
