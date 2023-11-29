package PatternSolution;

import java.util.Scanner;

public class Pattern12 {
   public static void pattern12(int num) {
		//	int count=1;
			for(int row=1;row<=num;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(col);
					//System.out.print(count++);
				}
				System.out.println();
			}
			for(int row=1; row<=num;row++) {
				for(int space=num;space>row;space--) {
					System.out.print(" ");
				}
				for(int col=row;col>=1;col--) {
					System.out.print(col);
				}
				System.out.println();
			}
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num= sc.nextInt();
			pattern12(num);
		}

}
