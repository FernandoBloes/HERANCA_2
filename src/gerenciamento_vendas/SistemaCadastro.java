package gerenciamento_vendas;
// Classe para Vendedor
class Vendedor {
    private String nome, cpf, dataNascimento, dataContratacao;
    private double salarioBase, percentualComissao;

    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String toString() {
        return "Vendedor: " + nome + " (CPF: " + cpf + ")";
    }
}

// Classe para Gerente
class Gerente {
    private String nome, cpf, dataNascimento, dataContratacao;
    private double salarioBase;
    private String departamento;

    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente: " + nome + " (CPF: " + cpf + ")";
    }
}

// Classe para Cliente
class Cliente {
    private String nome, cpf, dataNascimento, email, numeroCartaoFidelidade, telefone;

    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (CPF: " + cpf + ")";
    }
}

// Classe principal
public class SistemaCadastro {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João Silva", "123.456.789-00", "01/01/1990", "10/01/2020", 3000.0, 10.0);
        Gerente gerente = new Gerente("Maria Souza", "987.654.321-00", "15/05/1985", "20/02/2018", 5000.0, "Vendas");
        Cliente cliente = new Cliente("Carlos Pereira", "456.123.789-00", "10/10/1995", "carlos@email.com", "12345", "1234-5678");

        System.out.println(vendedor);
        System.out.println(gerente);
        System.out.println(cliente);
    }
}
