
//С помощью методов indexOf(), lastIndexOf(), substring() и trim() написать код в проекте StringExperiments,
// который считает сумму заработка Васи и Маши.

//"Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"

public class Loader
{
    private static Integer findAmmountInText (String text, int startPoint)
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

//0 - 48
//9 - 57
// space - 32

//первое вхождение - 20
//последнее вхождение - 62


    public static void main(String[] args)
    {
        String text = "Вася заработал 333 рублей, Петя - 7563 рубля, а Маша - 111 рублей";
        String str = "руб";
        int vasya = findAmmountInText(text,text.indexOf(str));
        int masha = findAmmountInText(text,text.lastIndexOf(str));
        System.out.println("Зарплата Васи и Маши: " + (vasya + masha));
    }
}