package MultipleDimensionalArray;

public class ArraymatrixMultiplication {
	public static void main(String[] args) {
		//create matrix
		int a[][]= {{2,3,2},{4,2,7},{3,6,8}};
		int b[][]= {{6,6,6},{3,7,1},{4,2,1}};
		//for storing result creating another matrix
		int c[][]=new int [3][3];
		//logic and printing
		for(int i=0;i<3;i++) {//printing row
			for(int j=0;j<3;j++) {//printing column
				c[i][j]=0;
				for (int k=0;k<3;k++) {
				c[i][j]+=a[i][k]*b[k][j];}
				System.out.print(c[i][j]+" ");
				
				
			}
			System.out.println();
		}

}}
