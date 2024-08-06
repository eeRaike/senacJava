
package aula18_desafio.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserData {

    
    //Onde deverá ser criado o arquivo para gravação dos dados
    String caminho = "C:\\Users\\Aluno\\Documents\\Raike\\senacJava\\ProgramasUC8\\userData.txt";
    
    ArrayList<Users> cargaDadosCSV = new ArrayList<>();
    
    
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
        public void gravarDadosArquivoCSV(ArrayList<Users> listaItems){
        
            try {
                FileWriter writer = new FileWriter(caminho);
                
                for (int i = 0; i < cargaDadosCSV.size(); i++) {
                    writer.write(
                      listaItems.get(i).getName()+ ","
                    + listaItems.get(i).getUserName()+ ","
                    + listaItems.get(i).getPassword()+ "\n");
                }
                writer.close();
                System.out.println("Dados inseridos com sucesso!");
                
            } catch (Exception e) {
            }
        }
        
        public ArrayList<Users> readCSVFile() throws FileNotFoundException{
        
            File arquivo = new File(caminho);
            Scanner leitorArquivos = new Scanner(arquivo);
            
            try {
                while(leitorArquivos.hasNext()){
                    String linhaArquivo = leitorArquivos.nextLine();
                    String vector[] = linhaArquivo.split(",");
                    String name = vector[0];
                    String username = vector[1];
                    String password = vector[2];
                    Users newItem = new Users(name,username,password);
                }
                leitorArquivos.close();
                System.out.println("lido com sucesso, carga inserida");
            } catch (Exception e) {
                System.out.println("Erro na leitura");
            }
            
            
        }
    }
