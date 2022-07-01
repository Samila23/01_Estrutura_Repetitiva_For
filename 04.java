// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n , i , a , b , c , media;
		
		System.out.println("Digite o numero de casos que serão realizados os testes ");
		n = sc.nextDouble();
		
		
		for (i = 0 ; i < n ; i++) {
			System.out.println("Digite os valores, para realização da media ponderada ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			media = ((a * 2) + (b*3) + (c*5)) / (2+3+5);
			System.out.printf("A média ponderada é : %.1f%n ",media );
			
		}
}
}
