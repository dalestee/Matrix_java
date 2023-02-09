package Main;

public class Main {
	public static void main(String[] args) {
		int[] tab = {1,0,0,0,1,0,0,0,1};
		Matrix matrixTest = new Matrix(3,3,tab);
		//Test PrintMatrix
		System.out.println("---------Test PrintMatrix---------");
		System.out.println(matrixTest);
		
		//Test
		System.out.println("---------Test matrixNumberLines---------");
		System.out.println(matrixTest.matrixNumberLines());
		
		System.out.println("---------Test matrixNumberColumns---------");
		System.out.println(matrixTest.matrixNumberColumns());
		
		System.out.println("---------Test matrixCanMultiply---------");
		int[] tab1 = {1,0,2,4,6,8};
		Matrix matrix32 = new Matrix(3,2,tab1);
		System.out.println("test Matrix 33 with Matrix 32");
		System.out.println(matrixTest.matrixCanMultiply(matrix32));
		int[] tab2 = {1,0,2,4,6,8,1,0};
		Matrix matrix42 = new Matrix(4,2,tab2);
		System.out.println("test Matrix 33 with Matrix 42");
		System.out.println(matrixTest.matrixCanMultiply(matrix42));
		
		System.out.println("---------Test matrixMultiply---------");
		System.out.println("matrix1 : ");
		System.out.println(matrixTest);
		System.out.println("matrix2 : ");
		System.out.println(matrix32);
		System.out.println(matrixTest.matrixMultiplication(matrix32));
		
		System.out.println("---------Test matrixEquals---------");
		System.out.println("matrix1 : ");
		System.out.println(matrixTest);
		System.out.println("matrix2 : ");
		System.out.println(matrix32);
		System.out.println("Equals? "+" "+matrixTest.equalsTo(matrix32));
		System.out.println("matrix1 : ");
		System.out.println(matrix32);
		System.out.println("matrix2 : ");
		System.out.println(matrix32);
		System.out.println("Equals? "+" "+matrix32.equalsTo(matrix32));
		
		System.out.println("---------Test BooleanMatrixProduct---------");
		int[] tabB1 = {1,1,1,0,1,0,0,0,1};
		int[] tabB2 = {1,0,0,0,1,0,0,0,1};
		Matrix matrixBool1 = new Matrix(3,3,tabB1);
		Matrix matrixBool2 = new Matrix(3,3,tabB2);
		System.out.println("matrix1 : ");
		System.out.println(matrixBool1);
		System.out.println("matrix2 : ");
		System.out.println(matrixBool2);
		System.out.println("Produit : ");
		System.out.println(matrixBool1.BooleanMatrixProduct(matrixBool2));
	}
}
