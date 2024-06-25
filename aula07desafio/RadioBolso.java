
package aula07desafio;


public class RadioBolso implements InterfaceRadio{
    //Atributos
    boolean onOff;
    boolean tocarMusica;
    int volume;
    double estacaotual;
    String banda;
    
    //Constructors
    public RadioBolso() {
    }

    public RadioBolso(boolean onOff, boolean tocarMusica, int volume, double estacaotual, String banda) {
        this.onOff = onOff;
        this.tocarMusica = tocarMusica;
        this.volume = volume;
        this.estacaotual = estacaotual;
        this.banda = banda;
    }
    
    
    //implementa todos os métodos que existem na interface
    public void onOffRadio(){
        if(onOff == false){
            onOff = true;
            System.out.println("Radio ligado");
        } else {
            tocarMusica = false;
            System.out.println("Desligando radio");
            onOff = false;
            
        }
    }
    public void play() {
        if(onOff == true){
            System.out.println("Tocando musica");
            tocarMusica = true;
        }

        
    }

    @Override
    public void pause() {
        if(onOff == true && tocarMusica == true){
            System.out.println("Musica pausada");
            tocarMusica = false;
        }
    }

    @Override
    public void estado() {
        
    }

    @Override
    public void dialAumenta() {
        if(onOff == true){
           
        }
    }

    @Override
    public void dialDiminui() {
        if(onOff == true){
            
        }
    }

    @Override
    public void volumeAumenta() {
        if(onOff == true){
            if(volume >= 0||volume <= 50){
            this.volume = volume += 5;
          System.out.println("Volume atual:" + volume);
            }
        }
        
    }

    @Override
    public void volumeDiminui() {
         if(onOff == true){
          this.volume = volume -= 5;
             System.out.println("Volume atual" + volume);
        }
    }

    @Override
    public void trocaFaixaSintonia() {
    }
    
     //Getters and Setters

    public boolean getOnOff() {
        return onOff;
    }

    public boolean getTocarMusica() {
        return tocarMusica;
    }

    public int getVolume() {
        return volume;
    }

    public double getEstacaotual() {
        return estacaotual;
    }

    public String getBanda() {
        return banda;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setTocarMusica(boolean tocarMusica) {
        this.tocarMusica = tocarMusica;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEstacaotual(double estacaotual) {
        this.estacaotual = estacaotual;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
    
    
    
}
