package misc;

import java.util.ArrayList;
import java.util.Random;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
	
		System.out.println(ratio(1000));
	
		
		
	 
	}
	
	private static double ratio(int n){
		
	   //0:boy and 1:girl
		
	   double b_num = 0;
	   double g_num = 0;
		
	   
	   for(int i = 1;i <= n;i++) {
		   
		   while(true){
			   Random x = new Random();
			   int r = x.nextInt(2);
			  // System.out.println(r);
			   if(r == 1){
				   g_num++;
				   break;
			   }
			   else if(r == 0){
				   b_num++;
			   }
		   }
		   
	   }  
	   
	   if(b_num == 0) {
		   System.out.println("0 boys.");
		   return g_num;
	   }
	   System.out.println(g_num + "/" + b_num);
	   return g_num/b_num;
	   
	}
		
	
	}
	
	
