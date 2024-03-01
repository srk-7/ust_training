import java.util.*;
public class WordCount 
{
    public static void main(String[] args) 
    {
        String para ="Hyderabad is the capital of southern India's Telangana state. A major center for the technology industry, it's home to many upscale restaurants and shops. Its historic sites include Golconda Fort, a former diamond-trading center that was once the Qutb Shahi dynastic capital. The Charminar, a 16th-century mosque whose 4 arches support towering minarets, is an old city landmark near the long-standing Laad Bazaar";
        Scanner sc = new Scanner(System.in);
        String word= sc.next();
        int count = countWord(para, word);
        System.out.println(count);
    }
    public static int countWord(String para, String word) 
    {
        String[] words = para.split(" ");
        int count = 0;
        for (String i : words) {
            if (i.equalsIgnoreCase(word))
            {
                count++;
            }
        }
        return count;
    }
}
