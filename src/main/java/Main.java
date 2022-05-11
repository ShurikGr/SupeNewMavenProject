import org.apache.commons.lang3.StringUtils;

public class Main {

    public static String abbr (String str, int size){
        return str.substring(0, size - 3) + "...";

    }

    public static boolean abbrTest () {
        if (!"S...".equals(abbr("Shurik", 4 ))){
            return false;
        }

        if (!"Hell0...".equals(abbr("Hello world", 4 ))){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(StringUtils.abbreviate("Shurik", 4 ));
        System.out.println(abbr("Shurik", 4 ));

        System.out.println(abbrTest());

    }
}
