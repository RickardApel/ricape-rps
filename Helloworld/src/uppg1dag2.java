import java.util.Scanner;

public class uppg1dag2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.print("Skriv ett tal");
        int tal = in.nextInt();
        if  (tal%2==0){
            System.out.println("Talet är jämnt");
        }else{
            System.out.println("Talet är udda");
        }

    }
}
