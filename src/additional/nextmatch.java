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


public class nextmatch implements ActionListener {



    public void actionPerformed(ActionEvent b) {


        amount=0;
        amountb=0;
        ar=amount;
        ab=amountb;
        rs11.setText(String.valueOf(amount));
        bs11.setText(String.valueOf(amountb));
        rs1.setText(String.valueOf(amount));
        bs1.setText(String.valueOf(amountb));
        amount2=0;
        amountb2=0;
        ar2=amount2;
        ab2=amountb2;
        rs22.setText(String.valueOf(amount2));
        bs22.setText(String.valueOf(amountb2));
        rs2.setText(String.valueOf(amount2));
        bs2.setText(String.valueOf(amountb2));
        amount3=0;
        amountb3=0;
        ar3=amount3;
        ab3=amountb3;
        rs33.setText(String.valueOf(amount3));
        bs33.setText(String.valueOf(amountb3));
        rs3.setText(String.valueOf(amount3));
        bs3.setText(String.valueOf(amountb3));
        amount4=0;
        amountb4=0;
        ar4=amount4;
        ab4=amountb4;
        rs44.setText(String.valueOf(amount4));
        bs44.setText(String.valueOf(amountb4));
        rs4.setText(String.valueOf(amount4));
        bs4.setText(String.valueOf(amountb4));
        rwarning=0;
        bwarning=0;
        wr=rwarning;
        wb=bwarning;
        bwarnings.setText(String.valueOf(bwarning));
        bwarnings1.setText(String.valueOf(bwarning));
        rwarnings.setText(String.valueOf(rwarning));
        rwarnings1.setText(String.valueOf(rwarning));
        rpen=0;
        bpen=0;
        rpenalty11.setText(String.valueOf(rpen));
        bpenalty11.setText(String.valueOf(bpen));
        rpenalty.setText(String.valueOf(rpen));
        leader.setText(String.valueOf("DRAW"));
        leader2.setText(String.valueOf("DRAW"));

        bpenalty.setText(String.valueOf(bpen));

        bglobal=0;
        rglobal=0;
        bglobal1=0;
        rglobal1=0;
        bglobal2=0;
        rglobal2=0;
        bglobal3=0;
        rglobal3=0;
        bglobal4=0;
        rglobal4=0;
        btotal1.setText(String.valueOf(bglobal));
        btotal.setText(String.valueOf(bglobal));
        rtotal.setText(String.valueOf(rglobal));
        rtotal1.setText(String.valueOf(rglobal));
        leader.setBackground(Color.BLACK);
        leader.setForeground(Color.WHITE);
        leader2.setBackground(Color.white);
        leader2.setForeground(Color.black);
        round1.setText("1");
        round.setText("ROUND : 1");

        blastr = 0;
        blastr2 = 0;
        blastr3 = 0;
        rlastr = 0;
        rlastr2 = 0;
        rlastr3 = 0;

        matchno1++;
        lblMatchNo1.setText(String.valueOf(matchno1));
        lblMatchNo.setText(String.valueOf(matchno1));


    }

}
