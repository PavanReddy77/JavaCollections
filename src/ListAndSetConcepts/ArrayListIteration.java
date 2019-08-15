package ListAndSetConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration 
{
	public static void main(String[] args) 
	{
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. 
		System.out.println("----Using Java 8 For Each Loop with Lambda Expression----");
		tvSeries.forEach(shows -> {System.out.println(shows);});
		
		//2.
		System.out.println("-------Using Iterator-------");
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext())
		{
			String shows = it.next();
			System.out.println(shows);
		}

		//3.
		System.out.println("----Using Iterator and Java 8 Lambda and forEachRemaining Method----");
		it = tvSeries.iterator();
		it.forEachRemaining(shows -> {System.out.println(shows);});
		
		//4.
		System.out.println("-------Using For Each Loop-------");
		for(String shows : tvSeries)
		{
			System.out.println(shows);
		}
		
		//5.
		System.out.println("-------Using For Loop with Order Or Index-------");
		for(int i=0; i<tvSeries.size(); i++)
		{
			System.out.println(tvSeries.get(i));
		}
		
		//6.
		System.out.println("-------Using ListIterator() to Traverse in both the Directions-------");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious())
		{
			String shows = tvSeriesListIterator.previous();
			System.out.println(shows);
		}
	}
}
