
package Testes;

import DAL.ConnectionFactory;
import DAL.OperRegistrosBanco;


public class TestesGerais {
    
    public static void main(String[] args) {
        //ConnectionFactory conex = new ConnectionFactory();
        //conex.getConnection();
        OperRegistrosBanco test = new OperRegistrosBanco();
        //test.inData();
        //test.updtData();
        //test.listData();
        test.fltrlistData();
    }
}
