
package aula05;

import java.util.Scanner;


public class InputInfo {
    Scanner readKeyboard = new Scanner(System.in);
    public int inputAge(){
        int age = 0;
        System.out.println("Insira a Idade");
        
        age = readKeyboard.nextInt();
        return age;
    }
    public double inputMass(){
        double mass = 0.0;
        System.out.println("Insira a Massa> ");
        mass = readKeyboard.nextDouble();
        return mass;
    }
    public double inputHeight(){
        double height = 0.0;
        System.out.println("Insira a Altura> ");
        height = readKeyboard.nextDouble();
        return height;
    }
}
