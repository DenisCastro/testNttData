package intern;

import java.util.LinkedHashMap;

public class Log {

    public static LinkedHashMap<String, String> nomeLogMap = null;

    public static LinkedHashMap<String, String> setLogMap(LinkedHashMap<String, String> elements) {
        return nomeLogMap = elements;
    }

    public static String logAzul(String arg0) {
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RESET = "\u001B[0m";
        ;
        return ANSI_BLUE + arg0 + ANSI_RESET;
    }

    public static String logVermelho(String arg0) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        ;
        return ANSI_RED + arg0 + ANSI_RESET;
    }

    public static String logVerde(String arg0) {
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        ;
        return ANSI_GREEN + arg0 + ANSI_RESET;
    }
}
