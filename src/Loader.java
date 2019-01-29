
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String text2 = "     sfsafwefd  54656   kljk  0-000987 644     ";

        char ch = text.charAt(2);
        int chCode = (int)ch;
        System.out.println(chCode);
        System.out.println(ch);
        System.out.println(text);
        System.out.println("Text length: " + text.length());
        System.out.println(text.lastIndexOf("руб"));

        String fragment = text.substring(62,65);
        System.out.println(fragment);
        System.out.println(text2.trim());


    }
}