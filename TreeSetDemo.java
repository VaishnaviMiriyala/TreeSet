package m8.task2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import m6.task5.Employee;
public class TreeSetDemo{
       public static void main(String[] args) {
    	// insert employee records
    	   TreeSet<Employee> empTreeSet = new TreeSet<>();
		    empTreeSet.add(new Employee("Vaishu",01,50000,"Java Project"));
		    empTreeSet.add(new Employee("Ramesh",02,40000,"Electronics Project"));
		    empTreeSet.add(new Employee("Suresh",03,60000,"Electrical Project"));
		    empTreeSet.add(new Employee("Aish",04,70000,"python Project"));
		    empTreeSet.add(new Employee("Ramesh",03,60000,"Electrical Project"));
		 // display tree set
		    System.out.println("Employee"+empTreeSet);

	}
    
      
}
	