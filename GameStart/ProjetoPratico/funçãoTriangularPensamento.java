package ProjetoPratico.ProjetoPratico;

public class FunçãoTriangularPensamento {
    public static boolean isTriangularMultiploCinco(int numero) {
    if (numero < 0 || numero % 5 != 0) return false;
    int triangulares = 0;
    for (int i = 0; triangulares < numero; i++) {
        triangulares += i;
        if (triangulares == numero) return true;
    }
    return false;
}
}
