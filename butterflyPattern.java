package PatternSolution;

import java.util.Scanner;

public class butterflyPattern {
    public static void patternButterfly(int num) {
    	for(int i=0;i<num;i++) {
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		for(int j=i;j<num;j++) {
    			System.out.print(" ");
    		}
    		for(int j=i;j<num;j++) {
    			System.out.print(" ");
    		}
    		
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	
    	for(int i=0;i<=num;i++) {
    		for(int j=i;j<=num;j++) {
    			System.out.print("*");
    		}
    		
    		for(int j=0;j<i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=0;j<i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=i;j<=num;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    		}
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		patternButterfly(num);
	}
}
