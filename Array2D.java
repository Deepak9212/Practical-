package MultipleDimensionalArray;
//multidimensional Array
public class Array2D {
	public static void main(String[] args) {
		//declaring & initialization 2D array
		int arr[][]= {{3,5,4},{7,5,7}};
		for (int i=0;i<2;i++) {//for printing row
			for(int j=0;j<3;j++) {//for printing column
				System.out.println(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
