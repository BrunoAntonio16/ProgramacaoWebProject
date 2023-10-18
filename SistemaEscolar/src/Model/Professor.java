package Model;

import GerenciadorSistema.GerenciadorProfessor;
import GerenciadorSistema.GerenciadorTurmas;

public class Professor extends Pessoa {
    private int matriculaFuncionario;
    private double salario;
    private String email, senha;
    private GerenciadorProfessor turmasprofessor;
    public Professor(String nome, char sexo, String email, String senha, String data_nascimento) {
        super(nome, sexo, data_nascimento);
        this.email = email;
        this.senha = senha;

    }

    public Professor() {
    }
    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario() {
        matriculaFuncionario = matriculaFuncionario++;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    /*public GerenciadorTurma turmaAddProfessor(GerenciadorTurmas a){
        turmasprofessor.getlistaProfessores();
    } */
}