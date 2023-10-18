package GerenciadorSistema;
import Model.Aluno;
import Model.Curso;
import Model.Professor;

public class Cadastros {
    //Essa classe é temporária e será substituída com a parte da web
    // onde os dados serão coletados de acordo com a proposta do professor Mayrton.
    public void CadastrarAluno(){
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        aluno.setNome("INAJÁ");             //(webNome);
        aluno.setMatricula();               //A MATRICULA É GERADA PELO SISTEMA
        System.out.println("Sexo: ");
        aluno.setSexo('M');                 //(webSexo);
        System.out.println("Email: ");
        aluno.setEmail("loucoo@gmail.com"); //(webEmail);
        System.out.println("Crie uma Senha: ");
        aluno.setSenha("654321");           //(webSenha);
        System.out.println("Data de Nascimento: ");
        aluno.setData_nascimento("23/05/199");//(webDataNascimento);
        //aluno.setCursoAluno(/*"Aqui é preciso passar um objeto do tipo curso"*/);//(webCursoAluno)
    }

    public void CadastrarProfessor(){
        Professor professor = new Professor();

        System.out.println("Nome: ");
        professor.setNome("Ramos");             //(webNome);
        professor.setMatriculaFuncionario();    //A MATRICULA É GERADA PELO SISTEMA
        System.out.println("Sexo: ");
        professor.setSexo('M');                 //(webSexo);
        System.out.println("Email: ");
        professor.setEmail("raminho@gmail.com");//(webEmail);
        System.out.println("Crie uma Senha: ");
        professor.setSenha("123456");
        System.out.println("Data de Nascimento: ");
        professor.setData_nascimento("23/05/1999");//(webDataNascimento);
        //professor.setCursoAluno(/*"Aqui é preciso passar um objeto do tipo curso"*/);//(webCursoAluno)
    }
    public void CadastrarCurso(){
        Curso curso = new Curso();

        curso.setCodigoCurso();//Codigo do curso é gerado peço sistema
        System.out.println("Informe o nome do curso");
        curso.setNomeCurso("ADS - Analise e Dessenvolvimento de Sistemas ");//(webNomeCurso);
        System.out.println("Noite");//(webTurnoCurso);
    }

}
