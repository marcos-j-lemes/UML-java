class Produto {
    private static int id ;
    private String nome;
    private double preco;
    private static int allId; 

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

        allId++;
        this.id = allId;
    }

    public final void AtualizarPreco(double valor) {
        this.preco = valor;
    }

    public final void Desconto(double valor) {
        this.preco -= valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("ps5", 5100);
        Produto p2 = new Produto("ps5", 5100);
        Produto p3 = new Produto("ps5", 5100);
        Produto p4 = new Produto("ps5", 5100);
        Produto p5 = new Produto("ps5", 5100);

        System.out.println(p5);
        
        
    }
}