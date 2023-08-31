package QUESTAO2;/*
a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
receber (salário + bônus).
c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
getGastos() e getInfo ().
*/


class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos() {
        // Somando o bônus de R$ 40 por hora/aula
        return this.salario + (this.horasAula * 40);
    }

    String getInfo() {
        // Retornando informações atualizadas com o bônus
        return "Nome: " + this.nome + ", Salário: R$ " + getGastos();
    }

    public static void main(String[] args) {
        // Criando um objeto QUESTAO2.EmpregadoDaFaculdade
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("João", 2000, 10);

        // Exibindo os resultados dos métodos getGastos() e getInfo()
        System.out.println("Gastos: R$ " + empregado.getGastos());
        System.out.println(empregado.getInfo());
    }
}