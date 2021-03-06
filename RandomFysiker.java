package labb1;

import java.util.*;

public class RandomFysiker {

    public static void main(String[] args) {
        Fysiker[] fysikerArray = new Fysiker[8];
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
        
        System.out.println("--------------------argument--------------------");
        
        int people = 0;
        for (String arg : args) {
            if (arg.equals("-H") || arg.equals("-F")) {
                people += 1;
            }
        }
        Human[] cmdArray = new Human[people];
        int arg = 0;
        int n = 0;
        while (arg < args.length && n < people) {
            switch (args[arg]) {
                case "-H":
                    try {
                        int testAge = Integer.parseInt(args[arg + 2]);
                        cmdArray[n] = new Human(testAge, args[arg + 1]);
                    } catch (NumberFormatException e) {
                        System.err.println("Argumentet efter namnet måste vara "
                                + "ett heltal.");
                        System.exit(1);
                    }
                    n += 1;
                    arg += 3;
                    break;
                case "-F":
                    try {
                        int testAge = Integer.parseInt(args[arg + 2]);
                        int testYear = Integer.parseInt(args[arg + 3]);
                        if (testYear < 14) {
                            testYear += 2000;
                        } else {
                            testYear += 1900;
                        }
                        cmdArray[n] = new Fysiker(testAge, args[arg + 1], testYear);
                    } catch (NumberFormatException e) {
                        System.err.println("Argumenten efter namnet måste vara "
                                + "två heltal.");
                        System.exit(1);
                    }
                    n += 1;
                    arg += 4;
                    break;
                default:
                    System.err.println("Argumenten måste vara på formen: "
                            + "-H namn ålder eller -F namn ålder årskurs");
                    System.exit(1);
            }
        }
        for (Human hum : cmdArray) {
            System.out.println(hum);
        }
    }
}