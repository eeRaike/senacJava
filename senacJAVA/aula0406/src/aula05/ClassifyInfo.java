
package aula05;


public class ClassifyInfo {
    public void showBranch(int age){
        if(age >= 5 && age <= 7){
            System.out.println("O nadador é da Categoria Infantil A");
        }else if(age >= 8 && age <= 10){
            System.out.println("O nadador é da Categoria Infantil B");
        }else if(age >= 11 && age <= 13){
            System.out.println("O nadador é da Categoria Juvenil A");
        }else if(age >= 14 && age <= 17){
            System.out.println("O nadador é da Categoria Juvenil B");
        }else if(age > 18){
            System.out.println("O nadador é da Categoria Adulto");
        }
    
    }
    
    public void showIMC(double IMC){
        if(IMC < 16){
            System.out.println("Magreza grave");
        }else if(IMC >= 16 && IMC < 17){
            System.out.println("Magreza moderada");
        }else if(IMC >= 17 && < 18.5){
            System.out.println("");
        }
    }
    }