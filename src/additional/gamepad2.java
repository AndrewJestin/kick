package additional;

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.*;
import static main.mainscreen.*;

/**
 * Created by Andrew on 28.11.2017.
 */
public class gamepad2 {
    public static int rlastr2 = 0;
    public static int blastr2 = 0;
    public gamepad2() {

//
        controller2.poll();

        while (Controllers.next()) {

            if (controller2.isButtonPressed(3)) {

                amount2++;
                ar2 = amount2;


                // System.out.println(amount);
                rs2.setText(String.valueOf(amount2));
                rs22.setText(String.valueOf(amount2));

                labelcolor2 c = new labelcolor2();
                c.colorL(ab2, ar2);
                majority2 m2 = new majority2();
                m2.majority2(ar2,ab2);

                String[] str14 = new String[5];
                str14[0] = boxUmpire22.getText();
                str14[1] = round.getText();
                str14[2] = lbltimer.getText();
                str14[3] = "1 point Red";
                str14[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                btm.addDate(str14);
                btm.fireTableDataChanged();

                if (rndnum==tmaxround) {
                    rlastr2++;
                    System.out.println("RED2 заработал в последнем раунде "+rlastr2);
                }
            }


          if (controller2.isButtonPressed(1)) {
                amountb2++;

                    ab2 = amountb2;


                    bs2.setText(String.valueOf(amountb2));
                    bs22.setText(String.valueOf(amountb2));

                    labelcolor2 d = new labelcolor2();
                    d.colorL(ab2, ar2);
              majority2 m2 = new majority2();
              m2.majority2(ar2,ab2);
                    String[] str11 = new String[5];
                    str11[0] = boxUmpire22.getText();
                    str11[1] = round.getText();
                    str11[2] = lbltimer.getText();
                    str11[3] = "1 point Blue";
                    str11[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                    btm.addDate(str11);
                    btm.fireTableDataChanged();

              if (rndnum==tmaxround) {
                  blastr2++;
                  System.out.println(" BLUE2 заработал в последнем раунде "+blastr2);
              }
            }

        }
    }

}