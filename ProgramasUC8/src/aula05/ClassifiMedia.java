package aula05;

 class ClassifiMedia {
    public void classifiMedia(double mediaCons){
        if(mediaCons >= 15){
            System.out.println("O seu carro é econômico :D ");
        }else if(mediaCons >= 8 && mediaCons > 15){
            System.out.println("Definitivamente um dos carros já feitos :I ");
        }else {
            System.out.println("POR FAVOR VENDA SEU CARRO IMEDIATAMENTE!!!!!!! D:");
        }
    }
}
