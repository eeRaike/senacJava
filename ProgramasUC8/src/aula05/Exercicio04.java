
package aula05;

import java.util.Scanner;



/* Estruturas condicionais:
implemente um programa que ao receber as informações de  consumo de combustível 
em litros e distância per-corrida por um automóvel, faça a classificação de 
acordo com as definições abaixo:
Média de consumo >= a 15km/l = 'Carro Economico'
Média de consumo > 8 && < 15 km/l = 'Carro Razoável'
Média menor que < 8km/l - 'Venda o carro imediatamente'
*/

public class Exercicio04 {
    public static void main(String[] args) {
    //Declaração de variáveis
    double distance = 0.0;
    double combConsume = 0.0;
    double mediaConsume = 0.0;
    Scanner readKeyboard = new Scanner(System.in);
    showResult showResult = new showResult();
    ClassifiMedia classificarMedia = new ClassifiMedia();
    //Adquirir dados de usuário
        System.out.println("Informe a distancia percorrida(km)> ");
        distance = readKeyboard.nextDouble();
        System.out.println("Informe o consumo (litros)");
        combConsume = readKeyboard.nextDouble();
        
    //Processamento das informações
    
    mediaConsume = mediaConsumeCal(distance,combConsume);
    
      
    //Apresentar os dados de usuário
    
    //Acesso a metodos de classes internas
    //mediaConsume = mediaConsumeCal(distance,combConsume);
    //System.out.println("Consumo médio do veiculo " + mediaConsume + "km/l");
    //Acesso a classe externas
    showResult.showCarConsume(mediaConsume);
          
    /*if(mediaConsume >= 15){
        System.out.println("O seu carro é econômico :D");
    }else if(mediaConsume > 8 && mediaConsume < 15){
        System.out.println("Definitivamente um dos carros já feitos :I ");
    }else if(mediaConsume < 8){
        System.out.println("POR FAVOR VENDA SEU CARRO IMEDIATAMENTE!!!!!!! D:");
    }
        
       */ 
    classificarMedia.classifiMedia(mediaConsume);
    
    }

    //Função inserida dentro do programa principal
    private static double mediaConsumeCal(double dist,double cons) {
        double consumoMedio = 0.0;
        consumoMedio = dist / cons;
        return consumoMedio;
    }
}

