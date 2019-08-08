package Collections;
import java.util.HashSet;
import java.util.Set;
public class SetConcept
{
	public static void main(String[] args) 
	{
		//Non-Generics
		//Here it will accept all Data Type Values. Since it is Non-Generics.
		Set values = new HashSet(); //Here, it will import only Set Methods.
		values.add(12); //Set is a Java interface which extends collections interface.
		values.add("Tom"); //Set is a grouping of unordered elements.
		values.add(10.0); //Set does not allows duplicates elements.
		values.add("Tom");
				
		System.out.println(values); //Prints all values in Set.
		//System.out.println(values.get(2)); //Set does not allows to access elements using Index.
		
		//Printing Set Values using For-Each Loop
		//Since Set is not Index based - We cannot use For Loop to Iterate Set Values
		for(Object setValues : values)
		{
			System.out.println(setValues);
		}
		System.out.println("---------------------");
		
		//Generics
		//Here it will accept Only and Only String values.
		Set<String> demo = new HashSet<String>(); 
		demo.add("Om"); 
		demo.add("SaiBaba"); 
		demo.add("SaiBaba"); 
		
		System.out.println(demo); //Prints all values in Set.
		//System.out.println(demo.get(3)); //Set does not allows to access elements using Index.
		
		//Printing Set Values using For-Each Loop
		//Since Set is not Index based - We cannot use For Loop to Iterate Set Values
		for(String setValues : demo)
		{
			System.out.println(setValues);
		}
	}
}