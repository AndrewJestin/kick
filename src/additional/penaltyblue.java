package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyblue implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        bpen++;
        bpenal = bpen;
int penalty = 3;
        System.out.println(round.getText()+". Время - "+min+":"+count+" Камджон синему (-1 балл)");

        if (bpenal ==1){
           // bpenalty.setBackground(Color.yellow);
        //    bpenalty.setBorder(BorderFactory.createLineBorder(Color.black));
            amount+=penalty;

            ar = amount;
           // System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));

            amount2+=penalty;
            ar2 = amount2;
           // System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3+=penalty;

            ar3 = amount3;
           // System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bpenal ==2){

            amount+=penalty;
            ar = amount;
            // System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2+=penalty;
            ar2 = amount2;
            // System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3+=penalty;
            ar3 = amount3;
            // System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bpenal ==3){

            amount+=penalty;
            ar = amount;

            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2+=penalty;
            ar2 = amount2;

            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3+=penalty;
            ar3 = amount3;

            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }

        if (bpenal == 4){
            bpen=3;
        }

        labelcolor5 a = new labelcolor5();
        a.colorL(ab, ar);
     //   System.out.println(bpenal);
        bpenalty11.setText(String.valueOf(bpen));
        bpenalty.setText(String.valueOf(bpen));

        String[] str8 = new String[5];
        str8[0] = "Referee";
        str8[1] = round.getText();
        str8[2] = lbltimer.getText();
        str8[3] = " Penalty(-3 points) Blue";
        str8[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str8);
        btm.fireTableDataChanged();

    }
}