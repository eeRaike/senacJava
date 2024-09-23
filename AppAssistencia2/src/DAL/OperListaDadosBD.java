package DAL;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OperListaDadosBD {

    public ArrayList<UsuarioModel> listarRegistrosBD() {

        String sql = "select * from TB_USERS";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<UsuarioModel> listaUsuarios = new ArrayList<UsuarioModel>();
        UsuarioModel usuario = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    usuario = new UsuarioModel();
                    usuario.setId(rs.getString("ID_USER"));
                    usuario.setUserName(rs.getString("USER_NAME"));
                    usuario.setEmail(rs.getString("EMAIL"));
                    usuario.setLogin(rs.getString("LOGIN"));
                    usuario.setPassword(rs.getString("PASSWORD"));
                    usuario.setPerfil(rs.getString("PERFIL_USER"));
                    listaUsuarios.add(usuario);
                }
            }

            System.out.println("Registros ***LISTADOS*** com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO::DAL::LISTAR_REGISTROS");
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
        return listaUsuarios;
    }

}
