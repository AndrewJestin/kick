package additional;

import java.awt.*;

import static main.adminscreen.amount;
import static main.adminscreen.amountb;
import static main.adminscreen.m1;

/**
 * Created by Andrew on 28.11.2017.
 */
public class majority {
    public void majority(int a,int b)
    {
        if (amount>amountb&&(amount-amountb)>=15) {
            m1.setBackground(Color.RED);
            System.out.println("15  o4kov priemus4estva u krasnogo");
        }
       else if (amount<amountb&&(amountb-amount)>=15) {
            m1.setBackground(Color.BLUE);
            System.out.println("15  o4kov priemus4estva u sinego");
        }
        else {
            m1.setBackground(Color.white);
        }
    }
}
