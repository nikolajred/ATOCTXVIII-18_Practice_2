import java.util.ArrayList;

public class Task_8 {
    public static String str_2;

    public static void main(String[] args) {
        String str = "The storm is expected to slam into the Virgin Islands and northeastern Puerto Rico on Wednesday.";
        String str_1 = "The the is to and on";
        ArrayList<String> arrayList_1 = new ArrayList<>();
        ArrayList<String> arrayList_2 = new ArrayList<>();
        String[] string = str.split(" ");
        String[] string_1 = str_1.split(" ");
        for (int i = 0; i < string.length; i++) {
            arrayList_1.add(i, string[i]);
        }
        for (int i = 0; i < string_1.length; i++) {
            arrayList_2.add(i, string_1[i]);
        }

        for (int i = 0; i < arrayList_1.size(); i++) {
            for (int j = 0; j < arrayList_2.size(); j++) {
                if (arrayList_1.get(i).equals(arrayList_2.get(j))) {
                    arrayList_1.remove(i);
                }

            }

        }
        for (int i = 0; i < arrayList_1.size(); i++) {

            str_2 += " " + arrayList_1.get(i);

        }
        str_2 = str_2.substring(5);
        System.out.print(str_2);

    }
}
