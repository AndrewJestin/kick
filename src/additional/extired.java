package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class extired implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        rext++;
        rexit11 = rext;
        int penalty = 1;

        if (rexit11 ==1){

            amountb+=penalty;
            ab = amountb;
            // System.out.println(ar);
            bs11.setText(String.valueOf(amountb));
            bs1.setText(String.valueOf(amountb));
            amountb2+=penalty;
            ab2 = amountb2;
            //   System.out.println(ar2);
            bs22.setText(String.valueOf(amountb2));
            bs2.setText(String.valueOf(amountb2));
            amountb3+=penalty;
            ab3 = amountb3;
            //    System.out.println(ar3);
            bs33.setText(String.valueOf(amountb3));
            bs3.setText(String.valueOf(amountb3));


        }
        if (rexit11 ==2){

            amountb+=penalty;
            ab = amountb;
            //  System.out.println(ar);
            bs11.setText(String.valueOf(amountb));
            bs1.setText(String.valueOf(amountb));
            amountb2+=penalty;
            ab2 = amountb2;
            //   System.out.println(ar2);
            bs22.setText(String.valueOf(amountb2));
            bs2.setText(String.valueOf(amountb2));
            amountb3+=penalty;
            ab3 = amountb3;
            //   System.out.println(ar3);
            bs33.setText(String.valueOf(amountb3));
            bs3.setText(String.valueOf(amountb3));

        }
        if (rexit11 ==3){

            amountb+=penalty;
            ab = amountb;
            System.out.println(ar);
            bs11.setText(String.valueOf(amountb));
            bs1.setText(String.valueOf(amountb));
            amountb2+=penalty;
            ab2 = amountb2;
            System.out.println(ar2);
            bs22.setText(String.valueOf(amountb2));
            bs2.setText(String.valueOf(amountb2));
            amountb3+=penalty;
            ab3 = amountb3;
            System.out.println(ar3);
            bs33.setText(String.valueOf(amountb3));
            bs3.setText(String.valueOf(amountb3));

        }
        if (rexit11 ==4){
            rext =3;

        }

        labelcolor5 a = new labelcolor5();
        a.colorL(ab, ar);
        //  System.out.println(rpenal);
        rexit1.setText(String.valueOf(rext));
        rexit.setText(String.valueOf(rext));

        String[] str7 = new String[5];
        str7[0] = "Referee";
        str7[1] = round.getText();
        str7[2] = lbltimer.getText();
        str7[3] = " KD  Red";
        str7[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str7);
        btm.fireTableDataChanged();
    }
}