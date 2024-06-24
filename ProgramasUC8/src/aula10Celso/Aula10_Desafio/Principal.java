
package aula10Celso.Aula10_Desafio;

import java.io.FileNotFoundException;


public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        CadastroVeiculo oper = new CadastroVeiculo();
        PersistenciaDadosCSV oper2 = new PersistenciaDadosCSV();
        oper2.criarArquivoDados();
        oper.carregaTodosDadosArquivoCSV();
        
        oper.listarTodosItens();
      
        
    }
    
}
