import java.time.LocalDate;

import componentes.Bootcamp;
import componentes.Curso;
import componentes.Dev;
import componentes.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Trilha Java developer");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Trilha JavaScript developer");
        curso2.setCargaHoraria(4);        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" - POO");
        mentoria.setDescricao("Paradigma de Programaçao Orientada a Objetos");
        mentoria.setData(LocalDate.now());

        //Saída dos Cursos e mentoria:
        System.out.println(curso1 + "\n");
        System.out.println(curso2 + "\n");
        System.out.println(mentoria + "\n");
        System.out.println("--------------------------------");

        //Bootcamp = (curso1 + curso2) + mentoria;
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolvimento Java Backend");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        //Dev Marcos:
        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        //Saída inscrição, antes de progredir:
        System.out.println("Conteudos Inscritos Marcos: " + devMarcos.getConteudosInscritos() + "\n");
        devMarcos.progredir();
        devMarcos.progredir();
        //Saída inscrição, após de progredir:
        System.out.println("Conteudos Inscritos Marcos: " + devMarcos.getConteudosInscritos() + "\n");
        //Saída conteúdos concluidos:
        System.out.println("Conteudos Concluidos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP atual de Marcos: " + devMarcos.caucularTotalXp() + "\n");
        
        //divisor
        System.out.println("------------" + "\n");
        
        //Dev Joao:
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos() + "\n");

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();        
        //Saída conteúdos concluidos:
        System.out.println("Conteúdos Concluidos Joao: " + devJoao.getConteudosConcluidos() + "\n");
        System.out.println("XP atual de joao: " + devJoao.caucularTotalXp());

    }

}
