
package aula09Cadastro;

import java.util.ArrayList;


public class BancoInfo {
    
    ArrayList<Veiculo> itemsBanco = new ArrayList<Veiculo>();
    
    //Adicionar items no Array
    public void inItemArr(Veiculo novoItem){
        itemsBanco.add(novoItem);
        System.out.println("Item adicionado");
    }
    //Remover items do Array
    public void outItemArr(Veiculo index){
        itemsBanco.remove(index);
        System.out.println("Item removido");
    }
    //Apagar todos os items do Array
    public void clearItemArr(){
        itemsBanco.clear();
        System.out.println("Lista esvaziada com sucesso");
    }
    //Listar todos os items no Array
    public void listItemArr(){
    for (int i= 0; i < itemsBanco.size(); i++){
        System.out.println("Marca: " + itemsBanco.get(i).getMarca());
        System.out.println("Modelo: " + itemsBanco.get(i).getModelo());
        System.out.println("Combustível: " + itemsBanco.get(i).getCombust());
        System.out.println("Ano: " + itemsBanco.get(i).getAno());
    
    }
    }
    
    //Gravar informações do Array em um arquivo .txt
    
    //Leitura dos dados do Array
    
}
