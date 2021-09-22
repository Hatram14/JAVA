package fjs.com.baitap;

public class TongThuaSoNguyTo {
	public static void main(String[] args){
	    System.out.println(factorSum(4));
	}

	public static int factorSum(int n) {
		int sum = factor(n);
		while (sum != factor(sum)) {
			sum = factor(sum);
		}
		return sum;
	}

	public static int factor(int n) {
		int i = 2;
		int sum = 0;
		while (n > 1) {
			if (n % i == 0) {
				n = n / i;
				sum = sum + i;
			} else {
				i++;
			}
		}
		return sum;
	}
}
