public class Task_1 {
    public static void main(String[] args) {
        String str_1 = "Hello";
        String str_2 = "World";
        String str_3 = str_1.substring(1);
        String str_4 = str_2.substring(1);
        String str_5 = str_3.concat(str_4);
        System.out.println(str_5);
    }

}
