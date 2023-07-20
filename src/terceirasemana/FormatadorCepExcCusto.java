package terceirasemana;

//Exceções customizadas
//Formatador de CEP, utilizando uma classe de exceção que obriga
// o CEP sempre ter 8 digitos. 

public class FormatadorCepExcCusto {
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("2222222");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não é valido");
        }
    
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
