
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;



public class OperRegistrosBanco {

    //1. Método de inserção de dados
    
    public void inData(){
    
        String sqlComm = "insert into TB_USERS (USER_NAME, EMAIL, LOGIN, PASSWORD, PERFIL_USER) VALUES(?,?,?,?,?)";
        PreparedStatement pst = null;
        Connection conn = null;
        
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
    
    
    //2. Método de update 
    
    public void updtData() {
    
    String sqlComm = "UPDATE TB_USERS SET USER_NAME=?, EMAIL=?, LOGIN=?, PASSWORD=?, PERFIL_USER=? WHERE ID_USER = ?";
    PreparedStatement pst = null;
    Connection conn = null;
    
        try {
            
            conn = new ConnectionFactory().getConnection();
            pst = conn.prepareStatement(sqlComm);
            pst.setString(1,"Silvio Santos");
            pst.setString(2,"silviossantos@sbt.com.br");
            pst.setString(3,"silviosa");
            pst.setString(4,"dinheiro");
            pst.setString(5,"MORTO ;)");
            pst.setString(6, "8");
            pst.executeUpdate();
            System.out.println("registro alterado com sucesso!");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERROR: DAL: UPDTDATA");
            
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
    
    
    //3. Método de exclusão
    
    public void delData(){
    
    String sqlComm = "DELETE FROM TB_USERS WHERE ID_USER = ?";
    PreparedStatement pst = null;
    Connection conn= null;
    
        try {
            
            conn = new ConnectionFactory().getConnection();
            pst = conn.prepareStatement(sqlComm);
            pst.setString(1,"11");
            pst.executeUpdate();
            System.out.println("registro deletado com sucesso!");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERROR: DAL: UPDTDATA");
            
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
    
    //4. Método de listagem
    
    public void listData(){
    
        String sqlComm = "SELECT * FROM TB_USERS";
        PreparedStatement pst = null;
        Connection conn = null;
        ResultSet rSet = null;
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            pst = conn.prepareStatement(sqlComm);
            rSet = pst.executeQuery();
            while(rSet.next()){
            
                System.out.println(
                        " ID:" + rSet.getString(1) +
                        " Name:" + rSet.getString(2) +
                        " Email:" + rSet.getString(3) + 
                        " Login:" + rSet.getString(4) + 
                        " Password:" + rSet.getString(5) +
                        " Perfil Usuário:" + rSet.getString(6));
                
            }
            System.out.println("Registros listados com sucesso!");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERROR: DAL: LISTDATA");
            
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
    
    public void fltrlistData(){
    
        String sqlComm = "SELECT * FROM TB_USERS WHERE ID_USER = ?";
        PreparedStatement pst = null;
        Connection conn = null;
        ResultSet rSet = null;
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            pst = conn.prepareStatement(sqlComm);
            pst.setString(1, "5");
            rSet = pst.executeQuery();
            while(rSet.next()){
            
                System.out.println(
                        " ID:" + rSet.getString(1) +
                        " Name:" + rSet.getString(2) +
                        " Email:" + rSet.getString(3) + 
                        " Login:" + rSet.getString(4) + 
                        " Password:" + rSet.getString(5) +
                        " Perfil Usuário:" + rSet.getString(6));
                
            }
            System.out.println("Registros listados com sucesso!");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERROR: DAL: LISTDATA");
            
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
