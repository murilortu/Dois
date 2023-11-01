package Colecoes_parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class separar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        while (true) {
            System.out.print("Informe o nome (ou digite 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Informe o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer de entrada

            if (sexo == 'M' || sexo == 'm') {
                nomesMasculinos.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino e 'F' para feminino.");
            }
        }

        System.out.println("\nNomes no grupo masculino:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        
        System.out.println("\nNomes no grupo Feminino:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}

