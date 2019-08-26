public class Task_4 {
    public static char char_1;
    public  static String str_2;
    public static String str_1 = "Candy";
    public static void main(String[] args) {


        for (int i = 0; i < str_1.length(); i++) {
            char_1 = str_1.charAt(i);
            str_2  = str_2 + char_1 + char_1;
        }
        System.out.println(str_2.substring(4));

    }
}
