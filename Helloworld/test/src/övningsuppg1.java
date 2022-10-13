import java.util.Scanner;

public class övningsuppg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sten(1), Sax(2) eller Påse(3)?");
        int x = scanner.nextInt();

        int z = (int)(Math.random()*3)+1;

        while (x>3){
            System.out.println("Sten(1), Sax(2) eller Påse(3)?");
        x = scanner.nextInt();}



        if (x==z){
            System.out.println("Ni valde samma. Oavgjort!!");
        }


        if (x==2 & z==1){
            System.out.println("Du tog sax. Datorn tog sten. Du förlorade!");
        }
        if (x==3 & z==1){
            System.out.println("Du tog påse. Datorn tog sten. Du vann!");
        }


        if (x==1 & z==2){
            System.out.println("Du tog sten. Datorn tog sax. Du vann!");
        }
        if (x==3 & z==2){
            System.out.println("Du tog påse. Datorn tog sten. Du förlorade!");
        }


        if (x==1 & z==3){
            System.out.println("Du tog sten. Datorn tog påse. Du Förlorade!");
        }
        if (x==2 & z==3){
            System.out.println("Du tog sax. Datorn tog påse. Victory!");
        }

    }
}
