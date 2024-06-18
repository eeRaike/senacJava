
package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        
        //Declaração de Arraylist
        String nome = "";
        ArrayList<String> nomeAluno = new ArrayList<String>();
        Scanner readK = new Scanner(System.in);
        boolean processo = true;
        String option = "";
        
        while(processo == true){
            System.out.println("Digite o nome do aluno");
            nome = readK.next();
            //Armazenar dado dentro do array
            nomeAluno.add(nome);
            System.out.println("Inserir novo nome? (S/N)");
            option = readK.next();
            if(option.equalsIgnoreCase("N")){
                processo = false;
            }
            
        }
        for (int i = 0; i < nomeAluno.size(); i++) {
                System.out.println("Nome:" + nomeAluno.get(i) + " Posição:" + i);
                
            }
        
        
        
        
        
    }
}
