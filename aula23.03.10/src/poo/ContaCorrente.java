package poo;

public class ContaCorrente {

    private String nome;
    private String senha;
    private double saldo;

    public void cadastrarSenha(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String senhaAntiga, String novaSenha) {
        if (senhaAntiga.equals(this.senha)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha antiga incorreta. Tente novamente.");
        }
    }

    public void debitar(double valor, String senha) {
        if (senha.equals(this.senha)) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Débito efetuado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
    }

    public void creditar(double valor, String senha) {
        if (senha.equals(this.senha)) {
            saldo += valor;
            System.out.println("Crédito efetuado com sucesso!");
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // construtor

    public ContaCorrente(String nome, String senha, double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }
}

