import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ------------------------------------------------------------------------------------------- //

// class Order implements Comparable<Order> {

//     public String name, color, size;

//     public Order(String name, String color, String size) {

//         this.name = name;
//         this.color = color;
//         this.size = size;
//     }

//     public int compareTo(Order other) {

//         int c;

//         c = this.color.compareTo(other.color);

//         if(c == 0) c = -1 * (this.size.compareTo(other.size));
//         if(c == 0) c = this.name.compareTo(other.name);
//         return c;
//     }
// }

// ------------------------------------------------------------------------------------------- //

class Main {

    // public static Order searchByName(ArrayList<Order> orders, String search) {

    //     for(Order order : orders) {

    //         if(order.name.compareTo(search) == 0) return order;
    //     }
    //     return null;
    // }

    // // -------------------------------------------------------- //

    // public static void main(String[] args) {
     
    //     Scanner sc = new Scanner(System.in);
    //     int ops = Integer.parseInt(sc.nextLine());

    //     while(true) {

    //         ArrayList<Order> orders = new ArrayList<Order>();

    //         for(int x = 0; x < ops; x++) {

    //             String _oName = sc.nextLine();
    //             String[] _oArgs = sc.nextLine().split(" ");
 
    //             orders.add(new Order(_oName, _oArgs[0], _oArgs[1]));
    //         }

    //         Collections.sort(orders);

    //         for(Order obj : orders) {

    //             System.out.println(obj.color + " " + obj.size + " " + obj.name);
    //         }

    //         // ------------------------------------ //
            
    //         ops = Integer.parseInt(sc.nextLine());

    //         if(ops == 0) break;
    //         else System.out.println("");
    //     }

    //     sc.close();
    // }
}