import java.util.*;
public class Examples5
{
	static void printFreq(int arr[])
	{
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			Integer c = tmap.get(arr[i]);
			if (tmap.get(arr[i]) == null)
			{ tmap.put(arr[i], 1);
			}
			else {
			tmap.put(arr[i], ++c);
			}
		}

		for (Map.Entry m:tmap.entrySet())
		System.out.println("Frequency of " + m.getKey() + 
							" is " + m.getValue());
	}

	public static void main (String[] args)
	{
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		printFreq(arr);
	}
}
