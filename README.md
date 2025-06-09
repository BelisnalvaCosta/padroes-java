# 🧩 Padrões-Java  

Projeto feito na **IDE IntelliJ IDEA**

## 🧠 Conceitos aplicados no projeto

### ✅ Importações de bibliotecas

import java.util.Scanner;
import java.time.LocalTime;
Essas linhas trazem ferramentas prontas da linguagem Java:

Scanner: serve para ler dados digitados pelo usuário.

LocalTime: permite obter a hora atual do sistema.

✅ Entrada de dados

Scanner scanner = new Scanner(System.in);
O leitor de teclado chamado scanner é usado para capturar nome e idade.

✅ Obter a hora do dia

LocalTime horaAtual = LocalTime.now();
int hora = horaAtual.getHour();
LocalTime.now() obtém a hora completa do sistema.

getHour() extrai apenas a hora em número (0 a 23).

✅ Condicional (if-else)

if (hora >= 5 && hora < 12) {
    saudacao = "Bom dia";
}
O Java verifica a hora atual e escolhe a saudação correta com estruturas if, else if e else.

✅ Leitura e decisão com base na idade

int idade = scanner.nextInt();
Com base na idade informada, o sistema exibe uma mensagem personalizada, também utilizando if-else.

✅ Saída formatada

System.out.printf("%s, %s! %s\n", saudacao, nome, mensagemIdade);
O printf é usado para mostrar uma mensagem formatada com variáveis (como nome e idade).

🔄 Diferença entre println, print e printf
Comando	O que faz	Exemplo	Comportamento
println()	Mostra a mensagem e pula para a próxima linha	System.out.println("Olá");	Mostra "Olá" e o cursor vai para baixo
print()	Mostra a mensagem sem pular de linha	System.out.print("Digite: ");	Mostra e espera na mesma linha
printf()	Mostra mensagens formatadas com variáveis	System.out.printf("Olá %s", nome);	Usa %s, %d, etc., e não pula linha automaticamente

💡 Dica para iniciantes:
Use println() para mensagens simples e diretas.

Use print() quando quiser manter o cursor na mesma linha.

Use printf() quando precisar inserir variáveis dentro do texto com mais controle visual.

[^1]: Projeto criado com base na aula do professor José Luiz A. C. Júnior (DIO) ↩
