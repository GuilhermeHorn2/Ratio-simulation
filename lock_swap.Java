package misc;

import java.util.ArrayList;
import java.util.Random;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
	
	 System.out.println(lockers_open(100));
	
		
		
	 
	}
	private static int lockers_open(int n){
		//start locked then someone open all,so its like an array of 1s
		//at each ith pass this person will lock every ith locker
		
		//I will start if 2,because 1 will be open anyway
		//0 --> locked,1 --> open,an even number of swaps-->+1 open
		
		int num = 1;//start with 1 to count locker 1
		
		for(int i = 2;i <= n;i++){
			int count = 0;
			for(int j = 1;j <= i/2;j++){
				if(i % j == 0){
					count++;
				}
			}
			if(count % 2 == 0){
				num++;
			}
		}
		return num;
		
	}
	
	}
	
	
