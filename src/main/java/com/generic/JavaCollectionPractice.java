package com.generic;

public class JavaCollectionPractice {
   public void getswap (int a, int b) {
	   
              
	   System.out.println("A value before swap ="+a);
       System.out.println("B value before swap ="+b);
	   
	   
	                  a = a+b;
                      b = a-b;
                      a = a-b;
            System.out.println("A value after swap ="+a);
            System.out.println("B value after swap ="+b);
   }


     public static void main(String[] args) {
    	 JavaCollectionPractice obj = new JavaCollectionPractice();
    	 obj.getswap(10, 20);

     
     }
}
