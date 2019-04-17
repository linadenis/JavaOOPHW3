import Exceptions.MyException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Group gr = new Group();
        try {
            gr.addStudent(new Student("Vasya", "Petrikov", 20, 314, 312546));
            gr.addStudent(new Student("Ivan", "Ivanov", 19, 315, 547896));
            gr.addStudent(new Student("Mariya", "Ivanova", 20, 312, 231245));
            gr.addStudent(new Student("Marina", "Yarulina", 20, 317, 231248));
            gr.addStudent(new Student("Boris", "Rogalchuk", 21, 319, 231548));
            gr.addStudent(new Student("Vitalik", "Sitnik", 19, 316, 331548));
            gr.addStudent(new Student("Vitalina", "Pavlova", 20, 318, 331555));
            gr.addStudent(new Student("Anna", "Anechkina", 20, 320, 331235));
            gr.addStudent(new Student("Vova", "Gavrik", 19, 322, 331535));
            gr.addStudent(new Student("Sasha", "Antonyuk", 19, 321, 331599));
            gr.addStudent(new Student("Sasha", "Andreeva", 19, 323, 331699));
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

        Student st = gr.search("Yarulina");
        System.out.println(st.toString());


        gr.removeStudent(300);
        gr.removeStudent(312);

        System.out.println(gr);


    }
}
