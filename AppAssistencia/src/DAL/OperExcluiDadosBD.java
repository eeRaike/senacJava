
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class OperExcluiDadosBD {
    
    //3. Método de exclusão de resgistros (delete)
    public void excluirRegistro(String idUser) {

        String sql = "delete from TB_USERS where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, idUser);
            pst.executeUpdate();
            System.out.println("O registro foi ***EXCLUIDO*** com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO::DAL::EXCLUIR_REGISTRO");
        } finally {
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
