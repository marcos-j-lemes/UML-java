package org.example;

abstract class A {
    abstract void m();
    abstract void m2(int i);
}

interface B {
    void m();
    void m2(int i);
}


class N extends A  implements B {
    public void m() {
        System.out.println("m");
    }

    public void m2(int i) {
        System.out.println("m2");
    }
}

class Alphabt extends A {

    public void m() {
        System.out.println("Alphabt");
    }

    public void m2(int i) {
        System.out.println("Alphabt " + i);
    }
}

//cada conta corrente possui um saldo.
// É possível realizar depósitos e saques,
// aumentando
// e reduzindo o saldo, respectivamente.
// Para cada saque também deve ser debitada uma taxa de operação equivalente à 0,5% do valor sacado

class  Conta {

    private double saldo;
    private double limite;
    private final int idConta;

    private double descontoSobUltimaOperacao;
    protected double valueTax = 0.5;

    private static int contas;

    public final void tax(){
        this.saldo = saldo * (1 - valueTax / 100);
        descontoSobUltimaOperacao = saldo * (valueTax /100);
    }

    public final void setTax(double tax){
        this.valueTax =  tax;
    }

    public final double getTax(){
        return valueTax;
    }

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        contas++;
        idConta = contas;
    }

    public double verSaldo() {
        return saldo;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo;
        this.tax();
    }

    public double verLimite() {
        this.tax();
        return limite;
    }

    public void aumetarLimite(double limite) {
        this.limite = limite;
    }

    public final void depositar(double valor) {
        this.saldo += valor ;
       // this.tax();

    }

    public final double getDescontoSobUltimaOperacao(){
        return descontoSobUltimaOperacao;
    }

    @Override
    public String toString() {
        return "Conta: " + idConta + " saldo = " + saldo + ", limite = " + limite +"\nTaxa sob operações:"+this.getTax() + "\nValor descontado: "+ this.getDescontoSobUltimaOperacao();
    }
}

class ContaEspecial extends Conta {

    public final void menosTax(){
        valueTax = 0.1;
    }
    public ContaEspecial(double saldo, double limite) {
        super(saldo, limite);
        menosTax();
    }
}

public class App {

    public static void main(String[] args) {

        Conta cl1 = new Conta(100, 10);
        ContaEspecial cl1e = new ContaEspecial(100, 10);

        cl1.sacar(99);
        cl1e.sacar(99);

        System.out.println(cl1);
        System.out.println("  ");
        System.out.println(cl1e);

        System.out.println(cl1.verSaldo());

        Alphabt a = new Alphabt();

        System.out.println(a);
    }
}
