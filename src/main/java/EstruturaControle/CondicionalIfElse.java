package EstruturaControle;

import java.time.LocalTime;
import java.util.Scanner;

public class CondicionalIfElse {

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
        if (idade >= 18 || isEmancipado) {
            System.out.printf("%s, %s, você tem %d anos e pode dirigir.\n", saudacao, nome, idade);
        } else {
            System.out.printf("%s, %s, você tem %d anos e ainda não pode dirigir.\n", saudacao, nome, idade);
        }

        // Mensagem por faixa etária
        String mensagemIdade;
        if (idade < 18 && isEmancipado) {
            mensagemIdade = "Você tem autonomia e está começando uma jornada incrível de aprendizados!";
        } else if (idade >= 18 && idade <= 30) {
            mensagemIdade = "Excelente fase para adquirir experiência e crescer profissionalmente!";
        } else if (idade <= 50) {
            mensagemIdade = "Sua experiência é valiosa. Compartilhe com os outros!";
        } else {
            mensagemIdade = "É ótimo chegar a essa idade com tanto conhecimento acumulado. Continue inspirando os demais!";
        }

        // Mensagem final
        System.out.printf("%s, %s!\n%s\n", saudacao, nome, mensagemIdade);

        scanner.close();
    }
}
// Estes códigos são para fins de estudos e a cada modulo o código vai melhorando.