package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        System.out.print("Digite uma mensagem: ");
        String mensagem = scanner.next();
        System.out.println(mensagem);*/

        // int numero1 = Integer.parseInt(scanner.nextLine()); - Isso aqui é um Cast
/*        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite a operação: ");
        char operacao = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println(String.format("Você quer fazer a operação %d %c %d", numero1, operacao, numero2));*/

        String nome = scanner.nextLine();
        int numero = scanner.nextInt();
        System.out.println(nome);
        System.out.println(numero);

        scanner.close();

    }
}
