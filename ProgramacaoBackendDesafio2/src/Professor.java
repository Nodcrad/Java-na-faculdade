public class Professor extends Funcionario{
    private int sala;
    public Professor(String nome,double salarioBase, int sala){
        super(nome,salarioBase);
        this.sala = sala;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase*0.1;
    }
}
