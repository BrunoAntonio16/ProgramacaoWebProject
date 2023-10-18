package Model;

public class Aluno extends Pessoa {
    private int matriculaAluno;
    private float media;
    private boolean status;
    private String senha, email;

    private Curso cursoAluno;

    //String nota1, nota2, nota3;
    public Aluno(String nome, char sexo, String data_nascimento, String email, String senha/* String media, String nota1, String nota2, String nota3*/){
        super(nome, sexo, data_nascimento);
        this.senha = senha;
        this.email = email;
    }

    public Aluno(){
    }

    public int getMatricula() {
        return matriculaAluno;
    }

    public void setMatricula() {
        matriculaAluno = matriculaAluno++;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public boolean getStatus() {
        return status;
    }

    public void StatusIrregular(Aluno aluno) {
        aluno.status = false;
        System.out.println("O status está irregular ");
    }

    public void StatusRegular(Aluno aluno){
        aluno.status = true;
        System.out.println("Status do aluno regular ");
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Curso getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(Curso curso) {
        this.cursoAluno = curso;
    }
}

