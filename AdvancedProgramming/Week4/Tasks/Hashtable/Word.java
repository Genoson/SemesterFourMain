// an example of when to use a Hashtable
import java.util.Hashtable;

public class Word {

    private String name;

    public Word(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Hashtable<Word, String> wordsTable = new Hashtable<>();

        Word word = new Word("Hello");
        wordsTable.put(word, "A Greeting");
        String definition = wordsTable.get(word);
        System.out.println(definition);
        definition = wordsTable.remove(word);
        System.out.println(definition);
        System.out.println(wordsTable.get(word));
    }

    
}
