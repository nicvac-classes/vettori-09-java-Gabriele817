import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n;

        System.out.println("Inserire il numero di giri: ");
        n = scanner.nextInt();
        ArrayList<Float> hamilton = new ArrayList<>(n);
        ArrayList<Float> verstappen = new ArrayList<>(n);

        for (i = 0; i < n; i++) {
            System.out.print("Inserisci il tempo del " + (i + 1) + "° giro di Hamilton: ");
            hamilton.add(scanner.nextFloat());
            System.out.print("Inserisci il tempo del " + (i + 1) + "° giro di Verstappen: ");
            verstappen.add(scanner.nextFloat());
        }

        float tempoGaraH = 0, tempoGaraV = 0;

        for (i = 0; i < n; i++) {
            tempoGaraH += hamilton.get(i);
            tempoGaraV += verstappen.get(i);
        }
        String vincitore;

        if (tempoGaraH < tempoGaraV) {
            vincitore = "Hamilton";
        } else {
            vincitore = "Verstappen";
        }
        System.out.println("Tempo Hamilton: " + tempoGaraH + ", tempo Verstappen: " + tempoGaraV);
        System.out.println("Vincitore della gara: " + vincitore);

        float tMinV = verstappen.get(0), tMinH = hamilton.get(0);

        for (i = 0; i < n; i++) {
            if (hamilton.get(i) < tMinH) {
                tMinH = hamilton.get(i);
            }
            if (verstappen.get(i) < tMinV) {
                tMinV = verstappen.get(i);
            }
        }
        if (tMinH < tMinV) {
            vincitore = "Hamilton";
        } else {
            vincitore = "Verstappen";
        }
        System.out.println("Giro veloce Hamilton: " + tMinH + ", giro veloce Verstappen: " + tMinV);
        System.out.println("Il giro più veloce è di " + vincitore);
    }
}
