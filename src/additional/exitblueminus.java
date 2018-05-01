package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class exitblueminus implements ActionListener  {


    public void actionPerformed(ActionEvent e) {

        bext--;
        bexit11 = bext;
        int penalty = 3;

        System.out.println(round.getText()+". Время - "+min+":"+count+" Камджон синему снят обратно(-1 балл)");

        if (bexit11 ==0) {

            amount--;
            ar = amount;
            //  System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2--;
            ar2 = amount2;
            //  System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3--;
            ar3 = amount3;
            //   System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bexit11 ==1){

            amount--;
            ar = amount;
            //  System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2--;
            ar2 = amount2;
            //   System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3--;
            ar3 = amount3;
            //  System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bexit11 ==2){

            amount--;
            ar = amount;
            //  System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2--;
            ar2 = amount2;
            //   System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3--;
            ar3 = amount3;
            //  System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }

        if (bexit11<0) {
            bext=0;
        }

        labelcolor5 a = new labelcolor5();
        a.colorL(ab, ar);

        // System.out.println(bpenal);
        bexit.setText(String.valueOf(bext));
        bexit1.setText(String.valueOf(bext));
        String[] str9 = new String[5];
        str9[0] = "Referee";
        str9[1] = round.getText();
        str9[2] = lbltimer.getText();
        str9[3] = "KD Blue, Removed";
        str9[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str9);
        btm.fireTableDataChanged();

    }
}
