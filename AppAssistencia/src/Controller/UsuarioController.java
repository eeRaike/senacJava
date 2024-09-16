package Controller;

import Model.UsuarioModel;
import java.util.ArrayList;

public class UsuarioController {

    public ArrayList<UsuarioModel> listarRegistrosController() {
        UsuarioModel op = new UsuarioModel();
        return op.listarRegistrosModel();
    }
    
    public ArrayList<UsuarioModel> filtrarRegistrosController(String nome) {
        UsuarioModel op = new UsuarioModel();
        return op.filtrarRegistrosModel(nome);
    }
    
    //Método que vai enviar as informações recebidas
    // da tela de interface gráfica para o método de inserir
    // registro contido no model.
    public void inserirRegistroController(String userName, String email, String login, String password, String perfil){
        UsuarioModel novoUsuario = new UsuarioModel(userName, email, login, password, perfil);
        novoUsuario.inserirRegistrosModel(novoUsuario);
    }
    
    //Método no controller que obtenha a informação do ID para a exclusão
    public void excluirRegistroController(String idUser){
        UsuarioModel op = new UsuarioModel();
        op.excluirRegistrosModel(idUser);
    }
    
    //Método no controller que obtenha as informações atualizadas | UPDATE
    public void atualizarRegistroController(String idUser, String username, String email, String login, String perfil ){
        UsuarioModel usuarioAtualizado = new UsuarioModel(idUser, username, email, login, null, perfil);
        usuarioAtualizado.atualizarRegistrosModel(usuarioAtualizado);
    }
    
}
