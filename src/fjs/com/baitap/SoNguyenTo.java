package fjs.com.baitap;

public class SoNguyenTo {
	public static boolean isPrime(int n) {
	    int s = 0;
	    if(n<=1){
	        return false;
	    }
	    for(int i = 2; i<n; i++){
	        if(n%i == 0){
	           s++;
	        }
	    }
	    if (s==0){
	        return true;
	    }
	    return false;
	}
	public static void main(String[] args){
	    if(isPrime(4)) {
	    	System.out.println("đúng");
	    }else {
	    	System.out.println("sai");
	    }
	}
}
