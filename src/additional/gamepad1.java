package additional;

/**
 * Created by Andrew on 28.11.2017.
 **/

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainform.controller1;
import static main.mainscreen.*;

public class gamepad1 {

public static int rlastr = 0;
public static int blastr = 0;


    public gamepad1() {

//
        controller1.poll();

        while (Controllers.next()) {

            if (controller1.isButtonPressed(3)) {

                amount++;

                ar = amount;
              //  System.out.println("Судья: " + lblUmpire1.getText() + ", " + round.getText() + ". Время - " + min + ":" + count + "  прибавленно 1 очко красному");
                rs11.setText(String.valueOf(amount));
                rs1.setText(String.valueOf(amount));

                labelcolor a = new labelcolor();
                a.colorL(ab, ar);
                majority m1 = new majority();
                m1.majority(ar,ab);
                String[] str2 = new String[5];
                str2[0] = boxUmpire12.getText();
                str2[1] = round.getText();
                str2[2] = lbltimer.getText();
                str2[3] = "1 point Red";
                // str2[4] = "Red " +rtotal.getText()+":"+btotal.getText()+" Blue";
                str2[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                btm.addDate(str2);
                btm.fireTableDataChanged();


                if (rndnum==tmaxround) {
                    rlastr++;
                    System.out.println("RED заработал в последнем раунде "+rlastr);
                }


            } else if (controller1.isButtonPressed(1)) {
                amountb++;

                ab = amountb;


                bs11.setText(String.valueOf(amountb));
                bs1.setText(String.valueOf(amountb));

                labelcolor a = new labelcolor();
                a.colorL(ab, ar);
                majority m1 = new majority();
                m1.majority(ar,ab);
                String[] str = new String[5];
                str[0] = boxUmpire12.getText();
                str[1] = round.getText();
                str[2] = lbltimer.getText();
                str[3] = "1 point Blue";
                str[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                btm.addDate(str);
                btm.fireTableDataChanged();

                if (rndnum==tmaxround) {
                    blastr++;
                    System.out.println(" BLUE заработал в последнем раунде "+blastr);
                }

            }

        }
    }

}
