package additional;

import java.awt.*;

import static main.adminscreen.*;

/**
 * Created by Andrew on 28.11.2017.
 */
public class majority3 {
    public void majority3(int a,int b)
{
    if (amount3>amountb3&&(amount3-amountb3)>=15) {
        m3.setBackground(Color.RED);
        System.out.println("15  o4kov priemus4estva u krasnogo");
    }
    else if (amount3<amountb3&&(amountb3-amount3)>=15) {
        m3.setBackground(Color.BLUE);
        System.out.println("15  o4kov priemus4estva u sinego");
    }
    else {
        m3.setBackground(Color.white);
    }
}
}