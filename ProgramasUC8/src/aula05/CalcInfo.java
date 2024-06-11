
package aula05;

public class CalcInfo {
    public double calcIMC(double mass,double height){
        double IMC = 0.0;
        IMC = mass / Math.pow(height,2);
    return IMC;
    }
}
