package com.javaproject;

public class Reverse 
{
	   
	    public static void main(String[] args)
	    {    
	    	 String name = "RAFAT";    
	         String reverseStr = "";    
		         
		        for(int i = name.length()-1; i >= 0; i--){    
		            reverseStr = reverseStr + name.charAt(i);    
		        }    
		            
		        
		        System.out.println("Reverse of a string: " + reverseStr);    
		    }    
}
	       

