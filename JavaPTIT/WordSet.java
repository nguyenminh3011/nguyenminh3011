import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private String words;
    private TreeSet<String> union = new TreeSet<>();
    private TreeSet<String> intersection = new TreeSet<>();
    WordSet(String words){
        this.words = words;
    }
    private String[] getWords() {
        return words.split("\\s++");
    }
    public WordSet union(WordSet other){
        for(String i : this.getWords()){
            union.add(i.toLowerCase());
        }
        for(String i : other.getWords()){
            union.add(i.toLowerCase());
        }
        return new WordSet(String.join(" ", union));
    }
    public WordSet intersection(WordSet other){
        for(String i : this.getWords()){
            for(String j : other.getWords()){
                if(i.compareToIgnoreCase(j) == 0){
                    intersection.add(i.toLowerCase());
                }
            }
        }
        return new WordSet(String.join(" ", intersection));
    }
    public String toString(){
        return words;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
        in.close();
    }
}
