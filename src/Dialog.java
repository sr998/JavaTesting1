import java.util.Scanner;

public class Dialog {

    public static void Talk(double a, double y)
    {
        double x = 0;
        String aString = "";
        String yString = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a (double) : ");
        aString = in.nextLine();
        if (!Checker.isNumeric(aString))
        {
            System.out.println("Вы ввели неподходящее число");
            System.out.println("Перезагружаем программу ....");
            Dialog.Talk(a,y);
        }else {
            a = Double.parseDouble(aString);

            System.out.println("Введите число y (double) : ");
            yString = in.nextLine();

            if (!Checker.isNumeric(yString))
            {
                System.out.println("Вы ввели неподходящее число");
                System.out.println("Перезагружаем программу ....");
                Dialog.Talk(a,y);
            } else {
                y = Double.parseDouble(yString);
                x = Calculations.Calculate(a,y);
                System.out.println("Ответ x = "+x);
            }
        }


    }

}
