package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class SET3Q2 {
	
	public static void putvalues(String[] s1) {
		ArrayList<String> l1=new ArrayList<>();
		ArrayList<String> l2=new ArrayList<>();
		HashMap<String,String> m1=new HashMap<String,String>();
		
		for(String s:s1)
		{
			l1.add(s.toUpperCase().substring(0, 3));
		}
		for(String s:s1)
		{
			l2.add(s);
		}
		
		for(int i=0;i<l1.size();i++)
		{
			m1.put(l1.get(i), l2.get(i));
		}
		System.out.println(m1);
		
	}

	public static void main(String[] args) {
		String[] s1={"goa","kerala","gujarat"};
		putvalues(s1);
		
	}

}
