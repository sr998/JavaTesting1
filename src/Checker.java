public class Checker {

    public static boolean isNumeric(String str)
    {
        boolean numeric ;
        numeric = str.matches("-?\\d+(\\.\\d+)?");
        if(!numeric)
            return false;
        else
            return true;

    }
}
