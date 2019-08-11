package HashMapConcept_A;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept 
{
	public static void main(String args[])
	{	
		//HashMap is a Class which implements Map Interface.
		//HashMap stores the Values on the Basis of Key and Value Pair.
		//It contains only and only Unique Elements.
		//It may have One Null Key and Multiple Null Values.
		//It maintains No Order.
		//Put method is used to add Elements into HashMap.
		
		//HashMap is Non-Synchronized and It is Not Thread Safe.
		//It means if it is used in Multi-Threading Environment.
		//If 5 Threads are Running on then HashMap object can be accessed by all the Threads.
		//So the Performance of the HashMap will be Increased Automatically.
		
		//Fail-Fast Condition <<>> Concurrent Modification Execution.
		//When One Thread Performing an action on any HashMap Object like addition or removal
		//At the Same time another Thread will try to Perform an Action.
		//In Such Cases we get above Exception.
		
		//We use HashMap for Multi-Threading Application where we want to Improve the Performance.
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Selenium");
		hashMap.put(2, "Java");
		hashMap.put(3, "TestRunner");
		hashMap.put(4, "LoadRunner");
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(5)); //Gives Null.
		
		//To Print all values from HashMap
		//We have to Use EntrySet and EntryConcept
		for(Entry map : hashMap.entrySet())
		{
			System.out.println(map.getKey() + " " + map.getValue());
		}
		
		//To Remove Value from HashMap
		System.out.println(hashMap);
		hashMap.remove(3);
		System.out.println(hashMap);
		
		System.out.println("################################################");
		
		//For below code, Employee Class is Created and Variables are Initialized.
		HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();
		Employee employee1 = new Employee("Tom", 25, "Admin");
		Employee employee2 = new Employee("Peter", 25, "Tester");
		Employee employee3 = new Employee("Steve", 25, "Developer");
		
		employee.put(1, employee1);
		employee.put(2, employee2);
		employee.put(3, employee3);
		
		for(Entry<Integer, Employee> employeesData : employee.entrySet())
		{
			int key = employeesData.getKey();
			Employee employees = employeesData.getValue();
			System.out.println("Employee " + key + " Information :");
			
			System.out.println(employees.name + " " + employees.age + " " + employees.department);
		}
	}
}
