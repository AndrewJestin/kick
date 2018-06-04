package additional;

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainform.controller3;
import static main.mainscreen.*;

/**
 * Created by Andrew on 28.11.2017.
 */
public class gamepad3 {
    public static int rlastr3 = 0;
    public static int blastr3 = 0;
    public gamepad3() {

//
        controller3.poll();

        while (Controllers.next()) {

            if (controller3.isButtonPressed(3)) {

                amount3++;
                ar3 = amount3;
                rs3.setText(String.valueOf(amount3));
                rs33.setText(String.valueOf(amount3));
                labelcolor3 as = new labelcolor3();
                as.colorL(ab3, ar3);
                majority3 m3 = new majority3();
                m3.majority3(ar3,ab3);
                String[] str15 = new String[5];
              //  str15[0] = boxUmpire32.getText();
                str15[1] = round.getText();
                str15[2] = lbltimer.getText();
                str15[3] = "1 point Red";
                str15[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                btm.addDate(str15);
                btm.fireTableDataChanged();

                if (rndnum==tmaxround) {
                    rlastr3++;
                    System.out.println("RED3 заработал в последнем раунде "+rlastr3);
                }
            }


        if (controller3.isButtonPressed(1)) {
            amountb3++;

            ab3 = amountb3;


            bs3.setText(String.valueOf(amountb3));
            bs33.setText(String.valueOf(amountb3));

            labelcolor3 zx = new labelcolor3();
            zx.colorL(ab3, ar3);
            majority3 m3 = new majority3();
            m3.majority3(ar3,ab3);
            String[] str12 = new String[5];
            //str12[0] = boxUmpire32.getText();
            str12[1] = round.getText();
            str12[2] = lbltimer.getText();
            str12[3] = "1 point Blue";
            str12[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
            btm.addDate(str12);
            btm.fireTableDataChanged();
                if (rndnum==tmaxround) {
                    blastr3++;
                    System.out.println(" BLUE3 заработал в последнем раунде "+blastr3);
                }

        }

    }
}

}