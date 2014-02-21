package labb1;

import java.util.*;

public class RandomFysiker {

    public static void main(String[] args) {
        Fysiker[] fysikerArray = new Fysiker[15];
        for (int i = 0; i < fysikerArray.length; i++) {
            fysikerArray[i] = new Fysiker();
        }
        for (Fysiker fys : fysikerArray) {
            System.out.println(fys);
        }

        System.out.println("------------------------------------------------");

        Human[] randomHumFys = new Human[10];
        for (int i = 0; i < randomHumFys.length; i++) {
            if (i < 5) {
                randomHumFys[i] = new Fysiker();
            } else {
                randomHumFys[i] = new Human();
            }
        }
        for (Human hum : randomHumFys) {
            System.out.println(hum);
        }

        System.out.println("--------------------sorterat--------------------");

        Arrays.sort(randomHumFys);
        for (Human hum : randomHumFys) {
            System.out.println(hum);
        }
        int people = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-H") || args[i].equals("-F")) {
                people += 1;
            }
        }
        Human[] cmdArray = new Human[people];
        int arg = 0;
        int n = 0;
        int testAge = 0;
        int testYear = 0;
        while (arg < args.length && n < people) {
            if (!(args[arg].equals("-H") || args[arg].equals("-F"))) {
                System.out.println("Argumenten måste vara på formen: "
                        + "-H namn ålder eller -F namn ålder årskurs");
            } else if (args[arg].equals("-H")) {
                try {
                    testAge = Integer.parseInt(args[arg + 2]);
                } catch (NumberFormatException e) {
                    System.err.println("Argumentet efter namnet måste vara ett "
                            + "heltal.");
                    System.exit(1);
                }
                cmdArray[n] = new Human(testAge, args[arg + 1]);
                n += 1;
                arg += 3;
            } else {
                try {
                    testAge = Integer.parseInt(args[arg + 2]);
                    testYear = Integer.parseInt(args[arg + 3]);
                } catch (NumberFormatException e) {
                    System.err.println("Argumenten efter namnet måste vara två "
                            + "heltal.");
                    System.exit(1);
                }
                if (testYear < 13) {
                    testYear += 2000;
                } else {
                    testYear += 1900;
                }
                cmdArray[n] = new Fysiker(testAge, args[arg + 1], testYear);
                n += 1;
                arg += 4;
            }
        }
        for (Human hum : cmdArray) {
            System.out.println(hum);
        }
    }
}