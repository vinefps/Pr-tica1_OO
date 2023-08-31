package QUESTÃO1;/*
Uma concessionária que compra e vende veículos seminovos necessita criar um novo
sistema orientado a objetos. Para isso contratou um desenvolver de sistemas que
mapeou inicialmente as seguintes classes: QUESTÃO1.Carro, QUESTÃO1.Cliente e Transação.
a) Implemente a criação dessas classes em um novo projeto Java.
b) Crie os possíveis atributos de cada classe
 */

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
