import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class Summarizing {
     public static void main(String[] args) {
          
           List<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,5));

           IntSummaryStatistics collect = arr.stream().collect(Collectors.summarizingInt(x->x));

           System.out.println(collect);
           System.out.println(collect.getMax());
           System.out.println(collect.getMin());
           System.out.println(collect.getAverage());
           System.out.println(collect.getCount());
           
     }
}
