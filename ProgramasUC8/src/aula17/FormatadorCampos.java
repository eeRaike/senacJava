package aula17;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class FormatadorCampos {
    
    /*
    public void formatField(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("");
        mask.install(field);
    }
    */
    public void formatFieldCPF(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("###.###.###-##");
        mask.install(field);
    }
    public void formatFieldTelefone(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("(##) ####-####");
        mask.install(field);
    }
    public void formatFieldTelefoneInter(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("+##(##) #####-####");
        mask.install(field);
    }
    public void formatFieldCEP(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("##.###-###");
        mask.install(field);
    }
    public void formatFieldCNPJ(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("##.##.###/####-##");
        mask.install(field);
    }
    public void formatFieldTltEleitor(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("##########/##");
        mask.install(field);
    }
    public void formatFieldDataNasc(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("##/##/#####");
        mask.install(field);
    }
    public void formatFieldPlacaAuto(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("UUU####");
        mask.install(field);
    }
    
}
