import java.util.Scanner;

public class dag2uppg5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ange en siffra");
        int daynumber =in.nextInt();
        System.out.println(getDayName(daynumber));


    }public static String getDayName(int daynumber) {
    String dayname;
    switch (daynumber) {
        case 1:
            dayname = "monday";
            break;
        case 2:
            dayname = "tuesday";
            break;
        case 3:
            dayname = "wednesday";
            break;
        case 4:
            dayname = "thursday";
            break;
        case 5:
            dayname = "friday";
            break;
        case 6:
            dayname = "saturday";
            break;
        case 7:
            dayname = "sunday";
            break;
        default:
            dayname = "invalid day";
            break;


    }return dayname;
}
}