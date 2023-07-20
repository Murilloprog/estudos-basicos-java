package terceirasemana;

import java.text.NumberFormat;
import java.text.ParseException;

class ExcecaoChecENChec {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        
        //valor = Double.valueOf("a1.75");
        //valor = NumberFormat.getInstance().parse("a1.75");
        
        
       
    }

}