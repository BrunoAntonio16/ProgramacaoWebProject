package GerenciadorSistema;

import Model.Aluno;
import Model.Curso;

import java.util.LinkedList;

public class GerenciadorCurso {
    private LinkedList<Curso> cursos;
    private static GerenciadorCurso existeLista = null;
    private GerenciadorCurso(){
        this.cursos = new LinkedList<Curso>();
    }
    public static GerenciadorCurso getInstance(){
        if(existeLista == null){
            existeLista = new GerenciadorCurso();
        }
        return existeLista;
    }
    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
    }
    public boolean buscarCurso(Curso curso){

        for(Curso curso1: this.cursos){
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
