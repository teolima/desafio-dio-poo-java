package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java");
        curso2.setDescricao("Descrição do curso de Java");
        curso2.setCargaHoraria(5);

      
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        
       /* System.out.println("Curso:");
        System.out.println(curso1);

        System.out.println("\nMentoria:");
        System.out.println(mentoria1);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("descrição  bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devTeo = new Dev();
        devTeo.setNome("Teo");
        devTeo.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteúdos inscritos Teo" + devTeo.getConteudosInscritos());
        devTeo.progredir();
        devTeo.progredir();
        devTeo.progredir();

        System.out.println("--------------");
        System.out.println("Conteúdos inscritos Zé" + devTeo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Teo" + devTeo.getConteudosConcluidos());
        System.out.println("XP:" + devTeo.calcularTotalXp() );
        
     
              
        Dev devZe = new Dev();
        devZe.setNome("Ze");
        devZe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Zé" + devZe.getConteudosInscritos());
        devZe.progredir();
        
        System.out.println("--------------");
        System.out.println("Conteúdos inscritos Zé" + devZe.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Zé" + devZe.getConteudosConcluidos());
        System.out.println("XP:" + devZe.calcularTotalXp() );
        
		 
		
	
		
		
	}
}
