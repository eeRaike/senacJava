
package aula09Cadastro;

public class Main {
    public static void main(String[] args) {
        Veiculo c1 = new Veiculo("Fiat", "Idea", "Gasolina", 2015);
        Veiculo c2 = new Veiculo("Toyota", "Corolla", "Gasolina", 2020);
        Veiculo c3 = new Veiculo("Ford", "Focus", "Gasolina", 2009);
        Veiculo c4 = new Veiculo("GM", "Onix", "Alcool", 2017);
        
        BancoInfo op = new BancoInfo();
        
        op.inItemArr(c1);
        op.inItemArr(c2);
        op.inItemArr(c3);
        op.inItemArr(c4);
        
        op.listItemArr();
        
        op.outItemArr(c2);
        
        System.out.println("\nLista atualizada");
        op.listItemArr();
        
        op.clearItemArr();
        op.listItemArr();
    }
}
