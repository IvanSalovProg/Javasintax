package Zadachi;

import java.util.HashMap;

//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.
//Ту же программу вы можете использовать и для подсчета количества символов в строке.
// Все, что вам нужно сделать, это удалить один пробел (удалить пробел, указанный в методе split) и
// прописать String [] words = st.split (“”);
public class Five {
    public static void main(String[] args) {
        String st = "Current task posted for Java developers developers";
        String[] words = st.split(" ");
        HashMap<String,Integer> keyValue = new HashMap<String,Integer>();
        for (int i=0; i<= words.length-1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter+1);
            }
            else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);


    }
}
