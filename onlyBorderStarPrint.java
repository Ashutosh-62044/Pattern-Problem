package PatternSolution;

public class onlyBorderStarPrint {
    public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i-1;k++) {
				if(k==1 || k==2*i-1) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i-1;k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
    }	

