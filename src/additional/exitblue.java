package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class exitblue implements ActionListener {


    public void actionPerformed(ActionEvent e) {


        bext++;
        bexit11 = bext;

        System.out.println(round.getText()+". Время - "+min+":"+count+" Камджон синему (-1 балл)");

        if (bexit11 ==1){
            // bpenalty.setBackground(Color.yellow);
            //    bpenalty.setBorder(BorderFactory.createLineBorder(Color.black));
            amount++;

            ar = amount;
            // System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));

            amount2++;
            ar2 = amount2;
            // System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3++;

            ar3 = amount3;
            // System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bexit11 ==2){

            amount++;
            ar = amount;
            // System.out.println(ab);
            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2++;
            ar2 = amount2;
            // System.out.println(ab2);
            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3++;
            ar3 = amount3;
            // System.out.println(ab3);
            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }
        if (bexit11 ==3){

            amount++;
            ar = amount;

            rs11.setText(String.valueOf(amount));
            rs1.setText(String.valueOf(amount));
            amount2++;
            ar2 = amount2;

            rs22.setText(String.valueOf(amount2));
            rs2.setText(String.valueOf(amount2));
            amount3++;
            ar3 = amount3;

            rs33.setText(String.valueOf(amount3));
            rs3.setText(String.valueOf(amount3));

        }

        if (bexit11 == 4){
            bext=3;
        }

        labelcolor5 a = new labelcolor5();
        a.colorL(ab, ar);
        //   System.out.println(bpenal);
        bexit.setText(String.valueOf(bext));
        bexit1.setText(String.valueOf(bext));

        String[] str8 = new String[5];
        str8[0] = "Referee";
        str8[1] = round.getText();
        str8[2] = lbltimer.getText();
        str8[3] = " KD Blue";
        str8[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str8);
        btm.fireTableDataChanged();

    }

}