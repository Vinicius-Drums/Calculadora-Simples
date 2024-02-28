// Importação da classe Scanner do pacote java.util para permitir a entrada do usuário
import java.util.Scanner;
// Declaração da Classe
public class App {
    public static void main(String[] args) throws Exception {
        // Objeto Scanner chamado leitor para entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // Solicita que o usuário insira o primeiro número
        System.out.println("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        // Solicita que o usuário insira o segundo número
        System.out.println("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        // Fecha o leitor para evitar vazamento de recursos
        leitor.close();

        // Operações matemáticas
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        // Verifica se o segundo número é zero para evitar divisão por zero
        if (numero2 != 0) {
            double divisao = numero1 / numero2;
            double resto = numero1 % numero2;

            // Imprime os resultados
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Multiplicação: " + multiplicacao);
            System.out.println("Divisão: " + divisao);
            System.out.println("Resto da divisão: " + resto);
        } else {
            // Mensagem de erro se o segundo número for zero
            System.out.println("Não foi possível realizar a divisão por zero. Insira um segundo número diferente de zero.");
        }
    }
}
