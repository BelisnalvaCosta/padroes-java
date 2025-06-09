package com.santander.dio;

import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();

        // Saudação por horário
        String saudacao;
        if (hora >= 5 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        // Entrada de dados
        System.out.println(saudacao + ", seja bem-vindo ao Bootcamp Santander!");
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        // Mensagem por faixa etária
        String mensagemIdade;
        if (idade < 18) {
            mensagemIdade = "Você está começando sua jornada, aproveite os aprendizados!";
        } else if (idade <= 30) {
            mensagemIdade = "Excelente fase para crescer profissionalmente!";
        } else if (idade <= 50) {
            mensagemIdade = "Sua experiência é um grande diferencial.";
        } else {
            mensagemIdade = "O conhecimento acumulado é um tesouro. Continue compartilhando!";
        }

        // Exibe mensagem final
        System.out.printf("%s, %s! %s\n", saudacao, nome, mensagemIdade);
    }
}