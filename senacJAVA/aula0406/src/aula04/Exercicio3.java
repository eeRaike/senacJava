
package aula04;
import java.util.Scanner;

public class Exercicio3 {
 public static void main(String[] args){
   //Declaração de variaveis
    
    double tempCel = 0.0;
    double tempFah = 0.0;
    Scanner readKeyboard = new Scanner(System.in);
    //Adquirir dados de usuário
     System.out.println("Digite a temperatura em °F > ");
     tempFah = readKeyboard.nextDouble();
    //Processamento dos dados
    tempCel = (5 * (tempFah - 32)) / 9;
    //Apresentar resultado
     System.out.println("A temperatura digitada em °C será de > " + tempCel);
    
    
    
 }
}
