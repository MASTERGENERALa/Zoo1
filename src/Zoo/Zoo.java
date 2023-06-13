package Zoo;
import java.util.ArrayList;
import java.util.List;
public class Zoo {
         public static void main(String[] args) {
            List<String> animals = new ArrayList<>();
            // Додати тварини до списку
            animals.add(0, "Лев");
            animals.add(1, "Тигр");
            animals.add(2, "Ведмідь");
            animals.add(3, "Зебра");
            animals.add(4, "Слон");
            animals.add(5, "Жираф");
            animals.add(6, "Мавпа");
            animals.add(7, "Крокодил");

            // Вивести список тварин у консоль
            for (String animal : animals) {
                System.out.println(animal);
            }
        }
}

