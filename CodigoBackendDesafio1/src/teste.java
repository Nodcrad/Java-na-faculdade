import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = 1;
        String[] tipos = {"do Eletrônico", " da Roupa", " do Alimento"};
        System.out.printf("Nome %s: ", tipos[tipo - 1]);
        String nome = sc.nextLine();
        System.out.printf("\nPreço %s: ", tipos[tipo - 1]);
        double preco = sc.nextDouble();
    }
}
