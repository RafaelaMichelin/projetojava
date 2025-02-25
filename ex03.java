
import java.util.Scanner;
public class ex03 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner (System.in);
        
    System.out.printf("Digite o comprimento do retangulo:");
    double comprimento = scanner.nextDouble();
    System.out.printf("Digite a largura do retangulo:");
    double largura = scanner.nextDouble();
//calculo da area 
double area = comprimento * largura;
//resultado
System.out.printf("A área do retângulo é de: %.2f%n", area);

scanner.close();

 }
}