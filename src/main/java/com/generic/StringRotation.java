package com.generic;



public class StringRotation {
  
	String country = "United States Of America";
	
	public void getValue() {
   for (int i=(country.length()-1);i>=0;i--) {
   
   System.out.print(country.charAt(i));
   } 
	}
	 
	  

    public static void main(String[] args) {
		StringRotation obj = new StringRotation();
				obj.getValue();
    }

}
