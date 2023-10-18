package GerenciadorSistema;

import Model.Curso;
import Model.Turma;

import java.util.LinkedList;

public class GerenciadorTurmas {
    private LinkedList<Turma> turmas;
    private static GerenciadorTurmas existeLista = null;
    private GerenciadorTurmas(){
        this.turmas = new LinkedList<Turma>();
    }
    public static GerenciadorTurmas getInstance(){
        if(existeLista == null){
            existeLista = new GerenciadorTurmas();
        }
        return existeLista;
    }
    public void adicionarTurmas(Turma turma){
        this.turmas.add(turma);
    }
    public boolean buscarTurmas(Turma turma){

        for(Curso curso1: this.turmas){
            if (curso1.getCodigoCurso() == curso.getCodigoCurso()){
                return true;
            }
        }
        return false;
    }
    public String listarCurso(){
        String texto = "";

        for(Curso curso1: this.cursos){
            texto = texto + "Nome: " + curso1.getCodigoCurso();
        }
        return texto;
    }
    public void removerCurso(Curso curso){
        this.cursos.remove(curso);
    }
}
