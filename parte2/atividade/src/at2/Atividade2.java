package at2;

public class Atividade2 {
    private String frase1 = "SUBI NO ONIBUS";
    private String frase2 = "SOCORRAM EM SUBINOONIBUSEMMARROCOS";
    private String frase3 = "ANA COME BANANA";
    private String subString = "ANA";

    // Função para verificar se uma frase é palíndroma
    public static boolean verificarPalindromo(String frase) {
        String fraseSemEspacos = frase.replaceAll("\\s+", "");
        String fraseReversa = new StringBuilder(fraseSemEspacos).reverse().toString();
        return fraseSemEspacos.equalsIgnoreCase(fraseReversa);
    }

    // Função para contar quantas vezes uma substring aparece em uma frase, incluindo sobreposições
    public static int contarOcorrencias(String frase, String subString) {
        int count = 0;
        int index = 0;
        while ((index = frase.indexOf(subString, index)) != -1) {
            count++;
            index += 1; // Avança o índice em 1 para contar substrings sobrepostas
        }
        return count;
    }

    public String getFrase1() { return frase1; }

    public String getFrase2() { return frase2; }

    public String getSubString() { return subString; }

    public String getFrase3() { return frase3; }
}
