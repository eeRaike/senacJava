
package aula15;


public class Calculadora {
    
    public double calcAplicDepoReg(double numMonths,double taxMonth,double valDeposit){
    
        double valorObtidoFinal;
        
        valorObtidoFinal = (1+(taxMonth/100))*
                (((Math.pow((1+(taxMonth/100)), numMonths))-1)/(taxMonth/100))
                *valDeposit;
        
        
        return valorObtidoFinal;
    }
    
    public double calcFinancPrestFixas(double numMonths, double taxMonth, double prestValue){
        
            double valorFinanciado;
                

            valorFinanciado = ((1-(Math.pow((1+(taxMonth/100)), (numMonths*-1))))/(taxMonth/100))*prestValue;
            
        return valorFinanciado;
    }
    
    public double calcValorFCap(double numMonths, double taxMonth, double capital){
        double valFinal;
        
        valFinal = (Math.pow((1 + taxMonth/100), numMonths))*capital;
        
        return valFinal;
    }
    
    
    
}
