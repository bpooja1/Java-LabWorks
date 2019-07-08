package Except;
import java.lang.Exception;

public class ExcepTest {
    public static void main(String[] args) {
        int x =5;
        ExcepTest ex= new ExcepTest();
        try
        {
            System.out.println(x);
        }catch(NullPointerException e){
            System.out.println("Error");

        }
    }
}
