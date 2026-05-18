public class Coordenador extends Funcionario{
    private double bonusGestao;

    public  Coordenador(String nome, double salarioBase, double bonusGestao){
        super(nome,salarioBase);
        this.bonusGestao = bonusGestao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusGestao;
    }
}
