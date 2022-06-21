import java.util.ArrayList;
import java.util.Scanner;

class Estacionamento {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // ---------------------------------------------------------------------- //

        while(in.hasNextLine()) {

            int result = -1;
            String s_params[] = in.nextLine().split(" ");
            int cases = Integer.parseInt(s_params[0]);
            int max_slots = Integer.parseInt(s_params[1]);

            if(cases == 0) break;

            ArrayList<Integer> parking = new ArrayList<Integer>();

            // ---------------------------------------------------------- //

            for(int i = 0; i < cases && result == -1; i++) {
                
                String p_params[] = in.nextLine().split(" ");
                int entrou = Integer.parseInt(p_params[0]);
                int vai_sair = Integer.parseInt(p_params[1]);

                for(int x = 0; x < parking.size(); x++) {

                    int saida = parking.get(x);
                    
                    if(saida <= entrou) parking.remove(x);
                }

                // ----------------------------------- //

                if(parking.size() >= max_slots) {

                    result = 0;

                    for(int x = 0; x < cases - i - 1; x++) in.nextLine();
                }

                for(Integer saida : parking) {
                    
                    if(saida < vai_sair && saida > entrou) {

                        result = 0;

                        for(int x = 0; x < cases - i - 1; x++) in.nextLine();
                        break;
                    }
                }

                // ----------------------------------- //

                parking.add(vai_sair);
            }

            if(result == -1) result = 1;

            System.out.println(result == 1 ? "Sim" : "Nao");

        }

        in.close();

        // ---------------------------------------------------------------------- //

    }
}