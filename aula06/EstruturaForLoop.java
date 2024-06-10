package aula06;

import java.util.Scanner;

public class EstruturaForLoop {
    public static void main(String[] args) {
        
        //FOR:operação finita de repetições
        //WHILE: repetições infinitas até atingir uma condição ou receber um break;
        
        int i = 0;
        String option = "";
        Scanner readKeyboard = new Scanner(System.in);
        System.out.println("Executar programa? Y/N");
        option = readKeyboard.next();
        
        /*for(i=0; i<10;i++){
        
            System.out.println(i);
            
        }*/
        
        while(option.equalsIgnoreCase("Y")){
            System.out.println("Execução " + i);
            i++;
            System.out.println("Executar programa novamente? Y/N");
            option = readKeyboard.next();
            //Condição de saída do looping whilem deve estar contida dentro do bloco
            //de código
        }
    }
}
