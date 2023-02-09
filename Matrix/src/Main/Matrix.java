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
	
	public boolean matrixIsBoolean() {
		for (int i=0;i<this.matrixNumberLines();i++) {
			for (int j=0;i<this.matrixNumberLines();i++) {
				if (this.matrix[i][j] != 0 && this.matrix[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int matrixNumberLines() {
		int counter = 0;
		
		for (@SuppressWarnings("unused") int[] line : this.matrix) {
			counter++;
		}
		return counter;
	}
	
	public int matrixNumberColumns() {
		int counter = 0;
		
		for (@SuppressWarnings("unused") int column : this.matrix[0]) {
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
	
	public void insertValue(int value, int x, int y) {
		this.matrix[x][y] = value;
	}
	
	public Matrix BooleanMatrixProduct(Matrix matrix2) {
		if (!this.matrixCanMultiply(matrix2)) {
			System.out.println("Error, Multiplication not possible");
			System.exit(1);
		}
		if ((!this.matrixIsBoolean())||(!matrix2.matrixIsBoolean())) {
			System.out.println("Error, One of the matrixes are not boolean)");
			System.exit(1);
		}
		int sum = 0;
		Matrix product = new Matrix(this.matrixNumberLines(), matrix2.matrixNumberColumns());
		for (int i=0;i<this.matrixNumberLines();i++) {
			for (int j=0;j<matrix2.matrixNumberColumns();j++) {
				sum=0;
				for (int k=0;k<this.matrixNumberColumns();k++) {
					sum += this.matrix[i][k]*matrix2.matrix[k][j];
				}
				if (sum>0) {
					product.insertValue(1, i, j);
				}
				else {
					product.insertValue(0, i, j);
				}
			}
		}
		return product;
	}
	
	public boolean equalsTo(Matrix matrix2) {
		if(this.matrixNumberLines()!=matrix2.matrixNumberLines()||(this.matrixNumberColumns()!=matrix2.matrixNumberColumns())) {
			return false;
		}
		for (int i=0;i<this.matrixNumberLines();i++) {
			for (int j=0;j<this.matrixNumberColumns();j++) {
				
				if (this.matrix[i][j]!=matrix2.matrix[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Matrix matrixMultiplication(Matrix matrix2) {
		if (!this.matrixCanMultiply(matrix2)) {
			System.out.println("Error, Multiplication not possible");
			System.exit(1);
		}
		int sum = 0;
		Matrix product = new Matrix(this.matrixNumberLines(), matrix2.matrixNumberColumns());
		for (int i=0;i<this.matrixNumberLines();i++) {
			for (int j=0;j<matrix2.matrixNumberColumns();j++) {
				sum=0;
				for (int k=0;k<this.matrixNumberColumns();k++) {
					sum += this.matrix[i][k]*matrix2.matrix[k][j];
				}
				product.insertValue(sum, i, j);
			}
		}
		return product;
	}
	
	@Override
	public String toString() {
		String string = new String("");
		for (int i=0;i<this.matrix.length;i++) {
			for (int j=0;j<this.matrix[0].length;j++) {
				string += String.valueOf(this.matrix[i][j]);
			}
			string += "\n";
		}
		return string;
	}
}