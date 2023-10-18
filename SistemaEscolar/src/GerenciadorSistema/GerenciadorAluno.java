package GerenciadorSistema;

import java.util.LinkedList;
import Model.Aluno;
public class GerenciadorAluno {
    //ArrayList ou LinkedList??

    private LinkedList<Aluno> alunos;
    private static GerenciadorAluno existeLista = null;

    private GerenciadorAluno(){
        this.alunos = new LinkedList<Aluno>();
    }

    public static GerenciadorAluno getInstance(){
        if(existeLista == null){
            existeLista = new GerenciadorAluno();
        }
        return existeLista;
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public boolean buscarAluno(Aluno aluno){

        for(Aluno u: this.alunos){
            if (u.getEmail().equals(aluno.getEmail()) && (u.getSenha().equals(aluno.getSenha()))){
                return true;
            }
        }
        return false;
    }

    public String listarAluno(){
        String texto = "";

        for(Aluno u: this.alunos){
            texto = texto + "Nome: " + u.getNome() + "\n";
            texto = texto + "Login: " + u.getEmail() + "\n";
            texto = texto + "Senha: " + u.getSenha() + "\n\n";
        }
        return texto;
    }

}