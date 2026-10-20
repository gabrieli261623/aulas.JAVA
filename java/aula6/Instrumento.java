class Instrumento {

    public String marca;
    public String modelo;
    public double preco;
    public String cor;

    public Instrumento(String marca, String modelo, double preco, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;
    }

    public void mostrarDados() {
        System.out.println("modelo: " + modelo);
        System.out.println("marca: " + marca);
        System.out.println("preço: " + preco);
        System.out.println("cor: " + cor);
    }

    void tocar() {
        System.out.println("Instrumento tocando");
    }
}

class Violao extends Instrumento {

    int cordas;

    public Violao(String marca, String modelo, double preco, String cor, int cordas) {
        super(marca, modelo, preco, cor);
        this.cordas = cordas;
    }

    @Override
    void tocar() {
        System.out.println("Violão tocando acordes");
    }
}

class Piano extends Instrumento {

    int teclas;

    public Piano(String marca, String modelo, double preco, String cor, int teclas) {
        super(marca, modelo, preco, cor);
        this.teclas = teclas;
    }

    @Override
    void tocar() {
        System.out.println("Piano tocando melodia");
    }
}

public class Main {

    public static void main(String[] args) {

        Instrumento i1 = new Instrumento();
        Instrumento i2 = new Violao();
        Instrumento i3 = new Piano();

        i1.tocar();
        i2.tocar();
        i3.tocar();
    }
}

