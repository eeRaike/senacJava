
package aula10Desafio;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class PersistenciaDadosCSV {
    
    //Onde deverá ser criado o arquivo para gravação dos dados
    String caminho = "C:\\Users\\Aluno\\Documents\\Raike\\senacJava\\ProgramasUC8\\dados.txt";
    
    ArrayList<Veiculo> cargaDadosCSV = new ArrayList<>();
    
    
    //Método de criação de arquivos;
        public void createCsvFile(){
            //Classe file,efetua a criação de arquivos externos;
            File Arquivo = new File(caminho);
            
            try {
                if(Arquivo.createNewFile()){
                    System.out.println("Arquivo criado com sucesso!");
                }else {
                     System.out.println("Arquivo já existe!");
                }
            } catch (Exception e) {
                System.out.println("\nERRO AO CRIAR ARQUIVO!!!");
                System.out.println("\nREVISE O MÉTODO CRIAR ARQUIVO DADOS!");
            }
        }
    //Método de gravação de dados dentro do arquivo;
        public void gravarDadosArquivoCSV(ArrayList<Veiculo> listaItems){
        
            try {
                FileWriter writer = new FileWriter(caminho);
                
                for (int i = 0; i < cargaDadosCSV.size(); i++) {
                    writer.write(
                      listaItems.get(i).getMarca() + ","
                    + listaItems.get(i).getModelo() + ","
                    + listaItems.get(i).getAno()+ ","
                    + listaItems.get(i).getCombust() + "\n");
                }
                writer.close();
                System.out.println("Dados inseridos com sucesso!");
                
            } catch (Exception e) {
            }
            
        }
    //Método de leitura dos dados CSV;
        
}
