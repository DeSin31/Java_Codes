import java.util.*;
class Pangram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str = sc.nextLine();
str = str.toLowerCase().replaceAll(" ", "");

        char[] a = str.toCharArray();
        Set store = new HashSet();

        for(char c: a){
            store.add(c);
        }
        if(store.size() == 26)
           System.out.println("pangram");
        else
            System.out.println("not pangram");

}
}