package QUESTÃO1;

/*
Uma concessionária que compra e vende veículos seminovos necessita criar um novo
sistema orientado a objetos. Para isso contratou um desenvolver de sistemas que
mapeou inicialmente as seguintes classes: QUESTÃO1.Carro, QUESTÃO1.Cliente e Transação.
a) Implemente a criação dessas classes em um novo projeto Java.
b) Crie os possíveis atributos de cada classe
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
