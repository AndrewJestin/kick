package additional;

import java.awt.*;

import static main.adminscreen.*;

/**
 * Created by Andrew on 28.11.2017.
 */
public class majority2 {

    public void majority2(int a,int b)
{
    if (amount2>amountb2&&(amount2-amountb2)>=15) {
        m2.setBackground(Color.RED);
        System.out.println("15  o4kov priemus4estva u krasnogo");
    }
    else if (amount2<amountb2&&(amountb2-amount2)>=15) {
        m2.setBackground(Color.BLUE);
        System.out.println("15  o4kov priemus4estva u sinego");
    }
    else {
        m2.setBackground(Color.white);
    }
}
}