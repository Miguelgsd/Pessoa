public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;

    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(){
        this.nome = "SemNome";
        this.idade = 18;
        this.cpf = "12345678900";
    }

    public void setPessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

}
