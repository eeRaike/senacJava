
package Controller;

import Model.LoginModel;
import View.TelaAplicacao;
import View.TelaLogin;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;


public class LoginController {
    
    public boolean validaLoginController(String login, String password) throws FileNotFoundException{
    
        //Instanciando um objeto do tipo LoginModel
        Boolean contem = null;
        LoginModel dadosUsuarioSenha = new LoginModel(login, password);
        contem = dadosUsuarioSenha.validaDadosLoginBD(dadosUsuarioSenha);
        
        if(contem){
            TelaAplicacao tela = new TelaAplicacao();
            tela.setVisible(true);
            return true;
           
            
        }else{
            String mensagem = "Usuario e senha inválidos";
            JOptionPane.showMessageDialog(null, mensagem);
            return false;
        }
        
    }
    
}
