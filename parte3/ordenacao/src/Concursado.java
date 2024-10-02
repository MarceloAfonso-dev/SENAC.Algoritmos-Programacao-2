import java.util.Arrays;
import java.util.List;

public class Concursado {
    private Integer id;
    private Integer[] notas = new Integer[3];
    private Double media;
    private Integer[] pesos = {2,3,4};
    private String[] materias = {"Matematica", "Portugues", "Conhecimentos Gerais"};

    public Concursado(Integer id, Integer[] notas, Double media) {
        this.id = id;
        this.notas = notas;
        this.media = media;
    }

    public Concursado() {

    }

    public Double calcularMedia(Integer[] notas) {
        Double media = 0.0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i].doubleValue() * pesos[i];
        }
        return media / 9;
    }

    public Double getMedia() {
        return media;
    }

    public Integer getId() {
        return id;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public Integer[] getPesos() {
        return pesos;
    }

    public String[] getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Concursado: " + id + "\n" +
                "Notas: " + Arrays.toString(notas) + "\n" +
                "Média: " + String.format("%.2f", media) + "\n" +
                "Pesos: " + Arrays.toString(pesos) + "\n" +
                "Materias: " + Arrays.toString(materias) + "\n";
    }
}
