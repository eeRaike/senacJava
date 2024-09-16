package DAL;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OperInsereRegistroBD {

    //1. Método de inserir registros
    public void inserirRegistro(UsuarioModel novoUsuario) {

        String sql = "insert into TB_USERS (USER_NAME, EMAIL, LOGIN, PASSWORD, PERFIL_USER) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        Connection connection = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, novoUsuario.getUserName());
            pst.setString(2, novoUsuario.getEmail());
            pst.setString(3, novoUsuario.getLogin());
            pst.setString(4, novoUsuario.getPassword());
            pst.setString(5, novoUsuario.getPerfil());
            pst.executeUpdate();
            System.out.println("O registro foi inserido com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO::DAL::INSERIR_REGISTRO");
        } finally {
            //Exemplo: agradece pela execução e diz: "tchau!"
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }

            //Exemplo: desligamos o telefone (encerramos a ligação)
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }
        }
    }

}
