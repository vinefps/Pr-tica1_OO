package QUESTÃO1;/*
Uma concessionária que compra e vende veículos seminovos necessita criar um novo
sistema orientado a objetos. Para isso contratou um desenvolver de sistemas que
mapeou inicialmente as seguintes classes: QUESTÃO1.Carro, QUESTÃO1.Cliente e Transação.
a) Implemente a criação dessas classes em um novo projeto Java.
b) Crie os possíveis atributos de cada classe
 */

import QUESTÃO1.Carro;
import QUESTÃO1.Cliente;

public class Transacao {
    private Cliente cliente;
    private Carro carro;
    private double valor;

    // Construtor
    public Transacao(Cliente cliente, Carro carro, double valor) {
        this.cliente = cliente;
        this.carro = carro;
        this.valor = valor;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
