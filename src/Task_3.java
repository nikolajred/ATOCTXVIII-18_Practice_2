public class Task_3 {
    public static void main(String[] args) {
        String str_1 = "Hello World!";
        String str_2 = str_1.substring(str_1.length()-2);
        String str_3 = str_1.substring(0, str_1.length()-2);
        String str_4 = str_2.concat(str_3);
        System.out.println(str_4);

    }
}
