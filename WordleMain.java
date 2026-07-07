import java.util.*;
import java.util.Random;
import java.io.File;
public class WordleMain
{
    public static void Wordlemain()
    {
        Wordimport importer = new Wordimport();
        Wordleguess checking = new Wordleguess();
        String targetword = importer.getTargetWord();
        Scanner sc = new Scanner(System.in);
        int c=0;
        String targetWord = importer.getTargetWord();
        String hint = importer.getHint(2);  
        System.out.println("Hint - some letters in the word: " + hint);
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter your new guess");
            String guess=sc.nextLine().toUpperCase().trim();
            String r=checking.check(guess, targetword);
            System.out.println(r);
            if(guess.equals(targetword))
            {
                System.out.println("Congrats you won");
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Sorry you lost the word was: "+targetword);
        }
    }
}
