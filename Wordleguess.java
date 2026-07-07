import java.util.*;
import java.util.Random;
import java.io.File;
class Wordleguess 
{
    String check(String guess, String target)
    {
        String result="";
        for(int i=0;i<5;i++)
        {
            char g=guess.charAt(i);
            char t=target.charAt(i);
            if (g == t)
            {
                result = result + "[" + g + " correct spot] ";
            }
            else if (target.indexOf(g) != -1)
            {
                result = result + "[" + g + " wrong spot] ";
            }
            else
            {
                result = result + "[" + g + " not in word] ";
            }
        }
        return result;
    }
}