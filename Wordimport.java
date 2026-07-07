import java.util.*;
import java.util.Random;
import java.io.File;
public class Wordimport 
{
    private String[] words = new String[500]; 
    private int wordCount = 0;                
    private String targetWord;
    public Wordimport()
    {
        loadWords();
        pickRandomWord();
    }
    private void loadWords()
    {
        try
        {
            Scanner reader = new Scanner(new File("words.txt"));
            while (reader.hasNextLine())
            {
                words[wordCount] = reader.nextLine().trim();
                wordCount++;
            }
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("Could not find words.txt");
        }
    }
    private void pickRandomWord()
    {
        Random rand = new Random();
        int index = rand.nextInt(wordCount);
        targetWord = words[index];
    }
    public String getTargetWord()   
    {
        return targetWord;
    }
    public String getHint(int numberOfLetters)
    {
    String hint = "";
    Random rand = new Random();
    boolean[] used = new boolean[5]; 

    int lettersGiven = 0;
    while (lettersGiven < numberOfLetters)
    {
        int pos = rand.nextInt(5); 
        if (!used[pos])
        {
            used[pos] = true;
            hint = hint + targetWord.charAt(pos);
            lettersGiven++;
        }
    }
    return hint;
    }
}