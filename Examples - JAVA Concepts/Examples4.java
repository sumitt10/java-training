import java.util.*;
public class Examples4 {
	static void printFreq(int arr[])
	{
	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++)
		{
			Integer c = hmap.get(arr[i]);

			if (hmap.get(arr[i]) == null)
			 {  hmap.put(arr[i], 1); }

			else {
			hmap.put(arr[i], ++c); }
		}

		for (Map.Entry m:hmap.entrySet())
		System.out.println("Frequency of " + m.getKey() + 
							" is " + m.getValue());
	}

	public static void main (String[] args)
	{
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		printFreq(arr);
	}
}
