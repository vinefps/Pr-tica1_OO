/*
Crie o código abaixo em java: Criar uma classe Aluno que possui os atributos: nome, matricula, notaAV1, notaAV2,
notaAE, curso, periodo.
a) Criar o construtor desta classe que recebe nome, matricula, notaAV1, notaAV2, curso,
e periodo.
b) Criar um método para alterar cada uma das notas. Exemplo: alteraNotaAV1,
alteraNotaAV2 e alteraNotaAE.
c) Criar um método para avaliarAluno que deverá seguir a regra abaixo:
Se a soma de notaAV1 e notaAV2 for maior ou igual a 60 pontos, o aluno é Aprovado,
caso contrário será Recuperação.
O método deverá imprimir as situações de Aprovado ou Recuperação.
d) Criar um método para avaliarRecuperação que deverá receber como parâmetro o
valor da notaAE. Deverá ser calculado a nota média (notaAV1+ notaAV2 e notaAE). Se o
valor total for superior ou igual a 60 pontos, o aluno é Aprovado, caso contrário
Reprovado.
e) Criar no Void main() um objeto com dados solicitados e testes dos métodos
implementados na classe: Construtor, avaliarAluno, avaliarRecuperação caso seja
necessário. Os demais métodos também podem ser testados.
Solicite os dados pelo teclado
*/


class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double novaNotaAV1) {
        notaAV1 = novaNotaAV1;
    }

    public void alteraNotaAV2(double novaNotaAV2) {
        notaAV2 = novaNotaAV2;
    }

    public void alteraNotaAE(double novaNotaAE) {
        notaAE = novaNotaAE;
    }

    public void avaliarAluno() {
        double somaNotas = notaAV1 + notaAV2;
        if (somaNotas >= 60) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno em Recuperação");
        }
    }

    public void avaliarRecuperacao(double novaNotaAE) {
        double mediaNotas = (notaAV1 + notaAV2 + novaNotaAE) / 3;
        if (mediaNotas >= 60) {
            System.out.println("Aluno Aprovado na Recuperação");
        } else {
            System.out.println("Aluno Reprovado na Recuperação");
        }
    }
}
