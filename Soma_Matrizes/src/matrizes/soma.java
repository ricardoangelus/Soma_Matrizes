package matrizes;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] mat = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] mat3 = new int[3][3];
		int i,j;
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.println("Digite um número (Matriz 1): ");
				mat[i][j]=scan.nextInt();
			}
		}
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.println("Digite um número (Matriz 2): ");
				mat2[i][j]=scan.nextInt();
			}
		}
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println(" ");
		}
			System.out.println("\nSoma das Matrizes:");
		//soma das matrizes
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				mat3[i][j] = ((mat[i][j])+(mat2[i][j]));
			System.out.print(mat3[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}


