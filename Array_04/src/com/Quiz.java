package com;

public class Quiz {

		    public static void main(String[] args) {
		        long i=1;
		        long count=0;
		        for(count=0; count<=10; count++, i*=10) {
		        	System.out.println("10^"+String.format("%2d", count)+"="+String.format("%11d", i));
		        }
		    }
}