import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ------------------------------------------------------------------------------------------------------------------ //

// class Country implements Comparable<Country> {

//     public String name;
//     public int[] medals = new int[3];

//     public Country(String name) {

//         this.name = name;
        
//         for(int i = 0; i < 3; i++) this.medals[i] = 0;
//     }

//     public int compareTo(Country other) {

//         if(this.medals[0] != other.medals[0]) return this.medals[0] > other.medals[0] ? -1 : 1;
//         if(this.medals[1] != other.medals[1]) return this.medals[1] > other.medals[1] ? -1 : 1;
//         if(this.medals[2] != other.medals[2]) return this.medals[2] > other.medals[2] ? -1 : 1;
//         return this.name.compareTo(other.name);
//     }
// }

// ------------------------------------------------------------------------------------------------------------------ //

class Main {

    // public static Country searchByName(ArrayList<Country> countries, String search) {

    //     for(Country country : countries) {

    //         if(country.name.compareTo(search) == 0) return country;
    //     }
    //     return null;
    // }

    // // ---------------------------------------------------------------- //

    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);

    //     ArrayList<Country> countries = new ArrayList<Country>();

    //     while(sc.hasNextLine()) {

    //         sc.nextLine();

    //         for(int i = 0; i < 3; i++) {

    //             String _cName = sc.nextLine();
    //             Country search = searchByName(countries, _cName);

    //             if(search == null) countries.add(search = new Country(_cName));

    //             search.medals[i]++;
    //         }
    //     }

    //     // ---------------------------------------- //
    
    //     Collections.sort(countries);

    //     System.out.println("Quadro de Medalhas");

    //     for(Country country : countries) {
            
    //         System.out.println(country.name + " " + country.medals[0] + " " + country.medals[1] + " " + country.medals[2]);
    //     }

    //     // ---------------------------------------- //
    
    //     sc.close();
    // }
}