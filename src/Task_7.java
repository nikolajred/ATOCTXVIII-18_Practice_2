public class Task_7 {
    static int index;
    public static void main(String[] args) {
        String str_1 = "Santa Claus is positive heroe!!!";
        String [] str = str_1.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(str[i].endsWith("s")||str[i].endsWith("a")){
                index++;
            }

        }
        for (String str_2:str) {
            System.out.print(str_2 + " ");
        }
        System.out.println();
        System.out.println("Number of coincidences s and a in end word of frase is: " + index);
    }
}
