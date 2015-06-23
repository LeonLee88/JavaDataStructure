package CCI150;

public class MatrixRotate {
	public static void main(String[] argv) {
		int matrix[][] = new int [][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int row = matrix.length;
		
			for (int j = 0; j <= row/2; j++) {
				int i = row-j-1;
				for (int k = 0; k < i; k++) {
					int tmp1 = matrix[j+k][i];
					matrix[j+k][i] = matrix[j][j+k];
					int tmp2 = matrix[i][i-k];
					matrix[i][i-k] = tmp1;
					int tmp3 = matrix[i-k][j];
					matrix[i-k][j] = tmp2;
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
