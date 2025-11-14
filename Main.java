//1 Написать метод, который меняет 2 элемента массива местами (массив может быть любого ссылочного типа)
//
//2 Создать класс Box с тремя параметризованными типами. Создать 3 коробки с типами String, Integer и Float.
// Вывести в консоль сумму всех переданных в коробки чисел
//
//3 Написать метод, который принимает строку от пользователя, и если в этой строке есть число -
// выбрасывает исключение, выводя пользователю сообщение: “Строка не должна содержать число!”

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("====================== Задача 1 ======================");

        String [] exampleArray1 = {"один", "два", "три", "четыре"};
        System.out.println(Arrays.toString(exampleArray1));
        changeElements(exampleArray1, 0, 3);
        System.out.println(Arrays.toString(exampleArray1));

        Integer [] exampleArray2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(exampleArray2));
        changeElements(exampleArray2, 0, 2);
        System.out.println(Arrays.toString(exampleArray2));

        System.out.println();


        System.out.println("====================== Задача 2 ======================");

        Box<String, Integer, Float> box1 = new Box<>("Петр", 1, 5.5f);
        Box<Integer, Float, String> box2 = new Box<>(2, 3.5f, "Иван");
        Box<Float, String, Integer> box3 = new Box<>(2.5f, "Николай", 3);

        double result = box1.getSum() + box2.getSum() + box3.getSum();

        System.out.println("Общая сумма в коробках: " + result + "\n");


        System.out.println("====================== Задача 3 ======================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userInput = scanner.nextLine();
        getNumberInString(userInput);
    }

    public static <T> void changeElements(T[] array, int index1, int index2) throws Exception {
        if (index1 < 0 || index1 >= array.length) {
            throw new Exception("Значение индекса 1 выходит за гранницы");
        }

        if (index2 < 0 || index2 >= array.length) {
            throw new Exception("Значение индекса 2 выходит за гранницы");
        }

        T tempElement = array[index1];
        array[index1] = array[index2];
        array[index2] = tempElement;
    }

    public static void getNumberInString (String string) throws Exception {
        char[] chars = string.toCharArray();
         for (int i = 0; i < string.length(); i++) {
             if (Character.isDigit(chars[i])) {
                 throw new Exception("Строка не должна содержать число!");
             }
         }
    }
}
