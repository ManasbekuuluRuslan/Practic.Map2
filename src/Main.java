import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сөздөрдүн тизмесин киргизиңиз:");
        String soz = scanner.nextLine();
        String[] a = soz.split("\\s");

        Map<String, Integer> map = new HashMap<>();
        for (String s: a) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        for (String s : map.keySet()) {
            int counter = map.get(s);
            System.out.println(s + " - " + counter);
        }

        /* НАПИШИТЕ ПРОГРАММУ, КОТОРАЯ СЧИТЫВАЕТ СПИСОК
        СЛОВ ИЗ КОНСОЛИ И ВЫВОДИТ НА ЭКРАН КОЛИЧЕСТВО ВХОЖДЕНИЙ
        КАЖДОГО СЛОВА В СПИСКЕ.НАПРИМЕР, ЕСЛИ ПОЛЬЗОВАТЕЛЬ
        ВВОДИТ СПИСОК "HELLO WORLD HELLO JAVA WORLD", ПРОГРАММА
        ДОЛЖНА ВЫВЕСТИ: HELLO - 2 WORLD - 2 JAVA - 1 ДЛЯ РЕШЕНИЯ
        ЗАДАЧИ ИСПОЛЬЗУЙТЕ MAP<STRING, INTEGER>. */
    }
}