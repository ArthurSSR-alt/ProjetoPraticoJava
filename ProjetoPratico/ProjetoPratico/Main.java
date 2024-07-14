package ProjetoPratico.ProjetoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    //Contar linhas e colunas, dentro de uma função.
    //criar matriz com o numero de linhas e colunas contado
    //Criar menuAdmin do ADMIN

    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {
        Scanner scFicheiro = new Scanner(new File(path));

        int quantidadeParametros = 0;
        if (scFicheiro.hasNextLine()) quantidadeParametros = scFicheiro.nextLine().split(";").length;

        String[][] matrizCompleta = new String[contarLinhasFicheiro(path)][quantidadeParametros];
        String linha;

        int contadorLinhaMatriz = 0;

        while (scFicheiro.hasNextLine()) {
            linha = scFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            for (int coluna = 0; coluna < quantidadeParametros; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }

            contadorLinhaMatriz++;

        }

        return matrizCompleta;
    }

    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {
        int quantidadeLinhas = 0;

        Scanner scanner = new Scanner(new File(path));
        if (scanner.hasNextLine()) scanner.nextLine();
        else return 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            quantidadeLinhas++;
        }

        return quantidadeLinhas;
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

    public static void menuAdmin() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;


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
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Imprimir Ficheiro de Venda, Clientes e Categorias
                    lerCsvParaMatriz("ProjetoPratico/GameStart/GameStart_Vendas.csv");
                    // Scanner scanner = new scanner File(path());
                    //switch tres opcoes, se ele quiser ler vendas ele vai ler só a coluna vendas


                    break;

                case 2: // Pesquisar por Vendas Totais
                    exibirTotalDeVendas("ProjetoPratico/GameStart/GameStart_Vendas.csv");

                    break;

                case 3:  // Pesquisar por Total lucro
                    exibirTotalDeLucro("ProjetoPratico/GameStart/GameStart_Vendas.csv", "ProjetoPratico/GameStart/GameStart_Categorias.csv");

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

                case 11: // Sair
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");

            }


        } while (opcao != 11);
    }

    public static void exibirTotalDeLucro(String pathVendas, String pathCategorias) throws FileNotFoundException {
        String[] valoresNomeCategoria, valoresPercentagemCategoria, valoresCategoriaVendas, valoresValorVendas;

        valoresNomeCategoria = obterValores(pathCategorias, "nomeCategoria", ";");
        valoresPercentagemCategoria = obterValores(pathCategorias, "percentagemMargem", ";");

        valoresCategoriaVendas = obterValores(pathVendas, "categoria", ";");
        valoresValorVendas = obterValores(pathVendas, "valor", ";");

        double lucroTotal = 0;

        for (int i = 0; i < valoresCategoriaVendas.length; i++) {
            String categoria = valoresCategoriaVendas[i];
            int indexNomeCategoria = -1;
            for (int j = 0; j < valoresNomeCategoria.length; j++) {
                if (valoresNomeCategoria[j].equals(categoria)) indexNomeCategoria = j;
            }

            if (indexNomeCategoria > -1) {
                double porcentagemLucro = Double.parseDouble(valoresPercentagemCategoria[indexNomeCategoria]);
                double valorVenda = Double.parseDouble(valoresValorVendas[i]);

                lucroTotal += (valorVenda * porcentagemLucro) / 100;
            }
        }

        System.out.println("Lucro total das vendas por categoria: " + lucroTotal);
    }

    public static String imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNext()) {
            String LinhaAtual = scannerFicheiro.nextLine();
            System.out.println(LinhaAtual);
        }
        return path;
    }

    public static void exibirTotalDeVendas(String path) throws FileNotFoundException {
        int quantidadeVendas = contarLinhasFicheiro(path);
        String[] precoVendas = obterValores(path, "valor", ";");

        double valorTotal = 0;

        for (int i = 0; i < precoVendas.length; i++) {
            valorTotal += Double.parseDouble(precoVendas[i]);
        }

        System.out.println("Quantidade de vendas: " + quantidadeVendas + "\n Valor total: " + valorTotal);
    }

    public static String[] obterValores(String path, String campo, String delimitador) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        if (!scanner.hasNextLine()) return null;

        String header = scanner.nextLine();
        if (header.contains(campo)) {
            String[] campos = header.split(delimitador);

            int indexCampo = -1;
            for (int i = 0; i < campos.length; i++) {
                if (campos[i].equals(campo)) indexCampo = i;
            }

            if (indexCampo > -1) {
                int quantidadeLinhas = contarLinhasFicheiro(path);
                String[] valoresCampoEspecifico = new String[quantidadeLinhas];

                for (int i = 0; i < quantidadeLinhas; i++) {
                    valoresCampoEspecifico[i] = scanner.nextLine().split(delimitador)[indexCampo];
                }

                return valoresCampoEspecifico;
            }
        }

        return null;
    }

    public static void menuClientes() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;


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
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1: // Novo Registo
                    //Registo de Cliente.
                    String nomeCliente, contacto,email;
                    System.out.println("Inserir Cliente");
                    System.out.println("Insira nome:");
                    nomeCliente=scanner.next();
                    System.out.println("Insira Contacto:");
                    contacto=scanner.next();
                    System.out.println("Insira Email:");
                    email=scanner.next();
                    System.out.println("Cliente Inserido com Sucesso:"+nomeCliente+"|"+contacto+"|"+email);
                    break;

                case 2: // Procurar estacionamento em números triangulares
                    int limite = 121;
                    for (int i = 1; ; i++) {
                        int triangular = i * (i + 1) / 2; // formula de um numero triangular
                        if (triangular > limite) {
                            break;
                        }
                        if (triangular % 5 == 0) {
                            System.out.println("Lugar de vaga: " + triangular);
                        }
                    }
                    System.out.println("Vagas calculadas com sucesso!");
                    break;


                case 3:  // Imprimir Catálogo
                    lerTxtParaCatalogo("ProjetoPratico/GameStart/CatalogoGrafico");


                    break;

                case 4:  // Imprimir Catálogos Gráficos

                    System.out.println("Escolha uma opção.");
                    System.out.println("1. callOfDuty");
                    System.out.println("2. fifa");
                    System.out.println("3. hollowKnight");
                    System.out.println("4. minecraft");
                    System.out.println("5. mortalKombat");
                    System.out.println("6. overcooked");
                    System.out.println("7. witcher3");
                    opcao = scanner.nextInt();

                    switch (opcao) {

                        case 1://callofduty
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/callOfDuty.txt");
                            break;
                        case 2:
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/fifa.txt");
                            break;
                        case 3:
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/hollowKnight.txt");
                            break;
                        case 4:
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/minecraft.txt");
                            break;
                        case 5:
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/mortalKombat.txt");
                            break;
                        case 6:
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/overcooked.txt");
                            break;
                        case 7:
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/witcher3.txt");
                            break;
                        default:
                    }
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

    /*registo do
    cliente funciona!*/

    public static void menuRegisto(String nomeCliente, String email, int contacto) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um nome: ");
        nomeCliente = input.next();
        System.out.print("Introduza um numero para contacto: ");
        contacto = input.nextInt();
        System.out.print("Introduza um email: ");
        email = input.next();

        System.out.println();
    }

    public static void lerTxtParaCatalogo(String pathOrigem) throws FileNotFoundException {
        Scanner scannerOrigem = new Scanner(new File(pathOrigem));
        while (scannerOrigem.hasNextLine()) {
            String linha = scannerOrigem.nextLine();
            System.out.println(linha);

        }
    }
/**
    public static void lerCatalogoGrafico(String pathOrigem) throws FileNotFoundException {
        Scanner scannerOrigem = new Scanner(new File(pathOrigem));
        while (scannerOrigem.hasNextLine()) {
            String linha = scannerOrigem.nextLine();
            System.out.println(linha);
        }
        //copiar nome de jogo para array, se o nome não existir no array (usando boolean)
    }*/

    //Login admin.

    public static String admin = "admin";
    public static String adminSenha = "456";

    //Funções que dão valor para as credenciais do admin.
    public static boolean adminLogin(Scanner scanner) {
        System.out.println("Digite seu usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        return
                admin.equals(usuario) &&
                        adminSenha.equals(senha);
    }
    //Função que faz o login do admin.

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

// start do programa
        while (true) {
            System.out.println("\n🤖🤖🤖 Saudações Devs, esse é o game start!🤖🤖🤖");
            System.out.println("1. Admin");
            System.out.println("2. Cliente");
            System.out.println("Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:

                    if (adminLogin(scanner)) {
                        //adminLogin, para abrir o menu do admin, assim mostrando o que tem la dentro.
                        menuAdmin();
                        //adminMenu scanner para ler a função associada ao menu do admin
                    } else {
                        System.out.println("Saindo...");
                    }
                    break;

                case 2:
                    menuClientes();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

}