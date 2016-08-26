import java.util.*;
class Box
{
public static void main(String args[])
{
	int n,q,i;
	int entry=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of boxes");
n=sc.nextInt();
Map<Integer,String> mp=new HashMap<Integer, String>();
for(int j=1;j<=n;j++)
{
	System.out.println("Enter no of chocolates in box " +j);
	entry+=sc.nextInt();
	mp.put(j,String.valueOf(entry));
}

System.out.println("Enter no of queries");
q=sc.nextInt();
here : for(int k=0;k<q;k++)
{
	System.out.println("Enter the required index");
	i=sc.nextInt();
	for(Integer Key : mp.keySet())
	{
		
		int val=Integer.parseInt(mp.get(Key));
		if(i<=val)
		{
			System.out.println(Key);
		 		 continue here;
		}
	}
}


}
}