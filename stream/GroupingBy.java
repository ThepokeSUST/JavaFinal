
import  java.util.Arrays;
import  java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}



public class GroupingBy {
    public static void main(String[] args) {
          System.out.println("strt");
           
           List<Student> students = Arrays.asList(
                new Student("Rahim", 85),
                new Student("Karim", 70),
                new Student("Aman", 85),
                new Student("John", 60),
                new Student("Bob", 70)
        );


        Map<Integer, List<Student>> map2 = students.stream().collect(Collectors.groupingBy(x->x.marks));
        System.out.println(map2);

        System.out.println(map2.get(80));
        System.out.println(map2.get(85).get(1).name);


        //pass fail
        System.out.println(students.stream().collect(Collectors.groupingBy(x-> x.marks>70?"pass":"fail" )));


        //counting
        System.out.println("_______");
        System.out.println(students.stream().collect(Collectors.groupingBy(
             x-> x.marks,
             Collectors.counting()
        )));
          System.out.println("end");
    }
}
