package additional;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static additional.gamepad1.blastr;
import static additional.gamepad1.rlastr;
import static additional.gamepad2.blastr2;
import static additional.gamepad2.rlastr2;
import static additional.gamepad3.blastr3;
import static additional.gamepad3.rlastr3;
import static main.adminscreen.*;
import static main.mainscreen.*;


public class TimerListener implements ActionListener {




    //    int min =0;
    public void actionPerformed(ActionEvent event) {
        if (br == 60) {
            br = 59;
        }
        count--;
        brkcount--;

        lbltimer.setText("0" + min + ":0" + count);
        lbltimer1.setText("0" + min + ":0" + count);

        if (brk == 0) {
            lbltimer1.setForeground(Color.white);
        }
        if (brk == 1) {
            lbltimer1.setForeground(Color.yellow);
        }


        if (count == -1 && min != 0 && brk == 0) {
            // lbltimer.setText("0" + min + ":000" + tmaxsec);
            count = 59;
            min--;
            round1.setText("" + rndnum);
            round.setText("ROUND : " + rndnum);

            //  lbltimer.setText("0" + min + ":0" + tmaxsec);
            //  lbltimer1.setText("0" + min + ":0" + tmaxsec);

        }
        if (count < 10 && brk == 0) {
            round1.setText("" + rndnum);
            round.setText("ROUND : " + rndnum);
            lbltimer.setText("0" + min + ":0" + count);
            lbltimer1.setText("0" + min + ":0" + count);


        }
        if (count > 9 && brk == 0) {
            round1.setText("" + rndnum);
            round.setText("ROUND : " + rndnum);
            lbltimer.setText("0" + min + ":" + count);
            lbltimer1.setText("0" + min + ":" + count);


        }
        if (min == 0 && count == 0) {
            sound.playSound("sounds/start2s.wav");
        }

        if (min == 0 && count == -1) {
           // sound.playSound("sounds/start2s.wav");
            brkcount = br;
            // min = 0;
            brk = 1;
            lbltimer1.setForeground(Color.yellow);
            round1.setText("--");
            round.setText("   BREAK");

            if (ab==ar&&rlastr>blastr) {
                amount++;
                ar = amount;
                rs11.setText(String.valueOf(amount));
                rs1.setText(String.valueOf(amount));
                labelcolor a = new labelcolor();
                a.colorL(ab, ar);
            }
            if (ab==ar&&rlastr<blastr) {
                amountb++;
                ab = amountb;
                bs11.setText(String.valueOf(amountb));
                bs1.setText(String.valueOf(amountb));
                labelcolor a = new labelcolor();
                a.colorL(ab, ar);
            }
            if (ab2==ar2&&rlastr2>blastr2) {
                amount2++;
                ar2 = amount2;
                rs2.setText(String.valueOf(amount2));
                rs22.setText(String.valueOf(amount2));
                labelcolor2 c = new labelcolor2();
                c.colorL(ab2, ar2);
            }
            if (ab2==ar2&&rlastr2<blastr2) {
                amountb2++;
                ab2 = amountb2;
                bs2.setText(String.valueOf(amountb2));
                bs22.setText(String.valueOf(amountb2));
                labelcolor2 d = new labelcolor2();
                d.colorL(ab2, ar2);
            }
            if (ab3==ar3&&rlastr3>blastr3) {
                amount3++;
                ar3 = amount3;
                rs3.setText(String.valueOf(amount3));
                rs33.setText(String.valueOf(amount3));
                labelcolor3 as = new labelcolor3();
                as.colorL(ab3, ar3);
            }
            if (ab3==ar3&&rlastr3<blastr3) {
                amountb3++;
                ab3 = amountb3;
                bs3.setText(String.valueOf(amountb3));
                bs33.setText(String.valueOf(amountb3));
                labelcolor3 zx = new labelcolor3();
                zx.colorL(ab3, ar3);
            }



            if (count < 10 && brk == 0) {
                lbltimer.setText("0" + min + ":0" + count);
                lbltimer1.setText("0" + min + ":0" + count);
                //        sound.playSound("sounds/start2s.wav").join();
            }

            if (count > 9 && brk == 0) {
                lbltimer.setText("0" + min + ":" + count);
                lbltimer1.setText("0" + min + ":" + count);

            }


            if (rndnum == tmaxround) {
                // round1.setText("Finished");
                round.setText("  FINISHED");
                lbltimer.setText("TIME!");
                lbltimer1.setText("TIME!");



                if ((leader.getText().equals("LEADER"))) {
                    leader.setText("WINNER");
                    leader2.setText("WINNER");
                } else {
                    leader.setText("DRAW");
                    leader2.setText("DRAW");
                }
                // leader.setText("WINNER");
                timer.stop();
            }


        }


        if (round.getText().equals("   BREAK") && brkcount < 10) {
            round1.setText("--");
            round.setText("   BREAK");
            lbltimer.setText("0" + min + ":0" + brkcount);
            lbltimer1.setText("0" + min + ":0" + brkcount);


        }
        if (round.getText().equals("   BREAK") && brkcount > 9) {
            round1.setText("--");
            round.setText("   BREAK");
            lbltimer.setText("0" + min + ":" + brkcount);
            lbltimer1.setText("0" + min + ":" + brkcount);


        }


        if (brk == 1 && brkcount == -1) {
            lbltimer1.setForeground(Color.white);

            count = tmaxsec;
            min = tmaxmin;
            rndnum++;
            round1.setText(rndnum + "");
            round.setText("ROUND : " + rndnum);


            sound.playSound("sounds/start2s.wav").join();
            brk = 0;

            if (count < 10 && brk == 0) {
                lbltimer.setText("0" + min + ":0" + count);
                lbltimer1.setText("0" + min + ":0" + count);
                System.out.println(count);

            }

            if (count > 9 && brk == 0) {
                lbltimer.setText("0" + min + ":" + count);
                lbltimer1.setText("0" + min + ":" + count);


            }


        }
    }
}