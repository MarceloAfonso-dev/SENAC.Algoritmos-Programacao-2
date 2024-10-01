import at2.Atividade2;

public class Main {
    public static void main(String[] args) {
        boolean isPalindromo;
        Atividade2 at2 = new Atividade2();

        // Verificar se a frase é palíndroma
        isPalindromo = at2.verificarPalindromo(at2.getFrase1());
        System.out.println("A frase \"" + at2.getFrase1() + "\" é palíndroma? " + isPalindromo);

        // Verificar se a frase é palíndroma
        isPalindromo = at2.verificarPalindromo(at2.getFrase2());
        System.out.println("A frase \"" + at2.getFrase2() + "\" é palíndroma? " + isPalindromo);

        // Contar quantas vezes a substring aparece na frase
        int count = at2.contarOcorrencias(at2.getFrase3(), at2.getSubString());
        System.out.println("A substring \"" + at2.getSubString() + "\" aparece " + count + " vezes na frase \"" + at2.getFrase3() + "\".");
    }
}