public class ReverseString {
    private static String reverseRecursion(String s){
        if ((s.length() <= 1) ) return s;
        return reverseRecursion(s.substring(1)) + s.charAt(0);

    }

    private static String reverseSimple(String s){
        char[] strChar = s.toCharArray();
        int size = strChar.length;
        for (int i=0; i<size/2;i++){
            char tmp = strChar[i];
            strChar[i]=strChar[size-i-1];
            strChar[size-i-1]=tmp;
        }
        return new String(strChar);
    }

    private static String reverseByBuilder(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseRecursion("java"));
        System.out.println(reverseSimple("java"));
        System.out.println(reverseByBuilder("java"));
    }
}
