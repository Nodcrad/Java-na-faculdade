public class Main {
    public static void main(String[] args) {
        //Funcionario f1 = new Funcionario("Ana", 2000); // linha 1
        Funcionario f2 = new Professor("Bia", 2000, 20); // linha 2
        // Professor f3 = new Funcionario("Caio", 1800); // linha 3
        Funcionario f4 = new Tecnico("Davi", 1800); // linha 4
        System.out.println(f4.calcularSalario());
        Funcionario f5 = new Coordenador("Artur",2000,500);
        System.out.println(f5.calcularSalario());
    }
}
