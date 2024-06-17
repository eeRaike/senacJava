
package aula08;

import java.util.InputMismatchException;
import java.util.Scanner;


public class tratamentoexcessoes {
    public static void main(String[] args) {
        example3();
        
        
        
        
        
        
    }

    private static void example() {
        String senha = null;
        
        
        try {
            System.out.println(senha.length());
            System.out.println("aaaaaaaaa");
        } catch (NullPointerException e) {
            System.out.println("Exception");
            e.printStackTrace();
        } finally{
            System.out.println("aaa");
        }
        
        
    }

    private static void example2() {
        int[] vector = {1,2,3,4,5};
        
        try {
            System.out.println("Valor:" + vector[5]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ao acessar o valor do vetor");
            e.printStackTrace();
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("Excessão não verificada");
        } finally {
            System.out.println("Seguindo programa");
            System.out.println("Finaliza programa");
        }
        
    }

    private static void example3() {
        //Função que divide 2 valores
        
        int value1 = 0;
        int value2 = 0;
        int result = 0;
        Scanner readKeyboard = new Scanner(System.in);
        //Aquisição de dados
        
        try {
            System.out.println("Digite o primeiro valor");
        value1 = readKeyboard.nextInt();
        
        System.out.println("Digite o segundo valor");
        value2 = readKeyboard.nextInt();
        
        //Processamento de dados
        result = value1 / value2;
        
        //Apresentação de dados
        System.out.println(result);
        
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido, tente novamente");
        } catch(ArithmeticException e){
            System.out.println("O usuário tentou dividir o valor por 0");
        } catch(Exception e){
            System.out.println("Erro Inesperado");
            e.printStackTrace();
        }
        
    }
}
