package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao = 1;

        while (acao > 0) {
            System.out.println("-------------- Operação Matemática Simples --------------");

            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite a operação: ");
            char operacao = scanner.next().charAt(0);
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            System.out.println(String.format("Você quer fazer a operação %d %c %d", numero1, operacao, numero2));
            int resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
            ArrayList<String> historico = new ArrayList<String>();
            String entradaDoHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
            historico.add(entradaDoHistorico);

            System.out.println(entradaDoHistorico);

        }


        scanner.close();
    }
}
