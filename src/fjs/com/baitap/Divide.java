package fjs.com.baitap;

import java.util.Scanner;

public class Divide {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      System.out.println("Nhap so nguyen n: ");
      int n = sc.nextInt();
      checkDivide(n);
      sc.close();
}
  public static void checkDivide(int n) {
	  if (n%3==0 && n%5==0) {
		  System.out.println("Chia hết cho 3 và 5");
	  }else if(n%3==0) {
		  System.out.println("Chia hết cho 3");
	  }else if(n%3==0){
		  System.out.println("Chia hết cho 5");
	  }else {
		  System.out.println(n);
	  }
  }
}
