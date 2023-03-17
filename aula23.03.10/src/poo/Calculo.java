package poo;

public class Calculo {
    /*Crie uma classe chamada Calculo que deverá ter apenas um atributo inteiro chamado
    saldo que deverá ser encapsulado e inicializado com o valor 0. Essa classe conterá três métodos públicos
    chamados credito, debito e getSaldo. O método credito soma o valor recebido como parâmetro ao
    atributo saldo, o método debito subtrai o valor recebido como parâmetro do atributo saldo. Já o método
    getSaldo retorna o conteúdo do atributo saldo. Crie uma classe de teste que cria uma instancia de
    Calculo. Em seguida é feita uma operação de crédito no objeto e depois outra operação de debito. Depois
    o programa mostrará o saldo final do objeto.*/

    private double saldo;

    public Calculo(){
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void credito(double valor){
        this.saldo += valor;
    }
    public void debito(double valor){
        this.saldo -= valor;
    }

}
