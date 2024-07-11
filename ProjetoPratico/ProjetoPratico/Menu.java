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
        String linha;

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

    public static int contarLinhasFicheiro(String path) {
        //linha = scannerFicheiro.nextLine();
        // }while (scannerFicheiro.hasNextLine;)
        return 0;
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


    /*   public static void menuClientes() throws FileNotFoundException {
     *  Scanner input = new Scanner(System.in);
     *  int opcao = 0;
     *  <p>
     *  String[][] matrizCliente = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Clientes.csv");
     *  String[][] matrizCategoria = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Categorias.csv");
     *  <p>
     *  <p>
     *  do {
     *  System.out.println("\n***** Menu Cliente *****");
     *  System.out.println("1. Novo Registo.");
     *  System.out.println("2. Procurar estacionamento.");
     *  System.out.println("3. Imprimir Catálogo.");
     *  System.out.println("4. Imprimir Catálogos Gráficos.");
     *  System.out.println("5. Imprimir Catálogo Editora.");
     *  System.out.println("6. Imprimir Catálogo Categoria.");
     *  System.out.println("7. Imprimir jogo mais recente.");
     *  System.out.println("\nSelecione a sua opção: ");
     * opcao = input.nextInt();
     * <p>
     * switch (opcao) {
     * case 1: // Novo Registo
     * <p>
     * break;
     * <p>
     * case 2: // Procurar estacionamento (Em conflito...)
     * <p>
     * public static boolean triangular(int num) {
     * num = lerPositivoInteiro();
     * int triangulares = 0;
     * <p>
     * for (int i = 1; triangulares < num; i++) {
     * <p>
     * triangulares = triangulares + i;
     * <p>
     * // System.out.println("Vou comparar o " + num + " com o " + triangulares);
     * if (num == triangulares) {
     * return true;
     * }
     * <p>
     * }
     * <p>
     * <p>
     * }
     * int numero;
     * System.out.print("Introduza seu numero: ");
     * numero = input.nextInt();
     * if(triangular(numero)){
     * System.out.println("Triangular");
     * }else{
     * System.out.println("Não Triangular");
     * }
     * break;
     * <p>
     * case 3:  // Imprimir Catálogo
     * break;
     * <p>
     * case 4:  // Imprimir Catálogos Gráficos
     * break;
     * <p>
     * case 5:  // Imprimir Catálogo Editora
     * break;
     * <p>
     * case 6:  // Imprimir Catálogo Categoria
     * break;
     * <p>
     * case 7:  // Imprimir jogo mais recente
     * break;
     * <p>
     * default:
     * System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
     * break;
     * <p>
     * }
     * <p>
     * <p>
     * } while (opcao != 6);
     * }
     * <p>
     * public static void main(String[] args) throws FileNotFoundException {
     * menu();
     * }*/

    /* registo do cliente funciona!
    public static void menuPrincipal(String nomeCliente, String email, int contacto) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um nome: ");
        nomeCliente = input.next();
        System.out.print("Introduza um numero para contacto: ");
        contacto = input.nextInt();
        System.out.print("Introduza um email: ");
        email = input.next();

        System.out.println();
    }

    }*/



    public static void lerTxtParaCatalogo(String pathOrigem) throws FileNotFoundException {
        Scanner scannerOrigem = new Scanner(new File(pathOrigem));
        while(scannerOrigem.hasNextLine()) {
            String linha = scannerOrigem.nextLine();
            System.out.println(linha);

        }

    }
    public static void  lerCatalogoGrafico (String pathOrigem) throws FileNotFoundException {
        Scanner scannerOrigem = new Scanner(new File(pathOrigem));
        while (scannerOrigem.hasNextLine()) {
            String linha = scannerOrigem.nextLine();
            System.out.println(linha);
        }//copiar nome de jogo para array, se o nome não existir no array (usando boolean)
    }




    public static void main(String[] args) throws FileNotFoundException {

    }
}