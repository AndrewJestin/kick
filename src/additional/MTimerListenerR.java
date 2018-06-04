
package additional;


        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import static main.adminscreen.*;
        import static main.mainscreen.*;


public class MTimerListenerR implements ActionListener {




    //    int min =0;
    public void actionPerformed(ActionEvent event) {
        if (br == 60) {
            br = 59;
        }
        MedicCountR--;
      //  brkcount--;

        lblmedtimerr.setText("0" + MedicMinR + ":0" + MedicCountR);
      //  lbltimer1.setText("0" + min + ":0" + count);

//        if (brk == 0) {
//            lblmedtimerr.setForeground(Color.white);
//        }
//        if (brk == 1) {
//            lblmedtimerr.setForeground(Color.yellow);
//        }


        if (MedicCountR == -1 && MedicMinR != 0 && brk == 0) {
            // lbltimer.setText("0" + min + ":000" + tmaxsec);
            MedicCountR = 59;
            MedicMinR--;

        }
        if (MedicCountR < 10 && brk == 0) {


            lblmedtimerr.setText("0" + MedicMinR + ":0" + MedicCountR);


        }
        if (MedicCountR > 9 && brk == 0) {

            lblmedtimerr.setText("0" + MedicMinR + ":" + MedicCountR);


        }
        if (MedicMinR == 0 && MedicCountR == 0) {
           // sound.playSound("sounds/start2s.wav");
            MtimerR.stop();
        }

        if (MedicMinR == 0 && MedicCountR < 0) {
            lblmedtimerr.setText("00:00");
            MtimerR.stop();
            }
//
//            if (MedicCountR > 9 && brk == 0) {
//                lblmedtimerr.setText("0" + MedicMinR + ":" + MedicCountR);
//
//            }
//
//
//        }

//        if (brk == 1 && brkcount == -1) {
//            lblmedtimerr.setForeground(Color.white);
//         //   MedicCountR = tmaxsec;
//          //  min = tmaxmin;
//            sound.playSound("sounds/start2s.wav").join();
//            brk = 0;
//
//            if (MedicCountR < 10 && brk == 0) {
//                lblmedtimerr.setText("0" + MedicMinR + ":0" + MedicCountR);
//                System.out.println(MedicCountR);
//
//            }
//
//            if (MedicCountR > 9 && brk == 0) {
//               // lbltimer.setText("0" + min + ":" + count);
//                lblmedtimerr.setText("0" + MedicMinR + ":" + MedicCountR);
//
//
//            }


      //  }
    }
}
