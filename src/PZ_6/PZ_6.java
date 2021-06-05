package PZ_6;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class PZ_6 {
    public static void main(String[] args) throws IOException {
        //Изменить путь к файлу на свой
        String fileName = "C://work/JavaExamples/JavaExamples.txt";
        String str1 = readUsingScanner(fileName);
        System.out.println("1. Слова записанные в файл: " + str1);
        System.out.println("2. Массив в алфавитном порядке: " + arrayOfList(str1));
        mapCount(str1);

    }

    private static String readUsingScanner(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName));
        //В задании не указано, но если файл записан не в строчку, то .nextLine не справится, на всякий случай написал .useDelimiter
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }

    private static List<String> arrayOfList(String str1){
        String[] strArray = str1.split("\\s+");
        List<String> arrList = new ArrayList<String>(Arrays.asList(strArray));
        Collections.sort(arrList);
        return arrList;
    }

    private static void mapCount (String str1){
        HashMap<String, Integer> wordToCount = new HashMap<>();
        int maxKey = 0;
        for (String i : arrayOfList(str1))
        {
            if (!wordToCount.containsKey(i))
            {
                wordToCount.put(i,0);
            }
            wordToCount.put(i, wordToCount.get(i) + 1);
        }
        System.out.println("3. Список повторяющихся слов: ");
        for (String word : wordToCount.keySet())
        {
            System.out.println("Слово: " + word + " ,повторений: " + wordToCount.get(word));
        }
        //Поиск и вывод самых частовстречающихся слов
        //тут нахожу самое большое кол-во повторов
        for (String word1: wordToCount.keySet()){
            if (maxKey < wordToCount.get(word1)){
                maxKey = wordToCount.get(word1);
            }
        }
        //тут нахожу ключ по значению, т.к. в нашем случае оно уникально (если несколько слов с одинаковым максимальным
        // колличеством повторений, их выведется несколько, по заданию тут ограничений на вывод только одного конкретного
        // слова - нет)
        System.out.println("Слово(а) с максимальным кол-вом повторений: ");
        for (Map.Entry<String,Integer> word2 : wordToCount.entrySet())
        {
            if(word2.getValue() == maxKey){
                System.out.println(word2.getKey() + " ,повторений: " + word2.getValue());
            }
        }
    }
}
