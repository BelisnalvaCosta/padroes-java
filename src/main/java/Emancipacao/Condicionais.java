package Emancipacao;

import java.time.LocalTime;
import java.util.Scanner;

public class Condicionais {

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
        System.out.println(saudacao + ", seja bem-vindo(a) a este mundo emocionante da TI!");
        System.out.print("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você é emancipado(a)? (S/N): ");
        boolean isEmancipado = scanner.next().equalsIgnoreCase("s");

        // Verifica se pode dirigir
        String permissao;
        if (idade >= 18 || isEmancipado) {
            permissao = "Você pode dirigir.";
        } else {
            permissao = "Você ainda não pode dirigir.";
        }

        // Mensagem por faixa etária
        String mensagemIdade;
        if (idade >= 60) {
            mensagemIdade = "É ótimo chegar a essa idade com tanto conhecimento acumulado. Continue inspirando os demais!";
        } else if (idade >= 30) {
            mensagemIdade = "Sua experiência é valiosa. Continue contribuindo e crescendo!";
        } else if (idade >= 18) {
            mensagemIdade = "Você tem autonomia e está em uma fase excelente para aprender e evoluir.";
        } else if (idade >= 16 && isEmancipado) {
            mensagemIdade = "Mesmo jovem, sua emancipação mostra responsabilidade. Continue assim!";
        } else {
            mensagemIdade = "Você está no caminho certo. Com dedicação, seu futuro será promissor!";
        }

        // Mensagem final formatada
        System.out.printf("\n%s, %s!\n%s\n%s\n", saudacao, nome, permissao, mensagemIdade);

        scanner.close();
    }
}
