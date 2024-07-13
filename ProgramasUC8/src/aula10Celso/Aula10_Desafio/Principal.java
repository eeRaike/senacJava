
package aula10Celso.Aula10_Desafio;

import java.io.FileNotFoundException;


public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        CadastroVeiculo oper = new CadastroVeiculo();
        PersistenciaDadosCSV oper2 = new PersistenciaDadosCSV();
        
        Veiculo item1 = new Veiculo("marca1", "modelo1", "1","Gasolina?");
        Veiculo item2 = new Veiculo("marca2", "modelo2", "2","Gasolina?");
        Veiculo item3 = new Veiculo("marca3", "modelo3", "3","Gasolina?");
        
        oper.inserirItensArray(item1);
        oper.inserirItensArray(item2);
        oper.inserirItensArray(item3);
        
        oper2.criarArquivoDados();
        oper2.gravarDadosArquivoCSV(oper.bancoItens);
        oper.carregaTodosDadosArquivoCSV();
        
        oper.listarTodosItens();
      
        
    }
    
}
