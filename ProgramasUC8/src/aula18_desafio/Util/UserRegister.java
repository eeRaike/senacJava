
package aula18_desafio.Util;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserRegister {
    
    //Array que vai guardar os objetos de usuário
    ArrayList<Users> userBank = new ArrayList<Users>();
    
    //Método de inserção dos objetos 
    public void inUsers(Users newUser){
    
        try {
            userBank.add(newUser);
            String msg = "Usuário inserido com sucesso";
            JOptionPane.showMessageDialog(null, msg );
        } catch (Exception e) {
            String msg = "Erro ao inserir o usuário <UserRegister/inUsers>";
            JOptionPane.showMessageDialog(null, msg );
            e.printStackTrace();
        }
       
        
    }
    
    
}
