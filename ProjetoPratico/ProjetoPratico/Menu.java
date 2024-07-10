package ProjetoPratico.ProjetoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    //Contar linhas e colunas, dentro de uma função.
    //criar matriz com o numero de linhas e colunas contado
    //Criar menu do ADMIN

    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {
        String[][] matrizCompleta = new String[contarLinhasFicheiro(path) - 1][4];
        Scanner scFicheiro = new Scanner(new File(path));
        String linha = scFicheiro.nextLine();

        int contadorLinhaMatriz = 0;

        while (scFicheiro.hasNextLine()) {
            linha = scFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }

            contadorLinhaMatriz++;

        }

        return matrizCompleta;
    }

    private static int contarLinhasFicheiro(String path) {
       //scanner.hasNextLine
        return 0;
    }


    public static void imprimirAdmin(String admin, String[][] matrizCompleta) throws FileNotFoundException {
    }

    public static void imprimirPassword(String password, String[][] matrizCompleta) throws FileNotFoundException {
    }
    public static int lerPositivoInteiro() {

        Scanner input = new Scanner(System.in);

        int numeroLido;

        do {

            System.out.print("Introduza um número inteiro: ");
            numeroLido = input.nextInt();

        } while (numeroLido < 0);

        return numeroLido;
    }
    public static void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        String[][] matrizAdmin = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Admins.csv");
        String[][] matrizCategoria = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Categorias.csv");


        do {
            System.out.println("\n***** Menu Admin *****");
            System.out.println("1. Imprimir ficheiros ( Vendas, Clientes, Categorias).");
            System.out.println("2. Vendas totais.");
            System.out.println("3. Total lucro.");
            System.out.println("4. Pesquisa de cliente.");
            System.out.println("5. Jogo mais caro.");
            System.out.println("6. Melhores clientes.");
            System.out.println("7. Melhor categoria.");
            System.out.println("8. Pesquisa Vendas.");
            System.out.println("9. Top 5 Jogos.");
            System.out.println("10. Bottom 5 Jogos.");
            System.out.println("\nSelecione a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Imprimir Ficheiro de Venda, Clientes e Categorias
                    break;

                case 2: // Pesquisar por Vendas Totais
                    break;

                case 3:  // Pesquisar por Total lucro
                    break;

                case 4:  // Pesquisar melhor cliente
                    break;

                case 5:  // Jogo mais caro
                    break;

                case 6:  // Melhores Clientes
                    break;

                case 7:  // Melhor categoria
                    break;

                case 8:  // Pesquisar Vendas
                    break;

                case 9:  // Top 5 Jogos
                    break;

                case 10:  // Bottom 5 Jogos
                    break;

                default:
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
                    break;

            }


        } while (opcao != 6);
    }

    public static void menuClientes() throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    int opcao = 0;

    String[][] matrizCliente = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Clientes.csv");
    String[][] matrizCategoria = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Categorias.csv");


        do {
        System.out.println("\n***** Menu Cliente *****");
        System.out.println("1. Novo Registo.");
        System.out.println("2. Procurar estacionamento.");
        System.out.println("3. Imprimir Catálogo.");
        System.out.println("4. Imprimir Catálogos Gráficos.");
        System.out.println("5. Imprimir Catálogo Editora.");
        System.out.println("6. Imprimir Catálogo Categoria.");
        System.out.println("7. Imprimir jogo mais recente.");
        System.out.println("\nSelecione a sua opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1: // Novo Registo

                break;

            case 2: // Procurar estacionamento (Em conflito...)

                /** public static boolean triangular(int num) {
                    num = lerPositivoInteiro();
                    int triangulares = 0;
                for (int i = 1; triangulares < num; i++) {

                    triangulares = triangulares + i;

                    // System.out.println("Vou comparar o " + num + " com o " + triangulares);
                    if (num == triangulares) {
                        return true;
                    }

                }

                return false;
            }
            int numero;
            System.out.print("Introduza seu numero: ");
            numero = input.nextInt();
            if(triangular(numero)){
                System.out.println("Triangular");
            }else{
                System.out.println("Não Triangular");
            }
            break;*/

            case 3:  // Imprimir Catálogo
                break;

            case 4:  // Imprimir Catálogos Gráficos
                break;

            case 5:  // Imprimir Catálogo Editora
                break;

            case 6:  // Imprimir Catálogo Categoria
                break;

            case 7:  // Imprimir jogo mais recente
                break;

            default:
                System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
                break;

        }


    } while (opcao != 6);
}






    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }
}
