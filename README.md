# Padrões-java

Projeto feito na IDEA IntelliJ [^1]

🧠 Conceitos aplicados no projeto
1. Importações de bibliotecas
import java.util.Scanner;
import java.time.LocalTime;
Essas linhas trazem ferramentas prontas da linguagem Java:
•	Scanner serve para ler dados digitados pelo usuário.
•	LocalTime pega a hora atual do sistema.
________________________________________
2. Entrada de dados
Scanner scanner = new Scanner(System.in);
O leitor de teclado chamado scanner, é usado para capturar nome e idade.
________________________________________
3. Obter a hora do dia
LocalTime horaAtual = LocalTime.now();
int hora = horaAtual.getHour();
O LocalTime.now() é usado para pegar a hora atual, e com getHour()é obtida apenas a hora numérica (0 a 23).
________________________________________
4. Condicional (if-else)
if (hora >= 5 && hora < 12) {
    saudacao = "Bom dia";
}
O Java vai verificar condições e escolher a saudação correta conforme o horário. Isso é feito com estruturas de decisão if, else if e else.
________________________________________
5. Leitura e decisão com base na idade
int idade = scanner.nextInt();
O usuário digita a idade, e com base nela, é mostrada uma mensagem personalizada com outro if-else.
________________________________________
6. Saída formatada
System.out.printf("%s, %s! %s\n", saudacao, nome, mensagemIdade);
O printf mostra uma mensagem formatada com variáveis (saudação, nome e mensagem).
________________________________________
🔄 Diferença entre println, print e printf
Comando	O que faz	Exemplo de uso	Comportamento
println()	Mostra a mensagem e pula para a próxima linha	System.out.println("Olá");	Mostra "Olá" e o cursor vai para a linha seguinte
print()	Mostra a mensagem sem pular de linha	System.out.print("Digite seu nome: ");	Ideal para mensagens que esperam algo na mesma linha
printf()	Mostra mensagens formatadas, inserindo variáveis	System.out.printf("Olá %s", nome);	Usa %s, %d, etc., e não pula de linha automaticamente
________________________________________
💡 Dica para iniciantes:
•	Use println() para mensagens simples.
•	Use print() quando quiser manter o cursor na mesma linha.
•	Use printf() quando quiser mostrar variáveis no meio de um texto com mais controle.

[^1]: Projeto criando com base na aula do professor José Luiz A. C. Júnior (DIO)
