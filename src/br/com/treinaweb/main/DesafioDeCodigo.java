package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioDeCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> numeroFatorial = new ArrayList<Integer>();
        numeroFatorial.add(N);

        for (int i = N; i < numeroFatorial.; i--) {
            N = numeroFatorial.size() * (N-1);
        }
        System.out.println(N);
    }
}
