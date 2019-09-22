package practice;

import java.util.ArrayList;

public class SET3Q9 {

	public static void getcount(String[] ip)
	{
		int op=0;
		ArrayList<String> al=new ArrayList<String>();
		for(String s:ip)
		{
			
			if(s.startsWith("10")&& s.length()>2||s.startsWith("01") && s.length()>2)
			{
				al.add(s);
			}
		}
		op=al.size();
		System.out.println(op);
	}
	
	
	public static void main(String[] args) {
	String[] ip={"01","01010","1000","10","011"};
	getcount(ip);
	
	}

}
