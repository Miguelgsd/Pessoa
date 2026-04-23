public class TestePessoa{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Miguel", 17, "1234567890");
        Pessoa pessoa2 = new Pessoa();
        
        System.out.println("Primeira versão:\n-------------------------\n");
        System.out.println("Pessoa 1: \nNome: " + pessoa1.nome + "\nIdade: " + pessoa1.idade + "\nCPF: " + pessoa1.cpf);
        System.out.println("\n\nPessoa 2: \nNome: " + pessoa2.nome + "\nIdade: " + pessoa2.idade + "\nCPF: " + pessoa2.cpf);
        
        pessoa2.setPessoa("Miguel2", 22, "00000000000");

        System.out.println("\nSegunda versão:\n-------------------------\n");
        System.out.println("Pessoa 2: \nNome: " + pessoa2.nome + "\nIdade: " + pessoa2.idade + "\nCPF: " + pessoa2.cpf);
    }
} 
