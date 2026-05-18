import java.util.ArrayList;
import java.util.Scanner;

// ===============================================
// Versao com interace no terminal
// ===============================================

// ===============================================
// 1. CLASSE PAI (PRODUTO)
// ===============================================
class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
        return this.precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}

// ===============================================
// 2. CLASSE FILHAS
// ===============================================
class Eletronico extends Produto {
    public Eletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase * 1.18;
    }
}

class Roupa extends Produto {
    public Roupa(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase * 1.10 * 0.95;
    }
}

class Alimento extends Produto {
    public Alimento(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase * 1.07;
    }
}

// ===============================================
// 3. CLASSE PRINCIPAL E EXECUÇÃO
// ===============================================

public class SistemaTechShop {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Eletronico("Notebook Dell", 3000.00));
        listaProdutos.add(new Eletronico("Celular", 2000.00));
        listaProdutos.add(new Roupa("Camisa Polo", 100.00));
        listaProdutos.add(new Alimento("Hambúrger", 25.00));
        listaProdutos.add(new Alimento("Refrigerante", 10.00));

        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        int opt = 1;
        do {
            System.out.println("\nOpções do sistema de gerenciamento de produtos\n1. Registrar novo produto \n2. Listar produtos\n3. Sair do programa\n");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    int tipo = 0;
                    String[] tipos = {"do Eletrônico", " da Roupa", " do Alimento"};
                    do {

                        System.out.println("Registrar que tipo de produto: \n1. Eletrônico \n2. Roupa \n3. Alimento\n");
                        tipo = sc.nextInt();

                        if (tipo > 3 || tipo < 1) {
                            System.out.println("Insira um tipo valido\n");
                            continue;
                        }

                        System.out.printf("Nome %s: ", tipos[tipo - 1]);
                        String nome = sd.nextLine();

                        System.out.printf("\nPreço %s: ", tipos[tipo - 1]);
                        double preco = sc.nextDouble();

                        switch (tipo) {
                            case 1:
                                listaProdutos.add(new Eletronico(nome, preco));
                                break;
                            case 2:
                                listaProdutos.add(new Roupa(nome, preco));
                                break;
                            case 3:
                                listaProdutos.add(new Alimento(nome, preco));
                                break;
                        }
                    } while (tipo > 3 || tipo < 1);
                    break;

                //Listar produtos
                case 2:
                    System.out.println("Lista de produtos:\n");

                    for (Produto produto : listaProdutos) {
                        double precoFinal = produto.calcularPrecoFinal();

                        System.out.printf(" %s - Preço base: R$ %.2f → Final: R$ %.2f\n",
                                produto.getNome(), produto.getPrecoBase(), precoFinal);
                    }
                    sd.nextLine();
                    break;

                default:
                    System.out.println("Saindo");
                    break;
            }
        }while(opt>0 && opt<3);

    }


}

