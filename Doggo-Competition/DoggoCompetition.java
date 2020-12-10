public class DoggoCompetition {

    public static String DogPlacement(int D, int Max) {
        String output = "";
        int i = 1;
        for (int x = 1; x <= Max; x++) {
            if (x == D) {
                continue;
            }
            if (x == 12 || x == 11 || x == 13) {
                output += x + "th, ";
            } else if (x % 10 == 1) {
                output += x + "st, ";
            } else if (x % 10 == 2) {
                output += x + "nd, ";
            } else if (x % 10 == 3) {
                output += x + "rd, ";
            } else {
                output += x + "th, ";
            }

            if (i % 10 == 0) {
                output += "\n";
            }
            i++;
        }
        output = output.substring(0, output.length() - 2);
        return output;
    }

}