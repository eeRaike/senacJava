
package aula08;

import java.util.InputMismatchException;
import java.util.Scanner;


public class JurosMethods {
    Scanner readK = new Scanner(System.in);
        double C = 0.0;
        double i = 0.0;
        double t = 0.0;
        double J = 0.0;
        double M = 0.0;
        String option = "";
        
        
    //Calcula o valor do Montante
    public double calcMontante(){
        
        try {
        System.out.println("Insira o valor do Capital(C)");
        C = readK.nextDouble();
        System.out.println("Insira o valor do Tempo(t)");
        t = readK.nextDouble(); 
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido, tente novamente");
        } if(C == 0 || t == 0){
            throw new Error("Valor inválido - insira um valor maior que 0");
        }
    
        
    if(t > 0 && t <= 12){
        i = 2.5;
    } else if( t > 12 && t <= 24){
        i = 3.5;
    }
        System.out.println("Aliquota:"+i);
    i = i / 100;
        //System.out.println(i);
    i = 1 + i;
        //System.out.println(i);
    i = Math.pow(i,t);
        //System.out.println(i);
    M = C * i;
        //System.out.println(M);
    return M;
    }
    
    //Calcula o valor das prestações
    public double calcJuros(double m){ 
        J = M - C;
        return J;
        
    }
    
    public void confirmation(){
        System.out.println("Os valores estão corretos? (S/N)");
        option = readK.next();
        if(option.equalsIgnoreCase("S")){
            System.out.println("a");
        }else{
            System.out.println("b");
        }
    }
}
