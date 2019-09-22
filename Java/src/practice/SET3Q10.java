package practice;

import java.util.ArrayList;

/*input1=1 ,input2=2 ,input3=3 --- output=6;
    input1=1 ,input2=13,input3=3 --- output=1;
    input1=13,input2=2 ,input3=8 --- output=8;
    if value equal to 13,escape the value '13', as well as the next value to 13.
    sum the remaining values*/
//
public class SET3Q10 {

	public static void input(int ip1,int ip2,int ip3)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(ip1);
		al.add(ip2);
		al.add(ip3);
		int s=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)!=13)
			s=s+al.get(i);
			else
				i=i+1;
			
		}	
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		int ip1=1,ip2=2,ip3=13;
		input(ip1,ip2,ip3);

	}

}
