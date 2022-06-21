import java.util.ArrayList;
import java.util.Scanner;

class Isolado {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()) {

            int n = in.nextInt();
            
            if(n == 0) break;

            ArrayList<Long> values = new ArrayList<Long>();

            for(int i = 0; i < n; i++) {

                long x = in.nextLong();

                if(values.contains(x)) values.remove(Long.valueOf(x));
                else values.add(x);
        
            }

            for(Long i : values) System.out.println(i);
            
        }

        in.close();
    }
}