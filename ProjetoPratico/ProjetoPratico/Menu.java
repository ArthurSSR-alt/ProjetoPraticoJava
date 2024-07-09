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
        Scanner scannerFicheiro = new Scanner(new File(path));
        String linha = scannerFicheiro.nextLine();

        int contadorLinhaMatriz = 0;

        while (scannerFicheiro.hasNextLine()) {
            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }

            contadorLinhaMatriz++;

        }

        return matrizCompleta;
    }

    private static int contarLinhasFicheiro(String path) {
        return 0;
    }


    public static void imprimirAdmin(String admin, String[][] matrizCompleta) throws FileNotFoundException {
    }

    public static void imprimirPassword(String password, String[][] matrizCompleta) throws FileNotFoundException {
    }


    public static void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        String[][] matrizAdmin = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Admins.csv");
        String[][] matrizCategoria = lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Categorias.csv");


        do {
            System.out.println("\n***** Menu Admin *****");
            System.out.println("1. Vendas.");
            System.out.println("2. Relatórios.");
            System.out.println("3. Clientes registados.");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. Sair");
            System.out.println("\nSelecione a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisar por vendas no ficheiro de vendas
                    break;

                case 2: // Pesquisar por relatórios no ficheiro de relatórios
                    break;

                case 3:  // Pesquisar por clientes registados no ficheiro de clientes registados
                    break;

                case 4:  // Pesquisar músicas com duração acima de um valor especificado
                    break;

                case 5:  // Número de músicas no ficheiro
                    break;

                case 6:  // Sair
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
