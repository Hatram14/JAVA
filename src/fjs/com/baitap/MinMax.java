package fjs.com.baitap;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        n = scanner.nextInt();
        a = new int[n];
        nhap(a,n);
       //In ra Min, Max
        System.out.println("Min: " + min(a,n));
        System.out.println("Max: " + max(a,n));
        scanner.close();
       
    }
    public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
    }
    public static int min(int a[],int n){
        int min = a[0];
        for (int i=1;i<n;i++){
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static int max(int a[],int n){
        int max = a[0];
        for (int i=1;i<n;i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}

