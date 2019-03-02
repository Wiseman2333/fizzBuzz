package org.ken.fizzBuzz;

public class IdentifyFizzBuzz {

	/**
	 * solution of stage 1.
	 */
	public void identify_stage1(){
		for(int num = 1 ; num <= 100 ; num ++){
			if(!isDivisibleBy3(num) && !isDivisibleBy5(num)){
				System.out.println(num);
			}else if(isDivisibleBy3(num) && isDivisibleBy5(num)){
				System.out.println("FizzBuzz");
			}else if(isDivisibleBy3(num)){
				System.out.println("Fizz");
			}else{
				System.out.println("Buzz");
			}
		}
	}
	
	/**
	 * solution of stage 2.
	 */
	public void identify_stage2(){
		for(int num = 1 ; num <= 100 ; num ++){
			if(!isDivisibleBy3(num) && !isDivisibleBy5(num) && !has3(num) && !has5(num)){
				System.out.println(num);
			}else if((isDivisibleBy3(num) || has3(num)) && (isDivisibleBy5(num) || has5(num))){
				System.out.println("FizzBuzz");
			}else if(isDivisibleBy3(num) || has3(num)){
				System.out.println("Fizz");
			}else{
				System.out.println("Buzz");
			}
		}
	}
	
	/**
	 * check if num is divisibleBy 3
	 * 
	 * @param num
	 * @return
	 */
	private boolean isDivisibleBy3(int num){
		return num % 3 == 0;
	}
	
	/**
	 * check if num is divisibleBy 5
	 * 
	 * @param num
	 * @return
	 */
	private boolean isDivisibleBy5(int num){
		return num % 5 == 0;
	}
	
	/**
	 * check if num has a 3
	 * 
	 * @param num
	 * @return
	 */
	private boolean has3(int num){
		int lastDigit;
		while(num > 0){
			lastDigit = num % 10;
			if(lastDigit == 3){
				return true;
			}else{
				num /= 10;
			}
		}
		return false;
	}
	
	/**
	 * check if num has a 5
	 * 
	 * @param num
	 * @return
	 */
	private boolean has5(int num){
		int lastDigit;
		while(num > 0){
			lastDigit = num % 10;
			if(lastDigit == 5){
				return true;
			}else{
				num /= 10;
			}
		}
		return false;
		}
}
