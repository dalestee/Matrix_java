package Main;

/*
Manque à implémenter:

-Produit matriciel

 */
public class Matrix {
	private int[][] matrix;
	
	public Matrix(int x,int y) {
		this.matrix = new int[x][y];
	}

	public Matrix(int x,int y, int[] valuesArray) {
		if (valuesArray.length != x*y) {
			System.out.println("Error creation");
			System.exit(1);
		}
		int counter = 0;
		this.matrix = new int[x][y];
		for (int i=0;i<x;i++) {
			for (int j=0;j<y;j++) {
				this.matrix[i][j] = valuesArray[counter];
				counter ++;
			}
		}
	}
	
	public void insertValue(int value, int x, int y) {
		this.matrix[x][y] = value;
	}
	
	public int matrixNumberLines() {
		int counter = 0;
		
		for (int[] line : this.matrix) {
			counter++;
		}
		return counter;
	}
	
	public int matrixNumberColumns() {
		int counter = 0;
		
		for (int column : this.matrix[0]) {
			counter++;
		}
		return counter;
	}
	
	public boolean matrixCanMultiply(Matrix matrix2) {
		if (this.matrix[0].length != matrix2.matrix.length) {
			return false;
		}
		return true;
	}
	
	public Matrix matrixMultiplication(Matrix matrix2) {
		if (!this.matrixCanMultiply(matrix2)) {
			System.out.println("Error, Multiplication not possible");
			System.exit(1);
		}
		int sum = 0;
		Matrix produit = new Matrix(this.matrix[0].length, matrix2.matrix.length);
		for (int i=0;i<this.matrix[0].length;i++) {
			for (int j=0;j<matrix2.matrix.length;j++) {
				sum = 0;
				sum = this.matrix[i][j]*matrix2.matrix[j][i];
				produit.insertValue(sum, i, j);
			}
		}
		return produit;
	}
	
	public void printMatrix() {
		for (int i=0;i<this.matrix.length;i++) {
			for (int j=0;j<this.matrix[0].length;j++) {
				if (this.matrix[i][j]<10) {

					System.out.print(this.matrix[i][j]);
				}
				else {
					System.out.print(this.matrix[i][j]);
				}
			}
			System.out.println("\n");
		}
	}
}