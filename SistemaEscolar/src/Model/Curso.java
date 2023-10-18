package Model;
import Emums.EnumTurnos;
import GerenciadorSistema.GerenciadorAluno;

public class Curso {
    //nomeCurso codigoCurso periodoCurso turnoCurso
    private int codigoCurso;
    private String nomeCurso;

    public Curso(){}
    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;

    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso() {
        codigoCurso = codigoCurso++;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
