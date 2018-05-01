package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class warningred implements ActionListener {



    public void actionPerformed(ActionEvent e) {

        rwarning++;

        rwarnings.setText(String.valueOf(rwarning));
        rwarnings1.setText(String.valueOf(rwarning));


        String[] str1 = new String[5];
        str1[0] = "Referee";
        str1[1] = round.getText();
        str1[2] = lbltimer.getText();
        str1[3] = " Warning Red";
        str1[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str1);
        btm.fireTableDataChanged();

    }
}
