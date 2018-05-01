package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static TestAction.TimerListener.brkcount;
import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class waringblue implements ActionListener {



    public void actionPerformed(ActionEvent e) {

        bwarning++;
        wb = bwarning;




        String[] str3 = new String[5];
        str3[0] = "Referee";
        str3[1] = round.getText();
        str3[2] = lbltimer.getText();
        str3[3] = " Warning Blue";
        str3[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str3);
        btm.fireTableDataChanged();



        bwarnings.setText(String.valueOf(bwarning));
        bwarnings1.setText(String.valueOf(bwarning));
    }
}
