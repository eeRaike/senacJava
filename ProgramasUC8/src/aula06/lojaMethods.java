package aula06;

import java.util.Scanner;

public class lojaMethods {
    Scanner readKeyboard = new Scanner(System.in);
    public String inputSabor(){
        String sabor = "";
        System.out.println("Insira o sabor desejado>");
        sabor = readKeyboard.next().toUpperCase();
        System.out.println();
        
        if(sabor.equals("CP") || sabor.equals("AC")){
            return sabor;
        }else {
           System.out.println("Sabor inválido. Tente novamente");
        } 
        return "";
            
    }
    
    public String inputTamanho(){
        String tamanho = "";
        System.out.println("Insira o tamanho desejado>");
        tamanho = readKeyboard.next().toUpperCase();
        System.out.println();
        
        if(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")){
            return tamanho;
        }else {
           System.out.println("Tamanho inválido. Tente novamente");
        } 
        return "";
            
    }
    
    public double setCombinations(String sabor , String tamanho ) {
        double valor = 0.0;
        if(sabor.equals("CP") && tamanho.equals("P")){
            return valor = 9.00;
        }else if(sabor.equals("CP") && tamanho.equals("M")){
            return valor = 14.00;
        }else if(sabor.equals("CP") && tamanho.equals("G")){
            return valor = 18.00;
        }else if(sabor.equals("AC") && tamanho.equals("P")){
            return valor = 11.00;
        }else if(sabor.equals("AC") && tamanho.equals("M")){
            return valor = 16.00;
        }else if(sabor.equals("AC") && tamanho.equals("G")){
            return valor = 20.00;
        } return 0.0;
}
    public double calcValor(double ultValor,double valorTotal){    
        return valorTotal += ultValor;
    }
}
