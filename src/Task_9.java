import java.util.ArrayList;
import java.util.Scanner;

public class Task_9 {
    public static String nameMonth;
    private int month;
    public static int numberOfDay;
    public static int minTemperature;
    public static int maxTemperature;
    public static int midleTemperature;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 12) {
            this.month = month;
        } else {
            System.out.println("error. input correct number of month: ");
            setMonth(scn.nextInt());
        }

    }

    Scanner scn = new Scanner(System.in);


    public static void main(String[] args) {
        Task_9 task = new Task_9();
        System.out.println("input number of month: ");

        task.setMonth(task.scn.nextInt());
        switch (task.getMonth()) {
            case 1:
                nameMonth = "January";
                numberOfDay = 31;
                break;
            case 3:
                nameMonth = "March";
                numberOfDay = 31;
                break;
            case 5:
                nameMonth = "May";
                numberOfDay = 31;
                break;
            case 7:
                nameMonth = "July";
                numberOfDay = 31;
                break;
            case 8:
                nameMonth = "August";
                numberOfDay = 31;
                break;
            case 10:
                nameMonth = "October";
                numberOfDay = 31;
                break;
            case 12:
                nameMonth = "December";
                numberOfDay = 31;
                break;
            case 2:
                nameMonth = "February";
                numberOfDay = 28;
                break;
            case 4:
                nameMonth = "April";
                numberOfDay = 30;
                break;
            case 6:
                nameMonth = "Juny";
                numberOfDay = 30;
                break;
            case 9:
                nameMonth = "September";
                numberOfDay = 30;
                break;
            case 11:
                nameMonth = "November";
                numberOfDay = 30;
                break;

        }
        ArrayList<Integer> temperature = new ArrayList<>(numberOfDay);
        for (int i = 0; i < numberOfDay; i++) {
            System.out.println("input temperature " + (i + 1) + " " + nameMonth);
            temperature.add(i, (task.scn.nextInt()));
        }
        maxTemperature = temperature.get(0);
        for (int i = 1; i < temperature.size(); i++) {
            if (temperature.get(i) > maxTemperature) {
                maxTemperature = temperature.get(i);
            }
        }
        minTemperature = temperature.get(0);
        for (int j = 1; j < temperature.size(); j++) {
            if (temperature.get(j) < minTemperature) {
                minTemperature = temperature.get(j);

            }
        }
        int t = 0;
        for (int k = 0; k < temperature.size(); k++) {
            t += temperature.get(k);
        }
        midleTemperature = t / numberOfDay;


        System.out.println(" MIN temperature was " + minTemperature + "°C it was " +
                (temperature.indexOf(minTemperature) + 1) + " " + nameMonth);
        System.out.println(" MAX temperature was " + maxTemperature + "°C it was " +
                (temperature.indexOf(maxTemperature) + 1) + " " + nameMonth);
        System.out.println(" Midle temperature per month was: " + midleTemperature);
    }
}
