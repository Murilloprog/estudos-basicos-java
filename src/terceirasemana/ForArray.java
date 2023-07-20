package terceirasemana;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Barbara", "Murillo", "Catarina", "Junior" };

        for (String aluno : alunos){
            System.out.println("O nome do aluno é:" + aluno);
        }

        /*Forma mais longa
        length significa a quantidade de alunos citados (tamanho)
        for (int x = 0; x < alunos.length; x++)
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);*/
        
            
    }   

    
}
