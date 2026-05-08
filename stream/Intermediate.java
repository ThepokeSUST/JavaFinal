
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;






public class Intermediate {
     public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println();  
        Stream<Integer> str=array.stream().sorted();
        str.forEach(System.out::println);      
     }    
}
