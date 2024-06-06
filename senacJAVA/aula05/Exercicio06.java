
package aula05;

import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args) {
        double IMC = 0.0;
        double mass = 0.0;
        double height = 0.0;
        InputInfo info = new InputInfo();
        CalcInfo  calc = new CalcInfo();
        ClassifyInfo clInfo = new ClassifyInfo();
        
        mass = info.inputMass();
        height = info.inputHeight();
        IMC = calc.calcIMC(mass, height);
        clInfo.showIMC(IMC);
        
    }
}
