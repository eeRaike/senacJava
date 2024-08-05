package aula18_desafio.Util;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserRegister {

    //Array que vai guardar os objetos de usuário
    public static class GlobalVars {
       // public static ArrayList<Users> userBank = new ArrayList<>();
        public static ArrayList<Users> userBank = new ArrayList<>();
    }

    //Método de inserção dos objetos 
    public void inUsers(Users newUser) {

        try {
            GlobalVars.userBank.add(newUser);
            String msg = "Usuário inserido com sucesso";
            JOptionPane.showMessageDialog(null, msg);
        } catch (Exception e) {
            String msg = "Erro ao inserir o usuário <UserRegister/inUsers>";
            JOptionPane.showMessageDialog(null, msg);
            e.printStackTrace();
        }

    }

    public boolean loginValidation(String name, String Password) {
        boolean exists = false;
        System.out.println(GlobalVars.userBank.size());
        for (int i = 0; i < GlobalVars.userBank.size(); i++) {
            String user = GlobalVars.userBank.get(i).getUserName();
            //System.out.println(user);
            String password = GlobalVars.userBank.get(i).getPassword();
            //System.out.println(password);

            if (user.equals(name) && password.equals(Password)) {
                exists = true;
            }
        }
        return exists;

    }

}
