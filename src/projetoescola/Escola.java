package projetoescola;

public class Escola {
    public static void main(String[] args) {
        //criação dos objetos
        /*Aluno murillo = new Aluno();
        murillo.nome = "Murillo"; 
        murillo.idade = 24; 

        System.out.println("O aluno " + murillo.nome + " tem " + murillo.idade + " anos");   
     */
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setSexo("Masculino");
    
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos " + "do sexo " + felipe.getSexo());	
    }
}
