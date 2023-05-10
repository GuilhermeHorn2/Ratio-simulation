package misc;

import java.util.ArrayList;
import java.util.Random;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		
	Bottle[] v = new Bottle[1000];
	for(int i = 0;i < 1000;i++) {
		v[i] = new Bottle();
	}
		
		
	 
	}
	
	private void set_bottles(Bottle[] v){
		
		//set poison randomly between 1-1000
		Random x = new Random();
		int r = x.nextInt(1000);
		v[r].set_poison();
	}
	
	private int test_range(int strt,int end,Bottle[] v) {
		
		for(int i = strt;i <= end;i++){
			if(v[i].get_poison() == 1) {
				return 1;
			}
		}
		return 0;
	}
	
	private int find_poison(Bottle[] v){
		set_bottles(v);
		
		int tests = 0;
		
		//i want to search the poison thinking about the digits of the number:
		
		if(v[1000].get_poison() == 1) {
			return 1000;
		}
		else {
			
			int lower = 0;
			int upper = 0;
			for(int i = 0;i < 10;i++){
			if(i == 0){
				lower++;
				upper += 99;
				if(test_range(lower,upper,v) == 1){
					break;
				}
			}
			else if(i != 0){
				lower = upper+1;
				upper = lower+99;
				
				if(test_range(lower,upper,v) == 1) {
					//I found the first limit
					break;
				}
			}
			}
			
			int a = 0;
			int b = 0;
			for(int i = 0;i < 10;i++){
				if(i == 0){
					b = 9;
					if(test_range(lower,lower+b,v) == 1){
						upper = lower+b;
						break;
					}
					else if(i != 0){
						lower = lower+b+1;
						if(test_range(lower,lower+b,v)== 1) {
							upper = lower+b;
							break;
						}
					}
				}
			}
			
			//Now i can test individually
			
			for(int i = lower;i <= upper;i++) {
				if(v[i].get_poison() == 1) {
					return i;
				}
			}
			
		}
		return -1;
		
		
	}
	
	
	}
	
	
