package ProjetoPratico.ProjetoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Cliente {
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
}




    //não necessário gravar no ficheiro, apenas criar variáveis para salvar cada input do utilizador




   /** int limite=121;
                    for (int i=1;;i++) {
        int triangular=i * (i + 1)/2; // formula de um numero triangular
        if (triangular>limite) {
            break;
        }
        if (triangular%5==0){
            System.out.println("Lugar de vaga: "+triangular);

        }
    }
                    System.out.println("Vagas calculadas com sucesso!");
                    break;
}

*/