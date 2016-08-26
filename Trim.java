import java.util.*;
public class Trim
{
public static void main(String args[])
{
Character c1, c2;
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the test string");
StringBuilder str  = new StringBuilder(sc.nextLine());
while(i<str.length()-1)
{

      c1 = new Character(str.charAt(i));
      c2 = new Character(str.charAt(i+1));
	if(c1.compareTo(c2)==0)
	{
		str.deleteCharAt(i+1);
		str.deleteCharAt(i);
		i=0;
	}
	else
	i++;
}

if(str.toString().isEmpty())
{
	System.out.println("Empty String");
}
else
System.out.println(str);
}

}