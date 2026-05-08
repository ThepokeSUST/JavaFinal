
import java.util.stream.Stream;




public class creation{
    public static void main(String[] args) {
          
          System.out.println("start");
          
          //stream Of method
          Stream<Integer> stream= Stream.of(10,9,8,7,6,5,4,3,2,1,0,-1,-2);
          System.out.println(stream);
          stream.map((x)-> x*x).forEach(x-> System.out.println(x));
          System.out.println("_______________________");
          //stream iterate method

          Stream<Integer> stream1= Stream.iterate(1, x->x+1);
          stream1.limit(100).forEach(x-> System.out.print(x+" "));
          System.out.println();
          System.out.println("_______________________");
          //stream generate method
          Stream.generate(()->4).limit(10).forEach(x->System.out.print(x+" "));

          System.out.println("end");
    }
}