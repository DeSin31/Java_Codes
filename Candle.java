import java.io.*;
import java.util.*;

public class Candle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int max=0,count=1;
		System.out.println("Enter the number of candles");
        int n = sc.nextInt();
        int height[] = new int[n];
		System.out.println("Enter the heights of candles");
        for(int i=0; i < n; i++){
            height[i] = sc.nextInt();
			if(height[i]>max)
			max=height[i];
			else
				if(height[i]==max)
					count++;
        }
		System.out.println(count);
    }
}
