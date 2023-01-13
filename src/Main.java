import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso de Python");
        curso2.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de java realizado pela DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRonei = new Dev();
        devRonei.setNome("Ronei");
        devRonei.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ronei: " + devRonei.getConteudosInscritos());
        devRonei.progredir();
        devRonei.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ronei: " + devRonei.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ronei: " + devRonei.getConteudosConcluidos());
        System.out.println("XP: " + devRonei.calcularTotalXp());

        System.out.println("=========================================================");

        Dev devSimoes = new Dev();
        devSimoes.setNome("Simões");
        devSimoes.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Simões: " + devSimoes.getConteudosInscritos());
        devSimoes.progredir();
        devSimoes.progredir();
        devSimoes.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Simões: " + devSimoes.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Simões: " + devSimoes.getConteudosConcluidos());
        System.out.println("XP: " + devSimoes.calcularTotalXp());
    }
}