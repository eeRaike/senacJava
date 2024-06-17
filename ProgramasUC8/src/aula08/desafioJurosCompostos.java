
package aula08;

import java.util.Scanner;


public class desafioJurosCompostos {
    public static void main(String[] args) {
       double M = 0.0;
       JurosMethods jMethods = new JurosMethods();
        
        System.out.println("Montante:" + jMethods.calcMontante());
        System.out.println("Juros: "+ jMethods.calcJuros(M));
        jMethods.confirmation();
    }
    
    
   
}
