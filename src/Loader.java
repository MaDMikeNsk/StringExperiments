
//С помощью методов indexOf(), lastIndexOf(), substring() и trim() написать код в проекте StringExperiments,
// который считает сумму заработка Васи и Маши.

//"Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"

public class Loader
{
    private static Integer findAmountInText (String text, int startPoint)
    {
        char ch;
        Integer a;
        String str = " ";
        do
            {
                startPoint--;
                ch = text.charAt(startPoint);
                if (((48<=(int)ch)&&((int)ch<=57)) || (int)ch==32) {
                    str = ch + str;
                }
            } while (((48<=(int)ch)&&((int)ch<=57)) || (int)ch==32);
        a = Integer.parseInt(str.trim());
            return a;
    }

// код '0' - 48
//код '9' - 57
// space - 32

//первое вхождение - 20
//последнее вхождение - 62


    public static void main(String[] args)
    {
        String text = "Вася заработал 858 рублей, Петя - 7563 рубля, а Маша - 2 рублей";
        String str = "руб";
        int vasya = findAmountInText(text,text.indexOf(str));
        int masha = findAmountInText(text,text.lastIndexOf(str));
        System.out.println("Зарплата Васи и Маши: " + (vasya + masha));
    }
}