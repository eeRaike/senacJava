package Model;

import DAL.OperAtualizaDadosBD;
import DAL.OperExcluiDadosBD;
import DAL.OperFiltroDadosBD;
import DAL.OperInsereRegistroBD;
import DAL.OperListaDadosBD;
import java.util.ArrayList;

public class UsuarioModel extends LoginModel {

    //Atributos que definem o cadastro de um usuário
    private String id;
    private String userName;
    private String email;
    private String perfil;

    // Métodos Contrutores - vazio
    public UsuarioModel() {
    }

    //Construtor utilizado para listagem de dados contidos no banco
    public UsuarioModel(String id, String userName, String email, String login, String password, String perfil) {
        super(login, password);
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.perfil = perfil;
    }

    //Construtor utilizado para inserir novo registro no banco de dados
    public UsuarioModel(String userName, String email, String login, String password, String perfil) {
        super(login, password);
        this.userName = userName;
        this.email = email;
        this.perfil = perfil;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPerfil() {
        return perfil;
    }
    
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    //Listagem de todos os dados
    public ArrayList<UsuarioModel> listarRegistrosModel() {
        OperListaDadosBD op = new OperListaDadosBD();
        return op.listarRegistrosBD();
    }

    //Filtragem de dados
    public ArrayList<UsuarioModel> filtrarRegistrosModel(String nome) {
        OperFiltroDadosBD op = new OperFiltroDadosBD();
        return op.filtrarRegistrosBD(nome);
    }

    //Inserção de um novo registro no banco de dados // Model
    public void inserirRegistrosModel(UsuarioModel novoUsuario) {
        OperInsereRegistroBD op = new OperInsereRegistroBD();
        op.inserirRegistro(novoUsuario);
    }

    //Envio da informação para o DAL para exclusão de registro
    public void excluirRegistrosModel(String idUser) {
        OperExcluiDadosBD op = new OperExcluiDadosBD();
        op.excluirRegistro(idUser);
    }

    //UPDATE - recebe o objeto com as informações atualizadas e envia para o banco dedados
    public void atualizarRegistrosModel(UsuarioModel usuarioAtualizado) {
        OperAtualizaDadosBD op = new OperAtualizaDadosBD();
        op.atualizarRegistro(usuarioAtualizado);
        
    }
    
}
