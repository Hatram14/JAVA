package fjs.com.baitap;

import java.util.Set;
import java.util.TreeSet;

public class SoNguyToChungLonNhat {
   
	public static void main(String[] args) {
		System.out.println(Chung(30, 3));
	}
	public static int Chung(int a, int b) {
		//tạo 1 treeset để lưu các phần tử tăng dần
		Set<Integer> listNumber = new TreeSet<Integer>();
		//thêm các số nguyên tố chia hết cho a vào set
        for(int i=2; i<=a; i++) {
        	while(a%i==0) {
        		listNumber.add(i);
        		a/=i;
        	}
        }
        int number = -1;
        //b chia cho tưng phần tử trong set
        for(int x: listNumber) {
        	if(b%x==0) {
        		number = x;
        	}
        }
        return number;
	}
}
