/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shinchokudame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int wordMax = 4;
        ArrayList<String> words = new ArrayList<>();
        String wrd[] = {"進捗", "どう", "です", "か"};
        words.addAll(Arrays.asList(wrd));
        
        ArrayList<Integer> wordsLength = new ArrayList<>();
        Integer len[] = {2,2,2,1};
        wordsLength.addAll(Arrays.asList(len));
        
        int wordCount = 0, storedCount = 0, lastNum = wordMax;
        String str = "";
        
        while(storedCount != wordMax-1){
            int num = myRand();
            str += words.get(num);
            wordCount += wordsLength.get(num);
            storedCount = num > lastNum ? storedCount+1 : 0;
            lastNum = num;
        }
        
        System.out.println(str + "???\n" + (wordCount+3) + "文字で煽られました");
    }
    /**
     * 0～3の乱数を生成
     * @return int random_number(0-3)
     */
    public static int myRand(){
        int tmp = (int)((Math.random() * 100.0) % 4);
        return tmp;
    }
}
