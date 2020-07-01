package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		
		List<Employee> list = new ArrayList();  
		//		System.out.println() result
		list.add(new Employee (111, "Trainer", "BBB", 1));
		list.add(new Employee (112, "Developer", "BDS", 561));
		list.add(new Employee (113, "Counter", "DFG", 1111));
		list.add(new Employee (114, "Cooker", "ACD", 155));
		list.add(new Employee (115, "Homeseater", "KKO", 154));
		list.add(new Employee (1915, "Homesehhater", "KjKO", 1549));
		
		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort		
		double minSalaryEmployee;
		Employee medium = new Employee();
		for (int i = 0 ; i<list.size(); i++ ) {
			minSalaryEmployee = list.get(i).getSalary() ;
			for (int j = i + 1 ; j<list.size(); j++) {
				if(minSalaryEmployee > list.get(j).getSalary()) {
					medium = list.get(j);
					list.set(j, list.get(i));
					list.set(i, medium);
					minSalaryEmployee = medium.getSalary();
				}
			}
			
		}
		
		for (Employee i : list) {
//			System.out.println(i.getjobTitle()+ " " + i.getSalary());
		}	
				

		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}
	 
	
	
}
