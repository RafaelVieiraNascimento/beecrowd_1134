package program;

/*
beecrowd | 1134 - Tipo de Combustível

Um Posto de combustíveis deseja determinar qual de seus produtos tem
a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe
um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes
que abasteceram cada tipo de combustível, conforme exemplo.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (menu != 4) {

			menu = sc.nextInt();

			switch (menu) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				menu = 4;
				break;
			}
		}
		
		System.out.printf("MUITO OBRIGADO\n"
				+ "Alcool: %d\n"
				+ "Gasolina: %d\n"
				+ "Diesel: %d\n"
				,alcool ,gasolina, diesel);
		sc.close();
	}
}
