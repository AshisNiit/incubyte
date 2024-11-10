package com.incubyte.calculator;

public class Calculator {

	public static void main(String[] args) throws Exception {
		
		System.out.println(add("1,-5"));
	}
	
	public static int add(String numbers) throws Exception {
		int result = 0;
		
		String delimeter = ",";
		
		if(numbers.length()>3 && numbers.substring(0,2).contains("//")) {
			delimeter = String.valueOf(numbers.charAt(2));
			numbers= numbers.replace("//", "");
		}
		else if(!numbers.contains(",")) {
			delimeter = "";
		}
		numbers = numbers.replace("\\", "").replace("n", "");

		String[] nums = numbers.split(delimeter);
		
		if(nums.length < 1) {
			return 0;
		}
		
		for(int i=0; i<nums.length; i++) {
			
			int num = Integer.parseInt(nums[i].length()==0? "0":nums[i]);
			if(num<0) {
				throw new Exception("negative numbers not allowed "+ num);
			}
			result += Integer.parseInt(nums[i].length()==0? "0":nums[i]); 
		}
		
		return result;
	}

}
