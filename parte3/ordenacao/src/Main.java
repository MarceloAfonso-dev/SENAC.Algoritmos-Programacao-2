import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random rd = new Random();
    static Concursado cs = new Concursado();
    public static void main(String[] args) {
        Concursado[] lista = new Concursado[1500];
        preencherLista(lista);

        //for (Concursado concursado : lista) {
        //    System.out.println(concursado);
        //}

        ordenarLista(lista);

        for (int i = 0; i != 10; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void preencherLista(Concursado[] lista) {
        for (int i = 0; i < lista.length; i++) {
            Integer[] notas = new Integer[3];
            for (int j = 0; j < notas.length; j++) {
                notas[j] = rd.nextInt(0,100);
            }
            lista[i] = new Concursado(i, notas, cs.calcularMedia(notas));
        }
    }

    public static Concursado[] ordenarLista(Concursado[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                if (lista[j].getMedia() < lista[j + 1].getMedia()) {
                    Concursado temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        return lista;
    }
}