public class Task_5 {
    public static String str_1 = "bob is bab bуb is beb bad is bat bpb";
    public static  int index;
    public static String str_2 = "b*b";
    public static void main(String[] args) {

String [] str = str_1.split(" ");

        for (int i = 0; i < str.length ; i++) {
            String str_3 = str[i];
            if(str_3.length()==str_2.length()&& str_3.charAt(0)==str_2.charAt(0)&&
                    str_3.charAt(str_3.length()-1)==str_2.charAt(str_2.length()-1)){
                index++;
                System.out.print(str [i] + " ");
            }
            System.out.println(str [i] + " ");
        }
        System.out.println("вхождений " + index);


    }
}
