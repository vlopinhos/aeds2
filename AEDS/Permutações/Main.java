import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static ArrayList<String> getPermutation(String str)
    {
        if(str.length() == 0) {
 
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
 
        char ch = str.charAt(0);
 
        String subStr = str.substring(1);
        ArrayList<String> prevResult = getPermutation(subStr);
 
        ArrayList<String> resp = new ArrayList<>();
 
        for(String val : prevResult) {

            for(int i = 0; i <= val.length(); i++) {
                
                String result = val.substring(0, i) + ch + val.substring(i);
                
                if(!resp.contains(result)) resp.add(result);
            }
        }

        Collections.sort(resp);
        return resp;
    }

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int ops = Integer.parseInt(sc.nextLine());

        // ----------------------------------- //
        
        for(int i = 0; i < ops; i++) {

            String line = sc.nextLine();

            for(String val : getPermutation(line)) System.out.println(val);

            if(i != ops - 1) System.out.println();
        }

        // ----------------------------------- //
        
        sc.close();
    }
}