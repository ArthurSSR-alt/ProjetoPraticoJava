package ProjetoPratico.ProjetoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    //Contar linhas e colunas, dentro de uma função.
    //criar matriz com o numero de linhas e colunas contado
    //Criar menuAdmin, menuCliente e login.

    //cria matriz com os valores guardados
    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {//Criando função string caminho para armazenar dados de um csv como matriz de strings ☺
        Scanner scFicheiro = new Scanner(new File(path)); // Criando Scanner pro ficheiro que vai abrir o ficheiro pelo caminho definido anteriormente 😮

        int quantidadeParametros = 0; // contar cada parametro lido pelo scanner 😎

        if (scFicheiro.hasNextLine())
            quantidadeParametros = scFicheiro.nextLine().split(";").length; //condição para o scanner ler linha (caso tenha) já fazendo split do delimitador ";" no limite da matriz 😉

        String[][] matrizCompleta = new String[contarLinhasFicheiro(path)][quantidadeParametros]; // criando uma matriz de strings e definindo a linha e a coluna dentro dos [][] 😣

        String linha; // criando string para linha que vou usar para contar as linhas de uma matriz 😐

        int contadorLinhaMatriz = 0; // aqui eu declarei meu contador 😂

        while (scFicheiro.hasNextLine()) {// ciclo while para poder fazer o scanner do ficheir ler linhas da matriz caso tenha 🙄

            linha = scFicheiro.nextLine(); //grava na string linha tudo o que o scanner do ficheiro ler nas linhas da matriz 😥

            String[] linhaDividida = linha.split(";"); //fazer split da linha e gravar num array de string definido como linhaDividida 🥱

            for (int coluna = 0; coluna < quantidadeParametros; coluna++) { //ciclo for para pular colunas sempre que a coluna for menor que a quantidade de parametros 🤩

                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna]; // minha matriz de strings chamada de matrizCompleta tem como linha o contadorLinhaMatriz e defini que a coluna é igual a linhaDividida 🤣
            }

            contadorLinhaMatriz++; // faço um incremento para o contadorLinhaMatriz que eu defini como minha linha na matriz de strings ir para próxima linha 😑

        }

        return matrizCompleta; // retorno o valor da minha matrizCOmpleta que é minha matriz de strings😁
    }

    // line counter
    public static int contarLinhasFicheiro(String path) throws FileNotFoundException { // criei essa função para contar as linhas do ficheiro, defini o caminho como string para sempre que invocar a função apenas mostrar o root. lógico que eu botei a exceção depois 🙄
        int quantidadeLinhas = 0; // Preciso dizer? okayyy, vou dizer só desta vez. Minha variável que le inteiros é o "quantidadeLinhas" e ele é inicializado a zero 😴 (são 18:48)

        Scanner scanner = new Scanner(new File(path)); // criei um scanner bem básico para abrir meu ficheiro definido pelo caminho que for dito pelo utilizador 😶

        if (scanner.hasNextLine())
            scanner.nextLine(); // implementei uma condição para meu scanner ler linhas e fui direto ao ponto para não gastar duas linhas de código. 🥱

        else return 0; // MEU RETORNOOOOOOOOOOOOOOOOOOOOO CASO A CONDIÇÃO NÃO SEJA IDENTIFICADA "retornar o valor 0" 😲

        while (scanner.hasNextLine()) { // mais um ciclo while para enquanto meu scanner perceber uma linha, ler a linha, após isso invoco minha variável inteira "quantidadeLinhas" e um incremento que faz  ir para a próxima linha 🤯

            scanner.nextLine();

            quantidadeLinhas++;
        }

        return quantidadeLinhas; // retornando o valor que ficará gravado na variável inteira depois da operação 😧
    }

    // cria o menu do adm
    public static void menuAdmin() throws FileNotFoundException { // função que eu criei para iniciar o menu do ADM. Será que você sabe a senha?? 🤔

        Scanner scanner = new Scanner(System.in); // outro scanner sendo criado 😝
        int opcao = 0; // aqui nasceu uma variável inteira que eu chamei de opção e será inicializada a zero para poder fazer o switch case opcao 😉


        do {// cria as opções do menu
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

            switch (opcao) {// executa as opções do menu devido a escolha do utilizador. 😃

                case 1: // Imprimir Ficheiro de Venda, Clientes e Categorias 🤗
                    switch (opcao) { // vamos lá switch, faça meu utilizador escolher uma destas opções... 😠
                        case 1:

                            //switch tres opcoes, se ele quiser ler vendas ele vai ler ficheiro vendas e assim por diante
                            imprimirFicheiro("ProjetoPratico/GameStart/GameStart_Vendas.csv");
                            break;

                        case 2:
                            imprimirFicheiro("ProjetoPratico/GameStart/GameStart_Clientes.csv");
                            break;

                        case 3:
                            imprimirFicheiro("ProjetoPratico/GameStart/GameStart_Categorias.csv");
                            break;

                    }
                    break;


                case 2: // Pesquisar por Vendas Totais 🧐
                    exibirTotalDeVendas("ProjetoPratico/GameStart/GameStart_Vendas.csv");

                    break;

                case 3:  // Pesquisar por Total lucro 🤑
                    exibirTotalDeLucro("ProjetoPratico/GameStart/GameStart_Vendas.csv", "ProjetoPratico/GameStart/GameStart_Categorias.csv");

                    break;

                case 4:  // Pesquisar melhor cliente
                    // não teve melhor cliente.. 😪


                    break;

                case 5:  // Jogo mais caro
                    // incompleto ⭕❌🚫


                    break;

                case 6:  // Melhores Clientes
                    // incompleto ⭕❌🚫


                    break;

                case 7:  // Melhor categoria
                    // incompleto ⭕❌🚫


                    break;

                case 8:  // Pesquisar Vendas
                    // incompleto ⭕❌🚫


                    break;

                case 9:  // Top 5 Jogos
                    // incompleto ⭕❌🚫


                    break;

                case 10:  // Bottom 5 Jogos
                    // incompleto ⭕❌🚫


                    break;

                case 11: // Sair
                    System.out.println("Sair");
                    imprimirFicheiro("ProjetoPratico/ProjetoPratico/copy");
                    break;

                default:
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
                    return;

            }


        } while (opcao != 11); // fecha o ciclo do menu com um while
    }

    // mostra o total de lucro 💨
    public static void exibirTotalDeLucro(String pathVendas, String pathCategorias) throws FileNotFoundException { // criei a função exibirTotalDeLucro sem retorno de valores com uma string para o caminho vendas e outra string para o caminho das categorias. ♾

        String[] valoresNomeCategoria, valoresPercentagemCategoria, valoresCategoriaVendas, valoresValorVendas; // criei quatro arrays de strings com os respectivos nomes escritos. 👻

        valoresNomeCategoria = obterValores(pathCategorias, "nomeCategoria", ";"); // invoquei a função de obter valores para o path categorias definido como string anteriormente e criei um campo chamado "nomeCategoria" para receber o split feito com o delimitador ";" 😷
        valoresPercentagemCategoria = obterValores(pathCategorias, "percentagemMargem", ";"); //mesma coisa de cima apenas muda o nome do campo que se torna percentagemMargem 🤓

        valoresCategoriaVendas = obterValores(pathVendas, "categoria", ";"); // mesma coisa de cima mas muda o campo
        valoresValorVendas = obterValores(pathVendas, "valor", ";");// mesma coisa de cima mas muda o campo

        double lucroTotal = 0; // retorna o valor do lucro total após todas leituras que vem abaixo

        for (int i = 0; i < valoresCategoriaVendas.length; i++) { // criei um ciclo for onde meu inteiro começo no indice 0 e enquanto o indice for menor que o campo "valoresCategoriasVendas" fara um incremento 👽

            String categoria = valoresCategoriaVendas[i]; // declaro uma string para categoria que defini que será meu valoresCategoriaVendas ["em um determinado indice"]😀

            int indexNomeCategoria = -1; // declarei um inteiro para o indiceNomeCategoria e fiz um "=-1" para pular o cabeçalho 😤

            for (int j = 0; j < valoresNomeCategoria.length; j++) { // ciclo for onde eu determino j minha coluna e faço ela ser lida totalmente 🤠

                if (valoresNomeCategoria[j].equals(categoria))
                    indexNomeCategoria = j; // determino com uma condição que minha coluna valoresNomeCategoria tem o valor da categoria no indexNomeCategoria que é minha nova coluna 🥶
            }

            if (indexNomeCategoria > -1) { // condição para determinar meu indiceNomeCategoria maior que -1 para executar as informações a seguir 🤫

                double porcentagemLucro = Double.parseDouble(valoresPercentagemCategoria[indexNomeCategoria]); // declaro uma double pra porcentagemLucro e retorno uma nova double inicializada para a string valoresPercentagemCategoria na posição do indice [indexNomeCategoria] 🐱‍👤

                double valorVenda = Double.parseDouble(valoresValorVendas[i]); // declaro uma double para o valorVenda e retorno uma nova double inicializada para a string valoresValorVendas na posição do indice [i] 😳

                lucroTotal += (valorVenda * porcentagemLucro) / 100; // define que o lucroTotal é lucroTotal=lucroTotal+ (valorVenda*porcentagemLucro) dividido por 100 para achar a porcentagem
            }
        }

        System.out.println("Lucro total das vendas por categoria: " + lucroTotal); // faz o print na consola do lucro total
    }

    // imprime o ficheiro definido pelo utilizador
    public static String imprimirFicheiro(String path) throws FileNotFoundException { // crio uma função declarando uma string para imprimir ficheiro com uma string para o path 🐷

        Scanner scannerFicheiro = new Scanner(new File(path)); // um scanner para abrir o ficheiro 🐯

        while (scannerFicheiro.hasNext()) { // ciclo while para ler linha do ficheiro 🐕‍🦺🦮🐩🐕🐈🐅🐆🐎🦌🦏🦛🐂🐃🐄🐖🐏🐑🐐🐪🐫🦙🦘🦥🦨🦡🐘🐁
            String LinhaAtual = scannerFicheiro.nextLine();
            System.out.println(LinhaAtual);
        }
        return path; //retorna o caminho
    }

    // motra o total de vendas
    public static void exibirTotalDeVendas(String path) throws FileNotFoundException {
        int quantidadeVendas = contarLinhasFicheiro(path);
        String[] precoVendas = obterValores(path, "valor", ";");

        double valorTotal = 0;

        for (int i = 0; i < precoVendas.length; i++) {
            valorTotal += Double.parseDouble(precoVendas[i]);
        }

        System.out.println("Quantidade de vendas: " + quantidadeVendas + "\n Valor total: " + valorTotal);
    }

    //aqui eu crio uma matriz sem cópia
    public static String[][] matrizQueTiraCopias(String[][] matrizVendas) {
        String[][] matrizQueTiraCopias = new String[matrizVendas.length][matrizVendas[0].length];

        int count = 0;


        for (int i = 0; i < matrizQueTiraCopias[0].length; i++) { //grava na primeira linha os valores da matriz anterior na nova
            matrizQueTiraCopias[0][i] = matrizVendas[0][i];
        }
        count++;

        // aqui eu leio linha por linha e faço uma análise...
        for (int t = 1; t < matrizVendas.length; t++) { // próxima linha!!
            boolean copia = false; // condição T ou F para definir se há ou não cópias
            for (int i = 0; i < count; i++) {
                if (matrizVendas[1][4].equals(matrizQueTiraCopias[i][4])) { //analiso se meu jogo tem cópias na matriz
                    copia = true;
                    break;
                }
            }
            if (!copia){ //não há copias? então leia toda a linha!

                for (int i=0; i<matrizVendas[0].length;i++){
                    matrizQueTiraCopias[count][i]=matrizVendas[t][i];

                }count++;
            }
        }

        // aqui eu crio uma nova e última matriz ajeitando o tamanho da mesma com os valores devidamente gravados
        String[][] matrizCompleta = new String[count][matrizVendas[0].length];
        for (int t=0; t<matrizVendas[0].length; t++){
            for (int i=0; i< matrizVendas[0].length;i++){
                matrizCompleta[t][i]= matrizQueTiraCopias[t][i];

            }
        }
        return matrizCompleta;
    }

    //
    public static void imprimirJogoRecente(String[][]jogos){
        String linhaFinal=jogos[jogos.length-1][4];

        System.out.println("Jogo mais recente: "+ linhaFinal);

    }

    // gravar valores em arrays
    public static String[] obterValores(String path, String campo, String delimitador) throws FileNotFoundException {// funcão obter valores que recebe um array de strings com uma string campo(local), uma string path(file), e uma string para o delimitador😩
        Scanner scanner = new Scanner(new File(path)); // mais um scanner, que vai abrir o ficheiro 🦴
        if (!scanner.hasNextLine()) return null;// crio um ciclo if para retorna um valor vazio caso o scanner não ache uma linha para ler 🍕

        String header = scanner.nextLine(); // declaro uma string "header" para meu scanner gravar as linhas 🍙
        if (header.contains(campo)) { // crio um ciclo if para declarar que se meu scanner verificar se true or false para a existência dos termos no campo definido pela string campo🍚
            String[] campos = header.split(delimitador); //crio um array de strings nomeada campos parar guardar o split do meu scanner 🥕

            int indexCampo = -1; // declaro um inteiro para o indice =-1 para ignorar o cabeçalho 🌴

            for (int i = 0; i < campos.length; i++) { // ciclo for para ler o campo como um indice até seu valor máximo 🍒

                if (campos[i].equals(campo)) indexCampo = i; // compara meu campo indice com meu campo file e devolve indiceCampo = i 🍣 (são 00:17 e eu estou ouvindo Another Brin In The Wall para me manter acordado)
            }

            if (indexCampo > -1) { // HEY!!! TEACHER!!! LEAVE THEM KIDS ALONE!!! aqui eu crio uma condição if para caso o index for maior que -1 ...🎁

                int quantidadeLinhas = contarLinhasFicheiro(path); //declarar um inteiro para quantidadeLinhas que chamará a função contarLinhasFicheiro 🚒
                String[] valoresCampoEspecifico = new String[quantidadeLinhas]; // crio um array de strings para o ValoresCampoEspecifico e meu array vai se chamar quantidadeLinhas 🛒

                for (int i = 0; i < quantidadeLinhas; i++) { // crio um ciclo for para o inteiro inicializar o indice a zero (ler o array na primeira posição) e caso a quantidadeLinhas for maior que o indice, pular linha. 🥼
                    valoresCampoEspecifico[i] = scanner.nextLine().split(delimitador)[indexCampo]; // chamo meu valoresCampoEspecifico no indice[i] e digo que agora meu scanner next line vai gravar o split do indexcampo la dentro 🥽
                }

                return valoresCampoEspecifico; // retorna o valor de valoresCampoEspecifico 👓
            }
        }

        return null; //retorna um valor vazio caso não se encaixe o primeiro tópico 🕶
    }

    // menu dos clientes
    public static void menuClientes() throws FileNotFoundException { // crio a função que não me retorna valor nomeada menuClientes para fazer meu switch do cliente com a exceção do file not found para printar erro caso não ache um file 🎆
        Scanner scanner = new Scanner(System.in); // crio scanner 🎄
        int opcao = 0; //declaro inteiro minha opcao e inicializo ela a zero 🧶


        do {//crio o menu dos clientes 🎨
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

            switch (opcao) {// executa o menu dos clientes devido a escolha do utilizador 🎪

                case 1: // Novo Registo 🎞
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

                case 2: // aqui ele procura estacionamento em números triangulares 🎠
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


                case 3:  // imprime o  Catálogo 👟
                    lerTxtParaCatalogo("ProjetoPratico/GameStart/CatalogoGrafico");


                    break;

                case 4:  // imprime os Catálogos Gráficos⚽

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
                  //  imprimirJogoRecente(matrizQueTiraCopias());

                    break;

                default: // fecha o switch
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");
                    imprimirFicheiro("ProjetoPratico/ProjetoPratico/copy");
                    break;

            }


        } while (opcao < 7); // enquanto meu utilizador colocar um número menor que sete o menu corre normalmente. 👔
    }

    /*registo do
    cliente funciona!*/

    // menu para novo registo dos clientes🧨
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

    // ler catalogo
    public static void lerTxtParaCatalogo(String pathOrigem) throws FileNotFoundException { // função de leitura com uma string nomeada pathOrigem 🎎
        Scanner scannerOrigem = new Scanner(new File(pathOrigem)); // scanner novamente 🎏
        while (scannerOrigem.hasNextLine()) { // enquanto meu scanner encontrar uma linha ele a le e grava tudo em uma string nomeada linha depois printa a linha 🎊
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

    //login admin. 🎈

    public static String admin = "admin";
    public static String adminSenha = "456";

    //funções que dão valor para as credenciais do admin. 🎒
    public static boolean adminLogin(Scanner scanner) { // crio uma boolean parar decidir se vai correr menu adm ou menu cliente 🎐 ( já definindo o padrão de senha para login do adm)
        System.out.println("Digite seu usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        return
                admin.equals(usuario) &&
                        adminSenha.equals(senha);
    }
    //Função que faz o login do admin.

    public static void main(String[] args) throws FileNotFoundException { // meu main para executar o programa 🎋
        Scanner scanner = new Scanner(System.in); // scanner do input, sem isso meu programa quebraaaaaaaaaaaa 😭

// start do programa VAMOOOOOOOO!!!!!!!!!
        while (true) { // enquanto for true ele printa tudo isso abaixo no ecrã 😣
            System.out.println("\n🤖🤖🤖 Saudações Devs, esse é o game start!🤖🤖🤖");
            System.out.println("1. Admin");
            System.out.println("2. Cliente");
            System.out.println("Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) { // switch case
                case 1:// condição para validar login do adm e caso validar, invoca a função menuAdmin caso contrário ele se fecha!!😎

                    if (adminLogin(scanner)) {
                        //adminLogin, para abrir o menu do admin, assim mostrando o que tem la dentro.
                        menuAdmin();
                        //adminMenu scanner para ler a função associada ao menu do admin
                    } else {
                        System.out.println("Saindo...");
                    }
                    break;

                case 2:// invoca a função menu dos clientes 🧦
                    menuClientes();
                    break;

                case 3: // sai quando não quer mais nenhum tipo de informação printando meu copyright mais sinistro do mundo 🎱
                    System.out.println("Saindo...");
                    imprimirFicheiro("ProjetoPratico/ProjetoPratico/copy");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

// terminei de comentar tudo finalmente ponto por criatividade nos emojis e na interação com Vitor Santos durante a correção 📌 ( 00:39) estou ouvindo Filha do Deputado MC IG (Gênero Funk)