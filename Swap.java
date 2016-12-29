import java.util.*;
class Swap
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int x,y;
System.out.println("Enter value of x");
x=sc.nextInt();
System.out.println("Enter value of y");
y=sc.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println("New value of x is " +x);
System.out.println("New value of y is " +y);
}
}