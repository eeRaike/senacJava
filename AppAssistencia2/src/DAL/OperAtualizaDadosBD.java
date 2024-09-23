
package DAL;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class OperAtualizaDadosBD {
    
    //2. Método de update (atualizar / alterar) registros
    public void atualizarRegistro(UsuarioModel usuarioAtualizado) {

        String sql = "update TB_USERS set USER_NAME=?, EMAIL=?, LOGIN=?, PERFIL_USER=? where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, usuarioAtualizado.getUserName());
            pst.setString(2, usuarioAtualizado.getEmail());
            pst.setString(3, usuarioAtualizado.getLogin());
            pst.setString(4, usuarioAtualizado.getPerfil());
            pst.setString(5, usuarioAtualizado.getId());
            pst.executeUpdate();
            System.out.println("O registro foi ***ALTERADO*** com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO::DAL::ATUALIZAR_REGISTRO");
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
