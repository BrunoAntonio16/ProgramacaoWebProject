package Model;

import Emums.EnumTurnos;

public class Turma {
    private int codigoCurso;
    private EnumTurnos turnoCurso;

    public Turma(String turnoCurso) {
        // Abaixo está definido que os valores que forem recebidos em string na variavel EnumTurno irão ser transformadas em valores Enum definidos na classe EnumTurnos
        this.turnoCurso = EnumTurnos.valueOf(turnoCurso);
    }


    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso() {
        codigoCurso = codigoCurso++;
    }

    public EnumTurnos getTurnoCurso() {
        return turnoCurso;
    }

    public void setTurnoCurso(EnumTurnos turnoCurso) {
        this.turnoCurso = turnoCurso;
    }
}
