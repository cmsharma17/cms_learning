/*Program demonstrating use of a map to count the frequency of words in a file. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {

	public static void main(String[] args) {
		File f = new File("./src/resources/myFile.txt");
		Map<String,Integer> wordCount = new TreeMap<String,Integer>();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				String word = sc.next();
				//System.out.println("word.."+word);
				if(!wordCount.containsKey(word)){
					//System.out.println("true");
					wordCount.put(word, 1);
				}
				else{
					//System.out.println("-------"+wordCount.get(word));
					wordCount.put(word, wordCount.get(word)+1);
				}
			}
			// show results
            for(String word : wordCount.keySet())
                System.out.println(word + " " + wordCount.get(word));
            System.out.println(wordCount.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
