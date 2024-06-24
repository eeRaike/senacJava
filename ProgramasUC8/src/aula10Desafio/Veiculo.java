
package aula10Desafio;

public class Veiculo {
    //Definir atributos
    private String marca;
    private String modelo;
    private String combust;
    private String ano;
    
    //Constructor Method

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String combust, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.combust = combust;
        this.ano = ano;
    }

    
    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombust() {
        return combust;
    }

    public void setCombust(String combust) {
        this.combust = combust;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
}
