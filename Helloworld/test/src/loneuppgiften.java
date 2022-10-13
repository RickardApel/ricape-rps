import javax.swing.*;

public class loneuppgiften {
    public static void main(String[] args) {
        String a;
        double inkomst1, inkomst2=0, statskatt=0, flerinkomst, flerskatter, ga = 13100;
        a = JOptionPane.showInputDialog(null, "Ange årsinkomst");
        inkomst1 = Double.parseDouble(a);
        flerskatter = JOptionPane.showConfirmDialog(null, "Vill du beräkna fler skatter?",
                " ", JOptionPane.YES_NO_OPTION);
        if (flerskatter == 0) {
            do {
                a = JOptionPane.showInputDialog(null, "Ange ytterligare inkomst");
                flerinkomst = Double.parseDouble(a);
                inkomst2 += flerinkomst;
                flerskatter = JOptionPane.showConfirmDialog(null, "Vill du beräkna fler skatter?",
                        " ", JOptionPane.YES_NO_OPTION);
            } while (flerskatter == 0);
        }
        else if (flerskatter == 1);


        if ((inkomst1 + inkomst2) >= (438900 + ga) && (inkomst1 + inkomst2) <= (638500 + ga))
            statskatt = ((inkomst1 + inkomst2 - (438900 + ga)) * 0.20);
        else if ((inkomst1 + inkomst2) > (638500 + ga))
            statskatt = ((inkomst1 + inkomst2 - 438900 + ga) * 0.20 + (inkomst1 + inkomst2 - 638500 + ga) * 0.05);
        else if ((inkomst1 + inkomst2) < (438900 + ga))
            statskatt = 0;

        JOptionPane.showMessageDialog(null, "Du ska betala " + statskatt + "kr i statlig skatt");
    }
}
