import java.lang.*;
import java.util.*;
class Main {
    public static void main(String... args) {

        String s = "abs";
        String s1 = new String();
        String s2 = new String(new char[]{'m', 'o', 'h', 'i', 't','t', 't', 'a', 'a', 'a'});
        String s3 = new String(s2);
        String s4 = new String(new StringBuilder());
        String s5 = new String(new StringBuffer());
        for (int i = 0; i < s2.length(); i++) {
            println(s2.codePointAt(i)+"");
        }
        println(""+s2.contains(Character.toString('s')));
        println(""+s2.equalsIgnoreCase("mhit"));
        println("priting bytes");
        byte[] byteArray = s2.getBytes();
        println(Arrays.toString(byteArray));
        println(""+s2.indexOf('t'));
        String[] names = new String[]{"Laptop", "Mouse", "Keyboard"};
        println(s2.join("->", names));
        println(""+s2.lastIndexOf('t'));
        println(s2.replaceAll("t", "M"));
        println(s2.substring(0, 3));
        println(String.valueOf(1));
        println(""+Integer.valueOf('c'));
        println(Integer.toString(100));


        StringBuilder sb = new StringBuilder(s2);
        println(sb.toString());
        sb.setCharAt(0, 'M');
        println(sb.toString());
        println(Arrays.deepToString(new int[][]{1,2,3,4});
        
    }

    private static void println(String s) {
        System.out.println(s);
    }
}
