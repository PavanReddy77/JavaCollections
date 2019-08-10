package HashTableConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept 
{
	public static void main(String[] args) 
	{
		//HashTable stores the Values on the Basis of Key and Value Pair.
		//HashTable is similar to HashMap.
		//HashTable is Synchronized and It is Thread Safe.
		//One Thread can access Only one HashTable Object at a Time.
		//So, The Performance of the Application will be Slow.
		//Key will be stored in the Form of Object --> HashCode --> Value.
		//Put method is used to add Data into HashTable.
		//Null Keys and Null Values are not Allowed in HashTable.
		
		Hashtable hashTable1 = new Hashtable();
		hashTable1.put(1, "Tom");
		hashTable1.put(2, "Test");
		hashTable1.put(3, "Java");
		
		//Create a Clone Copy Or Shallow Copy:
		Hashtable hashTable2 = new Hashtable();
		hashTable2 = (Hashtable)hashTable1.clone();
		
		System.out.println("The Values from HashTable-1 ::: " +hashTable1);
		System.out.println("The Values from HashTable-2 ::: " +hashTable2);
		
		//To Clear all the Values from hashTable1.
		hashTable1.clear();
		System.out.println("The Values from HashTable-1 ::: " +hashTable1);
		System.out.println("The Values from HashTable-2 ::: " +hashTable2);
		
		System.out.println("###########################");
		
		//Contains Value:
		Hashtable hashTable3 = new Hashtable();
		hashTable3.put("A", "Pavan");
		hashTable3.put("B", "Manager");
		hashTable3.put("C", "Selenium");
		
		if(hashTable3.containsValue("Pavan"))
			System.out.println("The Expected Value is Found");
		
		System.out.println("###########################");
		
		//Print all the Values from HashTable using Enumeration >> elements().
		Enumeration enumeration = hashTable3.elements();
		System.out.println("Printing all Values from HashTable-3 using Enumeration");
		
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println("###########################");
		
		//Print all the Values from HashTable using EntrySet >> Set of HashTable Values.
		System.out.println("Printing all Values from HashTable-3 using EntrySet");
		Set set = hashTable3.entrySet();
		System.out.println(set);
		
		System.out.println("###########################");
		
		//Checking if two HashTables are Equal Or No
		Hashtable hashTable4 = new Hashtable();
		hashTable4.put("A", "Pavan");
		hashTable4.put("B", "Manager");
		hashTable4.put("C", "Selenium");
		
		if(hashTable3.equals(hashTable4))
			System.out.println("Both HashTables are Equal");
		
		System.out.println("###########################");
		
		//To get Value from a Key:
		System.out.println(hashTable4.get("A"));
		
		System.out.println("###########################");
		
		//Generics
		Hashtable<String, String> hashTable5 = new Hashtable<String, String>();
	}
}
