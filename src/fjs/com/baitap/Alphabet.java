package fjs.com.baitap;

public class Alphabet {
    public static void main(String[] args) {
    	System.out.print("Chuỗi được tạo là: ");
		System.out.println(Solution(1, 0, 6));
	}
    public static String Solution(int a, int b, int c) {
    	StringBuilder strBuilder = new StringBuilder();
    	int total = a + b + c;
    	int currentA = 0;
    	int currentB = 0;
    	int currentC = 0;
    	
    	for(int i = 0; i <= total; i++) {
    		if((a > 0 && a >= b && a >= c && currentA !=2) || (a > 0 && (currentB ==2 || currentC ==2))){
    			strBuilder.append("a");
    			currentA++;
    			currentB = 0;
    			currentC = 0;
    			a--;
    		}else if((b > 0 && b >= a && b >= c && currentB !=2) || (b > 0 && (currentA ==2 || currentC ==2))){
    			strBuilder.append("b");
    			currentB++;
    			currentA = 0;
    			currentC = 0;
    			b--;
    		}else if((c > 0 && c >= b && c >= a && currentC !=2) || (c > 0 && (currentA ==2 || currentB ==2))){
    			strBuilder.append("c");
    			currentC++;
    			currentA = 0;
    			currentB = 0;
    			c--;
    		}
    	}
    	return strBuilder.toString();
    }
}
