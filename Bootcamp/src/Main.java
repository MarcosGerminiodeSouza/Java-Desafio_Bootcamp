import java.time.LocalDate;
//import componentes.Conteudo;
import componentes.Curso;
import componentes.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descriçao do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descriçao do Curso JS");
        curso2.setCargaHoraria(4);        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria descriçao");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
