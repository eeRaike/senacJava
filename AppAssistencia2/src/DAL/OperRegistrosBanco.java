package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperRegistrosBanco {

    // Operações com manipulaçao de registros - CRUD
    // C - create (inserir registro)
    // R - read (listar registros)
    // U - update (atualizar informações em registros)
    // D - delete (excluir registros)
   
    //1. Método de inserir registros
    public void inserirRegistro() {

        String sql = "insert into TB_USERS (USER_NAME, EMAIL, LOGIN, PASSWORD, PERFIL_USER) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        Connection connection = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, "João da Silva");
            pst.setString(2, "joaosilva@email.com.br");
            pst.setString(3, "joasilva");
            pst.setString(4, "101112");
            pst.setString(5, "USER");
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

    //2. Método de update (atualizar / alterar) registros
    public void atualizarRegistro() {

        String sql = "update TB_USERS set USER_NAME=?, EMAIL=?, LOGIN=?, PASSWORD=?, PERFIL_USER=? where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, "Silvio Santos");
            pst.setString(2, "silviosantos@sbt.com.br");
            pst.setString(3, "silviosa");
            pst.setString(4, "dinheiro");
            pst.setString(5, "ADMIN");
            pst.setString(6, "8");
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

    //3. Método de exclusão de resgistros (delete)
    public void excluirRegistro() {

        String sql = "delete from TB_USERS where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, "3");
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

    //4. Listar todos os itens do banco (READ)
    public void listarRegistros() {

        String sql = "select * from TB_USERS";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getString(1)
                        + " Nome: " + rs.getString(2)
                        + " Email: " + rs.getString(3)
                        + " Login: " + rs.getString(4)
                        + " Password: " + rs.getString(5)
                        + " Perfil Usuário: " + rs.getString(6));
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
    }
    
    
    //5. Filtrar itens do banco (READ)
    public void filtrarRegistros(String id_user) {

        String sql = "select * from TB_USERS where ID_USER = ?"; /*Alterado*/
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, id_user);                      /*Alterado*/
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getString(1)
                        + " Nome: " + rs.getString(2)
                        + " Email: " + rs.getString(3)
                        + " Login: " + rs.getString(4)
                        + " Password: " + rs.getString(5)
                        + " Perfil Usuário: " + rs.getString(6));
            }
            System.out.println("Registros ***FILTRADOS*** com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO::DAL::FILTRAR_REGISTROS");
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
