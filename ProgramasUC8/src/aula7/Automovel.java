
package aula7;

public class Automovel {
    
    //Definição dos atributos
    
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double potencia;
    private boolean estacionado;
    private double combustivel;
    private double odometro;

    
    //Métodos
    //Constructor
        public Automovel() {
    }
    
    public Automovel(String marca, String modelo, int ano, String cor, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.potencia = potencia;
    }
    
    
    //Getters e Setters
    
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getOdometro() {
        return odometro;
    }

    public void setOdometro(double odometro) {
        this.odometro = odometro;
    }
    
    //Métodos de usuário 
    
    //estacionamento - está estacionado
   
    public void estacionar(){
        if(this.isEstacionado() == true){
        this.setEstacionado(false);
        }else{
        this.setEstacionado(true);
        }
    }
    //litros tanque - retirada de combustível do tanque
    
    public void consumirComb(double litros){
        this.setCombustivel(this.getCombustivel() - litros);
    }
    
    public void abastecerComb(double litros){
        this.setCombustivel(this.getCombustivel() + litros);
        
    }
    
   public void aumentarOdometro(double qtdeKm){
       this.setOdometro(this.getOdometro() + qtdeKm);
       
   } 
   
   public void estadoAtualCarro(){
       System.out.println("Carro: " + this.getModelo() + "Marca: " + this.getMarca() 
               + "Quilometragem: " + this.getOdometro() 
               + "Qtde Combustivel: " + this.getCombustivel() 
               + "");
   }
    //altera odômetro - modifiucação do km do marcador 
    
    //Estado

    

    


    
}
