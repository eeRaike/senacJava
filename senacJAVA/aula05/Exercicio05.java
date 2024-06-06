
package aula05;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        int age = 0;
        String branch = "";
        InputInfo setAge = new InputInfo();
        ClassifyInfo showCategory = new ClassifyInfo();
        age = setAge.inputAge();
        showCategory.showBranch(age);
        
}}
