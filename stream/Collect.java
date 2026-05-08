import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        System.out.println("start");
          
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(3,23,2,122,3,3,11,1,11,1));

        System.out.println(arr);

        //toSet
        System.out.println(arr.stream().collect(Collectors.toSet()));

        int a=90;
        // System.out.println(String.valueOf(a));

        //joining
        String str= arr.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(str);

        //toMap
        // Map<Integer, Integer> map = arr.stream().collect(Collectors.toMap(x->x,x->x ));
        // System.out.println();
        // System.out.println(map);



        //groupingBy
        
        System.out.println("end");
    }    
}
