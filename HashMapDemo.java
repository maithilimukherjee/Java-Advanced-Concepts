import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put("tina","0000");
        phoneBook.put("ronit","1111");
        phoneBook.put("bubbles","2222");

        for (String name: phoneBook.keySet())
        {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }
}

/*
 * output:
 * ronit: 1111
   bubbles: 2222
   tina: 0000 
 */