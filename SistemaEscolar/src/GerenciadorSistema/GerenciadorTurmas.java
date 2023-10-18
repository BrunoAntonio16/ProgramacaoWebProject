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

        for(Turma turma1: this.turmas){
            if (turma1.getCodigoCurso() == turma.getCodigoCurso()){
                return true;
            }
        }
        return false;
    }
    public String listarTurmas(){
        String texto = "";

        for(Turma turma1: this.turmas){
            texto = texto + "Codigo da turma: " + turma1.getCodigoCurso();
        }
        return texto;
    }
    public void removerCurso(Turma turma){
        this.turmas.remove(turma);
    }
}
