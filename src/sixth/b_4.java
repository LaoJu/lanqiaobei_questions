package sixth;

import java.util.Vector;

public class b_4 {
	
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();		
		for(;;)
		{	
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)  
				return v.size()-v.indexOf(n);
		}
	}	
	public static void main(String[] args)
	{
		System.out.println(f(1, 8));
		System.out.println(f(8, 3));
		System.out.println(f(11, 13));
		System.out.println(f(39, 190));
	}
}
