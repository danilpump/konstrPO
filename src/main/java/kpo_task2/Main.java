package kpo_task2;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObservableTerminal terminal1 = new ObservableTerminal();

        // Proverka ruchnyn vvodom
        Scanner in = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            System.out.println("---------------------------------------------");
            System.out.println("Choose what you want\n" +
                    "0 - Set speed;\n" +
                    "1 - Set temperature\n" +
                    "2 - Set pressure\n" +
                    "If you want to exit just write 'exit'");
            input = in.nextLine();

            switch (input) {
                case "0" -> {
                    input = in.nextLine();
                    terminal1.speedLog(Integer.parseInt(input));
                }
                case "1" -> {
                    input = in.nextLine();
                    terminal1.tempLog(Integer.parseInt(input));
                }
                case "2" -> {
                    input = in.nextLine();
                    terminal1.pressLog(Double.parseDouble(input));
                }
            }
            System.out.println("---------------------------------------------");
        }

        // Proverka slychaynumy znachenyamy
        while(true){
            int s = (int)(Math.random() * (3001-2999))+2999;
            int t = (int)(Math.random() * (510-360))+360;
            double p = (Math.random() * (5.5-4.8))+4.7;

            terminal1.speedLog(s);
            terminal1.tempLog(t);
            terminal1.pressLog(p);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
