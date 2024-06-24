
package aula10Desafio;

public class Main {
    public static void main(String[] args) {
         
    /*
    Veiculo item1 = new Veiculo("Fiat", "Palio", "Alcool", "2018");
    Veiculo item2 = new Veiculo("2", "2", "2", "2022");
    Veiculo item3 = new Veiculo("3", "3", "3", "2015");
    Veiculo item4 = new Veiculo("4", "4", "4", "2016");
    
    CadastroVeiculo oper = new CadastroVeiculo();
    
    oper.inItemArr(item1);
    oper.inItemArr(item2);
    oper.inItemArr(item3);
    oper.inItemArr(item4);
    */
    PersistenciaDadosCSV oper = new PersistenciaDadosCSV();
    
    oper.createCsvFile();
    
    }
    
}
