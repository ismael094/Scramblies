public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char[] letters = str2.toCharArray();
        for (char chars : letters) {
            if (str1.contains(chars+"")){
                str1 = str1.replaceFirst(chars+"","");
            } else {
                return false;
            }
        }
        return true;
    }
}
