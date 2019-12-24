package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m;
		int n;
		
		System.out.print("Digite os parâmetros da matriz: ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.print("Indique um número de referência: ");
		int r = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				if (r == matriz[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (j < matriz.length) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (i < matriz[i].length) {
						System.out.println("Down: " + matriz[i+1][j]);
					}	
					System.out.println();
					
				}
				
				
				
				
				
			}
		}		
		
		sc.close();

	}

}
