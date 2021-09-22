package fjs.com.baitap;

import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Nhập vào chuỗi: ");
	   int number1 = sc.nextInt();
	   int number2 = sc.nextInt();
	   String str = sc.next();
	   count(number1,number2,str);
	   sc.close();
}
   public static void count(int a,int b, String str){
      switch(str) {
        case "cong":
        	System.out.println(a+b); 
        	break;
	    case "tru":
	    	System.out.println(a-b); 
        	break;
	    case "nhan":
	    	System.out.println(a*b); 
        	break;	
	    case "chia":
	    	if(b==0) {
	    		System.out.println("Số b phải khác 0");
	    	} else {
	    		System.out.println( (float)a/b);
	    	}
	    	break;
        default:
          System.out.println("Not Valid String");
      }
   }   
}
