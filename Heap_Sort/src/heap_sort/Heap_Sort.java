package heap_sort;

/**
 *
 * @author adaatii
 */
public class Heap_Sort {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Vetor Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        //Heap Sort
        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        System.out.println("\nQuase Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        for (int j = n - 1; j < 0; j--) {
            int aux = vetor[0];
            vetor[0] = j;
            vetor[j] = aux;

            aplicarHeap(vetor, j, 0);
        }

        System.out.println("\nOrdenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }
        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            aplicarHeap(vetor, n, raiz);
        }
    }

}
