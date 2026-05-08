
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;



public class Reduce{
       public static void main(String[] args) {
            
             ArrayList<Integer> array= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

             System.out.println(array);
               
             //summation
             Stream<Integer> s1= array.stream();
             System.out.println(s1.reduce(0, (a,b)->a+b));
            //  System.out.println(s1.count());
             s1= array.stream();
             System.out.println(s1.reduce((a,b)->a+b).get());
             

             //find max

            //  array.stream().reduce(Integer.MIN_VALUE,(a,b)-> a<b?b:a );
            System.out.println(array.stream().reduce(Integer.MIN_VALUE,(a,b)-> a<b?b:a ));
            // System.out.println(Integer.MIN_VALUE);
            System.out.println(array.stream().max(Integer::compareTo));
            System.out.println(array.stream().min(Integer::compareTo));


            //
            System.out.println(array.stream().reduce(0,Integer::sum));
            System.out.println(array.stream().reduce(Integer::sum));

             
       }
}
