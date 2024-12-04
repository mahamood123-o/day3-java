import java.util.*;
public class power2{
    public static void main(String args[]){
        int a=8388608;
        if((a&(a-1))==0)
        {
            System.out.println("Power of 2");
        }
        else
        {
            System.out.println("Not a power of 2");
            
        }
    }
}