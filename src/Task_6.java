public class Task_6 {
    static int index;
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("th*is is sum*mer");

        do {
            index = stringBuilder.indexOf("*");
            if(index < 0){
                System.out.println(stringBuilder);
                break;
            }
            stringBuilder.delete(index - 1, index + 1);
        }
        while (index != 0);

    }
}
