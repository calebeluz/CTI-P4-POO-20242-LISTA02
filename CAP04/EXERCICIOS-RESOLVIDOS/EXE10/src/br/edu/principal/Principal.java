package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int d1, m1, a1, d2, m2, a2;

		        System.out.println("Digite a primeira data");
		        System.out.print("dia (dd): ");
		        d1 = scanner.nextInt();
		        System.out.print("mês (mm): ");
		        m1 = scanner.nextInt();
		        System.out.print("ano (aaaa): ");
		        a1 = scanner.nextInt();

		        System.out.println("Digite a segunda data");
		        System.out.print("dia (dd): ");
		        d2 = scanner.nextInt();
		        System.out.print("mês (mm): ");
		        m2 = scanner.nextInt();
		        System.out.print("ano (aaaa): ");
		        a2 = scanner.nextInt();

		        if (a1 > a2) {
		            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
		        } else if (a2 > a1) {
		            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
		        } else if (m1 > m2) {
		            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
		        } else if (m2 > m1) {
		            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
		        } else if (d1 > d2) {
		            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
		        } else if (d2 > d1) {
		            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
		        } else {
		            System.out.println("As datas são iguais!");
		        }

		    }
		}
