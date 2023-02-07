
import java.util.*;
public class scanner {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

           if(age > 18) {
               System.out.println("adult");
           }
            else {
               System.out.println("Not adult");
           }
    }
}
