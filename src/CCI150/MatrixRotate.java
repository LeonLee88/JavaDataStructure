package CCI150;

public class MatrixRotate {
	public static void main(String[] argv) {
//		int matrix[][] = new int [][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },
//				{ 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		int matrix[][] = new int [][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15}, {16,17,18,19,20 }, {21,22,23,24,25} };
		int row = matrix.length;
		
			for (int j = 0; j <= row/2; j++) {
				int i = row-j-1;
				for (int k = 0; k < row-j*2-1; k++) {
					int tmp1 = matrix[j+k][row-j-1];
					matrix[j+k][row-j-1] = matrix[j][j+k];
					int tmp2 = matrix[row-j-1][row-j-1-k];
					matrix[row-j-1][row-j-1-k] = tmp1;
					int tmp3 = matrix[row-j-1-k][j];
					matrix[row-j-1-k][j] = tmp2;
					matrix[j][j+k] = tmp3;
				}
			}
			
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix.length;j++){
					System.out.print("\t\t" + matrix[i][j] + ",\t");
					
				}
				System.out.println("");
			}
			
	}
}
