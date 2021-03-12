package criacao_singleton;

import java.io.IOException;

/**
 *
 * @author eduarda
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Criacao_Singleton generator = Criacao_Singleton.getInstance();

        long numero = 0;
        for (int i = 0; i < 20; i++) {
            gerandoNumeros(generator, numero);
        }

    }

    public static void gerandoNumeros(Criacao_Singleton instancia, long variavel) throws IOException {
        variavel = instancia.getNumero();
        System.out.println(variavel);
    }
}
