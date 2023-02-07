import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("student avrage % : ");
            int attendnce = in.nextInt();
        if ( attendnce >  75) {
            System.out.println("avarage");
        } else {
            System.out.println( "Not avarage" );
        }
    }
}
