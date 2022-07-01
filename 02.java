//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int  n , i , yes=0, no=0 , x ;
		
		System.out.println("Digite a quantidade de numeros que deseja comparar");
		n = sc.nextInt();
		
		System.out.println("Digite os numeros que deseja comparar");
		for (i=0 ; i < n ; i++) {
				x = sc.nextInt();
				if( x >= 10 && x <= 20) {
					yes = yes + 1;
				}
				
				else {
					no = no + 1;
				}
		}
		System.out.println( yes + " in");
		System.out.println( no + " out");
		sc.close();
}
}
