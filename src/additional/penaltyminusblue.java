package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyminusblue implements ActionListener  {


    public void actionPerformed(ActionEvent e) {

        bpen--;
        bpenal = bpen;
        int penalty = 3;

        System.out.println(round.getText()+". Время - "+min+":"+count+" Камджон синему снят обратно(-1 балл)");

        if (bpenal ==0) {

            amount-=penalty;
            ar = amount;
          //  System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2-=penalty;
            ar2 = amount2;
          //  System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3-=penalty;
            ar3 = amount3;
         //   System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bpenal ==1){

            amount-=penalty;
            ar = amount;
          //  System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2-=penalty;
            ar2 = amount2;
         //   System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3-=penalty;
            ar3 = amount3;
          //  System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bpenal ==2){

            amount-=penalty;
            ar = amount;
          //  System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2-=penalty;
            ar2 = amount2;
         //   System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
         amount3-=penalty;
            ar3 = amount3;
          //  System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }

        if (bpenal<0) {
            bpen=0;
        }

        labelcolor5 a = new labelcolor5();
        a.colorL(ab, ar);

       // System.out.println(bpenal);
        bpenalty11.setText(String.valueOf(bpen));
        bpenalty.setText(String.valueOf(bpen));
        String[] str9 = new String[5];
        str9[0] = "Referee";
        str9[1] = round.getText();
        str9[2] = lbltimer.getText();
        str9[3] = "Penalty Blue, Removed";
        str9[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str9);
        btm.fireTableDataChanged();

    }
}
