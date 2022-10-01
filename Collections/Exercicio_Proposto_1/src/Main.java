import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double temperatura;
        Scanner scan = new Scanner(System.in);
        List<Double> temp = new ArrayList<>();


        System.out.println("Infome a temperatura dos 6 primeiros meses do ano");
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a Temperatura " + (i+1));
            temperatura = scan.nextDouble();
            temp.add(temperatura);
        }

        Iterator <Double> iterator = temp.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma/6;
        System.out.printf("A média dos 6 meses foi:  %.1f", media);

        System.out.println("\n\nMeses das temperaturas acima da média: ");
        int count = 0;
        Iterator<Double> it = temp.iterator();
        while (it.hasNext()){
            Double next = it.next();
            if (next > media){
                switch (count){
                    case (0):
                        System.out.printf("1 - Janeiro %.1f\n", next);
                        break;
                    case (1):
                        System.out.printf("2 - Fevereiro %.1f\n", next);
                        break;
                    case (2):
                        System.out.printf("3 - Março %.1f\n", next);
                        break;
                    case (3):
                        System.out.printf("4 - Abril %.1f\n", next);
                        break;
                    case (4):
                        System.out.printf("5 - Maio %.1f\n", next);
                        break;
                    case (5):
                        System.out.printf("6 - Junho %.1f\n", next);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }

            }
            count++;

        }


    }
}