package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListConcept
{
	public static void main(String[] args) 
	{
		//Here it will accept int, Character and String values as well.
		//Below is Non-Generics
		ArrayList demo = new ArrayList(); //Here it will import List and ArrayList Values.
		demo.add(1);
		demo.add("Om"); //List is a Java interface which extends collections interface.
		demo.add("SaiBaba"); //List is a grouping of ordered elements.
		demo.add("SaiBaba"); //List allows duplicates elements.
		
		System.out.println(demo); //Prints all values in List
		System.out.println("Printing 3rd Value of ArrayList : " +demo.get(3));
		//List allows to access elements using Index.
		
		//Generics
		//It will now accept Only and Only String values.
		ArrayList<String> demo1 = new ArrayList<String>(); 
		demo1.add("Jai");
		demo1.add("Sai");
		
		System.out.println(demo1);
		System.out.println(demo1.get(0));	
		
		System.out.println("##############################");
		
		//To Print Size of ArrayList
		int sizeOfArrayList = demo1.size();
		System.out.println("The Size of ArrayList ::: " +sizeOfArrayList);
		
		//To Print all Values from ArrayList
		for(int i=0; i<sizeOfArrayList; i++)
		{
			System.out.println("The Array " + i + " Value is ::: " +demo1.get(i));
		}
		
		System.out.println("##############################");
		
		//To Print all Values from ArrayList using For-Each Or Enhanced For-Loop
		for(Object arrayValues : demo1)
		{
			System.out.println("The ArrayList Value is ::: " +arrayValues);
		}
		
		System.out.println("##############################");
		
		//To Print all Values from ArrayList using Iterator
		Iterator<String> iterator = demo1.iterator();
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			System.out.println("ArrayList Values are ::: " +value);
		}
	}
}