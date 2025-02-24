
import java.util.Scanner;

public class ex02{
    public static void main(String[] arg){
        Scanner scanner = new Scanner (System.in);

    System.out.printf("Digite o comprimento da piscina (m):");
    double comprimento = scanner.nextDouble();
    System.out.printf("Digite a largura (m):");
    double largura = scanner.nextDouble();
    System.out.printf("Digite a profundidade (m):");
    double profundidade = scanner.nextDouble();
    //calcular volume 
    double volume = comprimento * largura * profundidade;
    //calculo do valor total
    double valor = volume * 100.00;
    //resultado
    System.out.format("O valor da construção é R$%.2f%n",valor);
    scanner.close();

    }
}