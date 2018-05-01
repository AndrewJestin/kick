package additional;


import java.awt.*;

import static main.adminscreen.*;
import static main.mainscreen.*;


public class labelcolor {


    public void colorL(int ab, int ar) {



        if (ab < ar){
            rglobal1=1;
            bglobal1=0;

        }
        if (ab > ar){
            bglobal1=1;
            rglobal1=0;


        }
        if (ab == ar){
            bglobal1=0;
            rglobal1=0;


        }

        if (bglobal1+bglobal2+bglobal3 == 0) {
            bglobal = 0;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (bglobal1+bglobal2+bglobal3 == 1){

            bglobal = 1;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}
        if (bglobal1+bglobal2+bglobal3+bglobal4 == 2){

            bglobal = 2;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}
        if (bglobal1+bglobal2+bglobal3 == 3){

            bglobal = 3;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}



        if (rglobal1+rglobal2+rglobal3 == 0) {
            rglobal = 0;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3 == 2) {
            rglobal = 2;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3+rglobal4 == 3) {
            rglobal = 3;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}


        if (rglobal1+rglobal2+rglobal3 == 1) {
            rglobal = 1;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal<bglobal){

            leader.setBackground(Color.blue);
            leader.setForeground(Color.white);
            leader.setText("LEADER");
            leader2.setBackground(Color.blue);
            leader2.setForeground(Color.white);
            leader2.setText("LEADER");
            if (round.getText().equals("FINISHED")){
                leader.setText("WINNER");
                leader2.setText("WINNER");

            }
        }
        else  if (rglobal>bglobal)
        { leader.setBackground(Color.red);
            leader.setForeground(Color.white);
            leader.setText("LEADER");
            leader2.setBackground(Color.red);
            leader2.setForeground(Color.white);
            leader2.setText("LEADER");
            if (round.getText().equals("FINISHED")){
                leader.setText("WINNER");
                leader2.setText("WINNER");

            }
        }
        else { leader.setBackground(Color.BLACK);
            leader.setForeground(Color.WHITE);
            leader.setText("DRAW");
            leader2.setBackground(Color.white);
            leader2.setForeground(Color.black);
            leader2.setText("DRAW");
        }



    }

}
