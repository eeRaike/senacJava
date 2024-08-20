
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class OperRegistrosBanco {

    //1. Método de inserção de dados
    
    public void inData(){
    
        String sqlComm = "insert into TB_USERS (USER_NAME, EMAIL, LOGIN, PASSWORD, PERFIL_USER) VALUES(?,?,?,?,?)";
        PreparedStatement pst = null;
        Connection conn= null;
        
        try {
            conn = new ConnectionFactory().getConnection();
            pst = conn.prepareStatement(sqlComm);
            pst.setString(1,"pstName1");
            pst.setString(2,"pstEmail1");
            pst.setString(3,"pstLogin1");
            pst.setString(4,"pstPass1");
            pst.setString(5,"User");
            pst.executeUpdate();
            System.out.println("registro inserido com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR: DAL: INDATA");
        } finally {
            
            // Termina a execução
            try {
                if(pst != null){
                    pst.close();
                
                }
                
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }
            
            // Encerra a conexão
            try {
                if(conn != null){
                    conn.close();
                }
                
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }
        }
    }
    
}
