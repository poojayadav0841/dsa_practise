
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HotelFloor {
    
    private static int hotelBooking(List<String> queries){

        int coins= 0;
        Set<String> booked = new HashSet<>();

        for(String query : queries){
            char op = query.charAt(0);
            String room = query.substring(1);

            if(op == '+'){
                booked.add(room);
                coins++;
            }else{
                booked.remove(room);
            }
        }
        System.out.println("Rooms allocated are : "+booked);
        return coins;
    }
    public static void main(String args[]){

        List<String> queries = new ArrayList<>(Arrays.asList("+1A","+3E","-1A","+4F","+1A","-3E"));

        /*problem statement -
         * Consider booking queries to be ["+1A", "+3E", "-1A", "+4F", "+1A", "-3E"]
         * +1A: Room A on the 1st floor is booked and you collected 1 coin.
         * +3E: Room E on the 3rd floor is booked and you collected 1 coin.
         * -1A: Room A on the 1st floor is freed.
         * +4F: Room F on the 4th floor is booked and you collected 1 coin.
         * +1A: Room A on the 1st floor is booked and you collected 1 coin.
         * -3E: Room E on the 3rd floor is freed.
         * So you collected 4 coins.
         */

         System.out.println("Number of coins earned from allocated room : "+hotelBooking(queries));
    }
}
