package fjs.com.baitap;

public class StringPasswork {
    public static void main(String[] args) {
		if(checkStrongPassword("abc1")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
    public static boolean checkStrongPassword(String password) {
    	String p = "!@#$%^&*()_+";
    	boolean[] str = {false, false, false, false, false};
    	if(password.length()>=6) {
    		str[0] = true;
    	}
    	for(int i = 0; i<password.length(); i++) {
    		if(password.charAt(i)>=48 && password.charAt(i)<=57) {
    			str[1] = true;
    			continue;
    		}
    		if(password.charAt(i)>=97 && password.charAt(i)<=122) {
    			str[2] = true;
    			continue;
    		}
    		if(password.charAt(i)>=65 && password.charAt(i)<=90) {
    			str[3] = true;
    			continue;
    		}
    		if(p.indexOf(password.charAt(i))!=-1) {
    				str[4] = true;
        			continue;
    			}
    	}
    	for(boolean b:str) {
    		if(b==false) {
    			return false;
    		}
    	}
    	return true;
    }
}
