package Problem1;

import java.util.Hashtable;

public class HashImplementation {

    private Hashtable<Integer, Word> hashTable;

    static class Word {
        String word;
        String definition;

        public Word(String word, String definition) {
            this.word = word;
            this.definition = definition;
        }
    }

    HashImplementation(){
        this.hashTable = new Hashtable<Integer, Word>();

    }
    

    public static void main(String[] args) {

        Word word1 = new Word("hello", "- A greeting");
        Word word2 = new Word("world", "- A place");
        Word word3 = new Word("monkey", "- An animal");
        Word word4 = new Word("banana", "- A fruit");

        HashImplementation hashImplementation = new HashImplementation();
        hashImplementation.hashTable.put(word1.word.hashCode(), word1);
        hashImplementation.hashTable.put(word2.word.hashCode(), word2);
        hashImplementation.hashTable.put(word3.word.hashCode(), word3);
        hashImplementation.hashTable.put(word4.word.hashCode(), word4);

        System.out.print(hashImplementation.hashTable.get(word1.word.hashCode()).word);
        System.out.println(hashImplementation.hashTable.get(word1.word.hashCode()).definition);

        System.out.print(hashImplementation.hashTable.get(word2.word.hashCode()).word);
        System.out.println(hashImplementation.hashTable.get(word2.word.hashCode()).definition);

        System.out.print(hashImplementation.hashTable.get(word3.word.hashCode()).word);
        System.out.println(hashImplementation.hashTable.get(word3.word.hashCode()).definition);

        System.out.print(hashImplementation.hashTable.get(word4.word.hashCode()).word);
        System.out.println(hashImplementation.hashTable.get(word4.word.hashCode()).definition);


        hashImplementation.hashTable.remove(word1.word.hashCode());
        hashImplementation.hashTable.remove(word2.word.hashCode());
        hashImplementation.hashTable.remove(word3.word.hashCode());
        hashImplementation.hashTable.remove(word4.word.hashCode());

        System.out.print("The remove method worked: ");
        System.out.println(hashImplementation.hashTable.isEmpty());

        
        

    }

   

}
