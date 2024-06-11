package aula06;

import java.util.Scanner;


public class DesafioLoja {
    public static void main(String[] args) {
        Boolean menu = true;
        String opcao = "";
        String name = "";
        String sabor = "";
        String tamanho = "";
        Double ultValor = 0.0;
        Double valorTotal = 0.0;
        Scanner readKeyboard = new Scanner(System.in);
        lojaMethods Lmethods = new lojaMethods();
        
        System.out.println("Insira o nome do usuário");
        name = readKeyboard.next();
        
        System.out.println("Olá " + name + " Bem vindo à Loja Hipotética "
                + "\n |Tamanho| Cupuaçu (CP) | Açaí(AC) |"
                + "\n |   P   |   R$9,00     | R$11,00  |"
                + "\n |   M   |   R$14,00    | R$16,00  |"
                + "\n |   G   |   R$18,00    | R$20,00  |");
                
        
        while(menu){
        while(sabor.equals("")){
            sabor = Lmethods.inputSabor();
        }
        
        while(tamanho.equals("")){
            tamanho = Lmethods.inputTamanho();
        }
        
        //temp
        ultValor = Lmethods.setCombinations(sabor,tamanho);
        System.out.println("Esse item custará: R$" + ultValor);
        valorTotal = Lmethods.calcValor(ultValor,valorTotal);
        
            System.out.println("Deseja pedir mais alguma coisa? (S/N)");
            opcao = readKeyboard.next();
            if(opcao.equalsIgnoreCase("S")){
                sabor = "";
                tamanho = "";
            }else if(opcao.equalsIgnoreCase("N")){
                System.out.println("Seu pedido irá custar: R$" + valorTotal);
                
                break;
            }else {
                System.out.println("Opção inválida. Tente novamente");
        } 
        
        }  
    }
}
