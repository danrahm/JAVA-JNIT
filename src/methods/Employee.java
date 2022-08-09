package methods;

public class Employee {

	
		
		
		int empid;
		String empname;
		int salary;
		String dept;
		
		
		void display()
		{
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(salary);
			System.out.println(dept);
		}
		
		public static void main (String args[])
		{
			Employee doc= new Employee(); 			// First Employee
			doc.empid = 11898;
			doc.empname = "Abdul";
			doc.salary = 200000;
			doc.dept = "Cardio-thorasic";
			
			doc.display();
			
			Employee nurse = new Employee();		// Second employee
			nurse.empname = "Tana";
			nurse.empid = 11989;
			nurse.salary = 50000;
			nurse.dept = "General";
			
			nurse.display();
			
		}

	}


