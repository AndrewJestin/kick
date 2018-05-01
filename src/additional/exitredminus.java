package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class exitredminus implements ActionListener  {


    public void actionPerformed(ActionEvent e) {

        rext--;
        rexit11 = rext;
        int penalty = 1;

        if (rexit11 ==0){

            amountb-=penalty;
            ab = amountb;
            // System.out.println(ar);
            bs11.setText(String.valueOf(amountb));
            bs1.setText(String.valueOf(amountb));
            amountb2-=penalty;
            ab2 = amountb2;
            //   System.out.println(ar2);
            bs22.setText(String.valueOf(amountb2));
            bs2.setText(String.valueOf(amountb2));
            amountb3-=penalty;
            ab3 = amountb3;
            //  System.out.println(ar3);
            bs33.setText(String.valueOf(amountb3));
            bs3.setText(String.valueOf(amountb3));

        }
        if (rexit11 ==1){

            amountb-=penalty;
            ab = amountb;
            // System.out.println(ar);
            bs11.setText(String.valueOf(amountb));
            bs1.setText(String.valueOf(amountb));
            amountb2-=penalty;
            ab2 = amountb2;
            //   System.out.println(ar2);
            bs22.setText(String.valueOf(amountb2));
            bs2.setText(String.valueOf(amountb2));
            amountb3-=penalty;
            ab3 = amountb3;
            //  System.out.println(ar3);
            bs33.setText(String.valueOf(amountb3));
            bs3.setText(String.valueOf(amountb3));

        }
        if (rexit11 ==2){
            amountb-=penalty;
            ab = amountb;
            // System.out.println(ar);
            bs11.setText(String.valueOf(amountb));
            bs1.setText(String.valueOf(amountb));
            amountb2-=penalty;
            ab2 = amountb2;
            //   System.out.println(ar2);
            bs22.setText(String.valueOf(amountb2));
            bs2.setText(String.valueOf(amountb2));
            amountb3-=penalty;
            ab3 = amountb3;
            //  System.out.println(ar3);
            bs33.setText(String.valueOf(amountb3));
            bs3.setText(String.valueOf(amountb3));

        }
        if (rexit11 < 0){
            rext =0;
        }

        labelcolor5 a = new labelcolor5();
        a.colorL(ab, ar);
        // System.out.println(rpenal);
        rexit1.setText(String.valueOf(rext));
        rexit.setText(String.valueOf(rext));


        String[] str6 = new String[5];
        str6[0] = "Referee";
        str6[1] = round.getText();
        str6[2] = lbltimer.getText();
        str6[3] = " KD  Red,Removed";
        str6[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str6);
        btm.fireTableDataChanged();
    }
}
