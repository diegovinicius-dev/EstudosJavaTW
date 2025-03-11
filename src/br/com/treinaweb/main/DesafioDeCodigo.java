package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioDeCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int fatorial = 1;

        if (N < 0) {
            System.out.println("Não existe fatorial para números negativos");
        } else {
            for (int i = 1; i <= N; i++) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }


    }
}
