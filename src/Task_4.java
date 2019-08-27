import java.util.ArrayList;

public class Task_4 {
    public static String str_3 = "";
    public static String str_1 = "Candy";

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < str_1.length(); i++) {
            String newElement = str_1.substring(i, i + 1);
            arrayList.add(i, (newElement.concat(newElement)));
            str_3 += (arrayList.get(i));

        }

        System.out.println(arrayList);
        System.out.println(str_3);

    }
}
