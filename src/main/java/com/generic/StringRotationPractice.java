package com.generic;

public class StringRotationPractice {
	
	String country = "United States Of America";
	
	       void getValue() {
		for(int i=(country.length()-1);i>=0;i--){
	            // System.out.print(i);
		System.out.print(country.charAt(i));
		}
	}
	   
	
	
	public static void main(String[] args) {
		StringRotationPractice obj = new StringRotationPractice();
		         obj.getValue();
	}
}