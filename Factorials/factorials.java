public class Factorials{

    public static String factorial(int n){
    
        double m = n;
        double d = 2d;
        while(m > 1){
            m = m / d;
            if(m % 1 != 0){
                return "NONE";
            }
        d++;
        }
        return n+"!";
    }
}