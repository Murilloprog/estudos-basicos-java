package terceirasemana;

public class SwitchCase {
    public static void main(String[] args) {
        
        //Usabilidade do SwitchCase efeito cascata. 
        String plano = "T";//Plano Basic(B); Midia(M); Turbo(T)

        switch (plano){
            case "T":{
                System.out.println("5Gb Youtube");
            }
            
            case "M":{
                System.out.println("Wpp e Ista grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligação");
            }
        } 




        /*if (sigla == "P")
        System.out.println("Pequeno");

        else if (sigla == "M")
        System.out.println("Medio");

        else if (sigla == "G")
        System.out.println("Grande");

        else 
        System.out.println("Indefinido");*/
        
        //Pode se observar que o switch case nao tem tanta usabilidade nesse caso devido que o if/else nao tem tanta diferença.

        /*switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }*/        
    }
    
}
