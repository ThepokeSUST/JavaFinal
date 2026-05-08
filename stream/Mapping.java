
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Mapping {
    public static void main(String[] args) {
          System.out.println("start");
          
          ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(2,1,33,8,0));
          System.out.println(arr);
          
          Stream<Integer> stream1= arr.stream();
    //GroupingBy
          Map<Boolean, List<Integer>> collect = stream1.collect(Collectors.groupingBy(
            x->x%2==0
          ));
          System.out.println(collect);

          ArrayList<String> arrstr= new ArrayList<>(Arrays.asList("dipok","dipu","Deb","Nath","dipu"));
    //GroupingBy
          Map<Integer,List<String>> collect1=arrstr.stream().collect(Collectors.groupingBy(x-> x.length()));
          System.out.println(collect1);

    //Mapping
          Map<Integer, Set<String>> collect2 = arrstr.stream().collect(Collectors.groupingBy(
            x-> x.length(),
            Collectors.mapping(x->x.toUpperCase(), Collectors.toSet())
          ));      
          System.out.println(collect2);
          System.out.println("end");
    }
}
