package quartasemana.projetobootcamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import quartasemana.projetobootcamp.dominio.Bootcamp;
import quartasemana.projetobootcamp.dominio.Conteudo;
import quartasemana.projetobootcamp.dominio.Curso;
import quartasemana.projetobootcamp.dominio.Dev;
import quartasemana.projetobootcamp.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Aprenda os conceitos básicos da linguagem Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoHTTP = new Curso();
        cursoHTTP.setTitulo("HTTP");
        cursoHTTP.setDescricao("Aprenda os conceitos básicos de HTTP");
        cursoHTTP.setCargaHoraria(9);

        Curso cursoIngles = new Curso();
        cursoIngles.setTitulo("Inglês");
        cursoIngles.setDescricao("Aprenda língua inglesa para DEV's");
        cursoIngles.setCargaHoraria(12);

        Mentoria fullstack = new Mentoria();
        fullstack.setTitulo("FullStack");
        fullstack.setDescricao("Aprenda como se tornar um FullStack"); 
        fullstack.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp First");  
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45)); 
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoHTTP, cursoIngles, cursoJava);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev murillo = new Dev();
        murillo.setNome("Murillo");
        
        Dev barbara = new Dev();
        barbara.setNome("Barbara"); 

        murillo.inscrever(fullstack);
        murillo.inscrever(bootcamp);
        murillo.progredir();
        murillo.progredir();


        barbara.inscrever(fullstack);
        barbara.inscrever(bootcamp);
        barbara.progredir();
        barbara.progredir();
        barbara.progredir();


    }
}
