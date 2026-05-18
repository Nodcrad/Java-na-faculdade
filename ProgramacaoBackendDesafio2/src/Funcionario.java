public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    public Funcionario(String nome, double base) {
        this.nome = nome;

        this.salarioBase = base;
    }
    public abstract double calcularSalario();
    public void mostrar() {
        System.out.println(nome + " - R$ " + calcularSalario());
    }
}