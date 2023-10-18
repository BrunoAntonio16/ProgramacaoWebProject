package Model;
public abstract class Pessoa {

    //Logo abaixo estão sendo definidas os atributos da classe Pessoas.Pessoas
    private String nome;
    private char sexo;
    private String data_nascimento;

    //Esse carinha logo abaixo é o CONSTRUTOR, que basicamente armazena um espaço na memoria do pc para os valores que vão ser atribuidos, ele inicializa um valor que ainda não foi declarado
    public Pessoa(String nome, char sexo, String data_nascimento) {
        this.nome = nome;

        this.sexo = sexo;

        this.data_nascimento = data_nascimento;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}