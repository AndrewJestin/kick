package main;

import javax.swing.*;
import java.awt.*;

import static main.adminscreen.*;

    /**
     * Created by Andrew on 24.02.2017.
     */

    public class mainscreen {
        public static JLabel lblcategory = new JLabel("ADULT MALE -64kg.");
        public static JLabel lblmatch = new JLabel("FIGHT No.");
        public static JLabel leader = new JLabel("DRAW");
        public static JLabel lblMatchNo = new JLabel(lblMatchNo1.getText());
        public static JLabel rpenalty = new JLabel("0");
        public static JLabel bpenalty = new JLabel("0");
        public static JLabel bexit = new JLabel("0");
        public static JLabel rexit = new JLabel("0");

        public static JLabel rs1 = new JLabel("0");
        public static JLabel bs1 = new JLabel("0");
        public static JLabel rs2 = new JLabel("0");
        public static JLabel bs2 = new JLabel("0");
        public static JLabel rs3 = new JLabel("0");
        public static JLabel bs3 = new JLabel("0");
        public static JLabel rs4 = new JLabel("0");
        public static JLabel bs4 = new JLabel("0");
        public static JLabel rcompetitor = new JLabel("Red");
        public static JLabel bcompetitor = new JLabel("Blue");


        public static JLabel kickred1 = new JLabel("");
        public static JLabel kickred2 = new JLabel("");
        public static JLabel kickblue1 = new JLabel("");
        public static JLabel kickblue2 = new JLabel("");
        public static JLabel btotal = new JLabel("0");

        public static JLabel rwarnings = new JLabel("0");
        public static JLabel bwarnings = new JLabel("0");
        public static JLabel rtotal = new JLabel("0");
        public static JLabel round = new JLabel("ROUND : "+rndnum);
        public static JLabel lbltimer1 = new JLabel("00:00");
        // public static JLabel lblkicks2 = new JLabel("Compulsory techniques ");
        //gamepad



        public JPanel createContentPane() {


            JPanel totalGUI = new JPanel();
            totalGUI.setLayout(null);


//        lblkicks2.setLocation(530, 410);
//        lblkicks2.setSize(250, 20);
//        lblkicks2.setForeground(Color.black);
//        lblkicks2.setFont(new Font("Arial", Font.BOLD, 20));
//        lblkicks2.setVisible(false);
//        totalGUI.add(lblkicks2);
// категория
            lblcategory.setLocation(400, 5);
            lblcategory.setSize(480, 60);
            lblcategory.setForeground(Color.white);
            lblcategory.setBackground(Color.black);
            lblcategory.setVerticalAlignment(0);
            lblcategory.setHorizontalAlignment(0);
            lblcategory.setFont(new Font("Arial", Font.BOLD, 40));
            //  lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            // timer.setBackground(Color.yellow);
            lblcategory.setOpaque(true);
           // totalGUI.add(lblcategory);
// номер боя (надпись)
            lblmatch.setLocation(400, 5);
            lblmatch.setSize(300, 60);
            lblmatch.setHorizontalAlignment(SwingConstants.RIGHT);
            lblmatch.setForeground(Color.white);
            lblmatch.setVerticalAlignment(0);
            lblmatch.setBackground(Color.black);
            lblmatch.setFont(new Font("Arial", Font.BOLD, 40));
            // lblmatch.setBorder(BorderFactory.createLineBorder(Color.black,5));
            lblmatch.setOpaque(true);
            totalGUI.add(lblmatch);
// номер боя


            lblMatchNo.setLocation(710, 5);
            lblMatchNo.setSize(270, 60);
            lblMatchNo.setHorizontalAlignment(SwingConstants.LEFT);
            lblMatchNo.setVerticalAlignment(0);
            lblMatchNo.setFont(new Font("Arial", Font.BOLD, 40));
            lblMatchNo.setForeground(Color.white);
           // lblMatchNo.setBorder(BorderFactory.createLineBorder(Color.white,5));
            lblMatchNo.setBackground(Color.black);
            lblMatchNo.setOpaque(true);
           totalGUI.add(lblMatchNo);
//      таймер

            lbltimer1.setLocation(440, 210);
            lbltimer1.setSize(400, 120);
            lbltimer1.setHorizontalAlignment(0);
            lbltimer1.setVerticalAlignment(0);
            lbltimer1.setFont(new Font("Arial", Font.BOLD, 135));
            lbltimer1.setForeground(Color.white);
            lbltimer1.setBackground(Color.black);
            lbltimer1.setOpaque(true);
            totalGUI.add(lbltimer1);
//   кто побеждает

            leader.setLocation(400, 210);
            leader.setSize(480, 140);
            leader.setHorizontalAlignment(0);
            leader.setFont(new Font("Arial",Font.BOLD,70));
            leader.setBackground(Color.black);
            leader.setOpaque(true);
            leader.setBorder(BorderFactory.createLineBorder(Color.white,3));
            leader.setForeground(Color.white);
         //   totalGUI.add(leader);



            JLabel lblUmpire1 = new JLabel("Judge 1");
            lblUmpire1.setLocation(550, 420);
            lblUmpire1.setSize(150, 45);
            lblUmpire1.setHorizontalAlignment(0);
            lblUmpire1.setFont(new Font("Arial",Font.BOLD,30));
            lblUmpire1.setBackground(Color.black);
            lblUmpire1.setOpaque(true);
          //  lblUmpire1.setBorder(BorderFactory.createLineBorder(Color.white));
            lblUmpire1.setForeground(Color.white);
            totalGUI.add(lblUmpire1);

            JLabel lblUmpire2 = new JLabel("Judge 2");
            lblUmpire2.setLocation(705, 420);
            lblUmpire2.setSize(150, 45);
            lblUmpire2.setHorizontalAlignment(0);
            lblUmpire2.setFont(new Font("Arial",Font.BOLD,30));
            lblUmpire2.setBackground(Color.black);
            lblUmpire2.setOpaque(true);
            //  lblUmpire1.setBorder(BorderFactory.createLineBorder(Color.white));
            lblUmpire2.setForeground(Color.white);
            totalGUI.add(lblUmpire2);

            JLabel lblUmpire3 = new JLabel("Judge 3");
            lblUmpire3.setLocation(860, 420);
            lblUmpire3.setSize(150, 45);
            lblUmpire3.setHorizontalAlignment(0);
            lblUmpire3.setFont(new Font("Arial",Font.BOLD,30));
            lblUmpire3.setBackground(Color.black);
            lblUmpire3.setOpaque(true);
            //  lblUmpire1.setBorder(BorderFactory.createLineBorder(Color.white));
            lblUmpire3.setForeground(Color.white);
            totalGUI.add(lblUmpire3);


          //  bboxcountry2.setBorder(BorderFactory.createLineBorder(Color.white));




// номер раунда
            round.setLocation(480, 100);
            round.setSize(370, 70);
            round.setHorizontalAlignment(2);
            round.setFont(new Font("Arial",Font.BOLD,60));
            round.setBackground(Color.black);
            round.setOpaque(true);
            round.setForeground(Color.white);
            totalGUI.add(round);

            //  судья 1


            rs1.setLocation(550, 470);
            rs1.setSize(157, 100);
            rs1.setHorizontalAlignment(0);
            rs1.setFont(new Font("Arial",Font.BOLD,100));
            rs1.setForeground(Color.white);
            rs1.setBackground(Color.red);
            rs1.setBorder(BorderFactory.createLineBorder(Color.white,2));

            rs1.setOpaque(true);

            totalGUI.add(rs1);

            bs1.setLocation(550, 575);
            bs1.setSize(157, 100);
            bs1.setHorizontalAlignment(0);
            bs1.setForeground(Color.white);
            bs1.setBackground(Color.blue);
            bs1.setBorder(BorderFactory.createLineBorder(Color.white,2));
            bs1.setFont(new Font("Arial",Font.BOLD,100));
            bs1.setOpaque(true);

            totalGUI.add(bs1);

            //  судья 2

            rs2.setLocation(705, 470);
            rs2.setSize(157, 100);
            rs2.setHorizontalAlignment(0);
            rs2.setForeground(Color.white);
            rs2.setBackground(Color.red);
            rs2.setBorder(BorderFactory.createLineBorder(Color.white,2));
            rs2.setFont(new Font("Arial",Font.BOLD,100));
            rs2.setOpaque(true);


            totalGUI.add(rs2);

            bs2.setLocation(705, 575);
            bs2.setSize(157, 100);
            bs2.setHorizontalAlignment(0);
            bs2.setForeground(Color.white);
            bs2.setBackground(Color.blue);
            bs2.setBorder(BorderFactory.createLineBorder(Color.white,2));
            bs2.setFont(new Font("Arial",Font.BOLD,100));
            bs2.setOpaque(true);

            totalGUI.add(bs2);


            //судья 3
            rs3.setLocation(860, 470);
            rs3.setSize(157, 100);
            rs3.setHorizontalAlignment(0);
            rs3.setForeground(Color.white);
            rs3.setBackground(Color.red);
            rs3.setBorder(BorderFactory.createLineBorder(Color.white,2));
            rs3.setFont(new Font("Arial",Font.BOLD,100));
            rs3.setOpaque(true);


            totalGUI.add(rs3);

            bs3.setLocation(860, 575);
            bs3.setSize(157, 100);
            bs3.setHorizontalAlignment(0);
            bs3.setForeground(Color.white);
            bs3.setBackground(Color.blue);
            bs3.setBorder(BorderFactory.createLineBorder(Color.white,2));
            bs3.setFont(new Font("Arial",Font.BOLD,100));
            bs3.setOpaque(true);

            totalGUI.add(bs3);


            //участники 1 и 2
            rcompetitor.setLocation(15, 470);
            rcompetitor.setSize(537, 100);
            rcompetitor.setHorizontalAlignment(0);
            rcompetitor.setForeground(Color.white);
            rcompetitor.setBackground(Color.red);
            rcompetitor.setBorder(BorderFactory.createLineBorder(Color.white,2));
            rcompetitor.setFont(new Font("Arial",Font.BOLD,50));
            rcompetitor.setOpaque(true);

         totalGUI.add(rcompetitor);

            bcompetitor.setLocation(15, 575);
            bcompetitor.setSize(537, 100);
            bcompetitor.setHorizontalAlignment(0);
            bcompetitor.setForeground(Color.white);
            bcompetitor.setBackground(Color.blue);
            bcompetitor.setBorder(BorderFactory.createLineBorder(Color.white,2));
            bcompetitor.setFont(new Font("Arial",Font.BOLD,50));
            bcompetitor.setOpaque(true);

          totalGUI.add(bcompetitor);




            // общие очки
            btotal.setLocation(1010, 10);
            btotal.setSize(260, 390);
            btotal.setHorizontalAlignment(0);
            btotal.setFont(new Font("Arial",Font.BOLD,280));
            btotal.setForeground(Color.white);
            btotal.setBackground(Color.blue);
            btotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            btotal.setOpaque(true);

            totalGUI.add(btotal);
            rtotal.setLocation(15, 10);
            rtotal.setSize(260, 390);
            rtotal.setHorizontalAlignment(0);
            rtotal.setForeground(Color.white);
            rtotal.setBackground(Color.red);
            rtotal.setFont(new Font("Arial",Font.BOLD,280));
            rtotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rtotal.setOpaque(true);
            totalGUI.add(rtotal);
// штрафы

            rpenalty.setLocation(1040, 470);
            rpenalty.setSize(75, 100);
            rpenalty.setHorizontalAlignment(0);
            rpenalty.setBackground(Color.red);
            rpenalty.setOpaque(true);
            rpenalty.setForeground(Color.white);
            rpenalty.setBorder(BorderFactory.createLineBorder(Color.white,2));
            rpenalty.setFont(new Font("Arial",Font.BOLD,100));

            totalGUI.add(rpenalty);

         //   JLabel rexit = new JLabel();
            rexit.setLocation(1184, 470);
            rexit.setSize(75, 100);
            rexit.setHorizontalAlignment(0);
            rexit.setBackground(Color.red);
            rexit.setOpaque(true);
            rexit.setForeground(Color.white);
            rexit.setBorder(BorderFactory.createLineBorder(Color.white,2));
            rexit.setFont(new Font("Arial",Font.BOLD,100));

            totalGUI.add(rexit);

          //  JLabel dexit = new JLabel();
            bexit.setLocation(1184, 575);
            bexit.setSize(75, 100);
            bexit.setHorizontalAlignment(0);
            bexit.setBackground(Color.blue);
            bexit.setOpaque(true);
            bexit.setForeground(Color.white);
            bexit.setBorder(BorderFactory.createLineBorder(Color.white,2));
            bexit.setFont(new Font("Arial",Font.BOLD,100));

            totalGUI.add(bexit);

//JLabel lblrpenalty = new JLabel("-1");
//            lblrpenalty.setLocation(15, 10);
//            lblrpenalty.setSize(118, 50);
//            lblrpenalty.setHorizontalAlignment(0);
//            lblrpenalty.setBackground(Color.yellow);
//            lblrpenalty.setOpaque(true);
//            lblrpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
//            lblrpenalty.setFont(new Font("Arial",Font.BOLD,50));

           // totalGUI.add(lblrpenalty);



            bpenalty.setLocation(1040, 575);
            bpenalty.setSize(75, 100);
            bpenalty.setHorizontalAlignment(0);
            bpenalty.setBackground(Color.blue);
            bpenalty.setForeground(Color.white);
            bpenalty.setOpaque(true);
            bpenalty.setBorder(BorderFactory.createLineBorder(Color.white,2));
            bpenalty.setFont(new Font("Arial",Font.BOLD,100));
            totalGUI.add(bpenalty);

            JLabel lblbpenalty = new JLabel("EX");
            lblbpenalty.setLocation(1180, 420);
            lblbpenalty.setSize(80, 45);
            lblbpenalty.setHorizontalAlignment(0);
          lblbpenalty.setBackground(Color.black);
            lblbpenalty.setForeground(Color.white);
            lblbpenalty.setOpaque(true);
            //lblbpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
            lblbpenalty.setFont(new Font("Arial",Font.BOLD,30));

            totalGUI.add(lblbpenalty);

//  предупреждения

            rwarnings.setLocation(1112, 470);
            rwarnings.setSize(75, 100);
            rwarnings.setHorizontalAlignment(0);
            rwarnings.setForeground(Color.white);
            rwarnings.setBackground(Color.red);
            rwarnings.setOpaque(true);
            rwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rwarnings.setFont(new Font("Arial",Font.BOLD,100));

            totalGUI.add(rwarnings);

            JLabel lblrwarnings = new JLabel("MP");
            lblrwarnings.setLocation(1040, 420);
            lblrwarnings.setSize(80, 45);
            lblrwarnings.setHorizontalAlignment(0);
            lblrwarnings.setForeground(Color.white);
            lblrwarnings.setBackground(Color.black);
            lblrwarnings.setOpaque(true);
           // lblrwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            lblrwarnings.setFont(new Font("Arial",Font.BOLD,30));

            totalGUI.add(lblrwarnings);

            JLabel lblexit = new JLabel("W");
            lblexit.setLocation(1110, 420);
            lblexit.setSize(80, 45);
            lblexit.setHorizontalAlignment(0);
            lblexit.setForeground(Color.white);
            lblexit.setBackground(Color.black);
            lblexit.setOpaque(true);
            // lblrwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            lblexit.setFont(new Font("Arial",Font.BOLD,30));

            totalGUI.add(lblexit);


            bwarnings.setLocation(1112, 575);
            bwarnings.setSize(75, 100);
            bwarnings.setHorizontalAlignment(0);
            bwarnings.setForeground(Color.white);
            bwarnings.setBackground(Color.blue);
            bwarnings.setOpaque(true);
            bwarnings.setFont(new Font("Arial",Font.BOLD,100));
            bwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            totalGUI.add(bwarnings);

//            JLabel lblbwarnings = new JLabel("!");
//            lblbwarnings.setLocation(1147, 200);
//            lblbwarnings.setSize(118, 50);
//            lblbwarnings.setHorizontalAlignment(0);
//            lblbwarnings.setForeground(Color.black);
//            lblbwarnings.setBackground(Color.lightGray);
//            lblbwarnings.setOpaque(true);
//            lblbwarnings.setFont(new Font("Arial",Font.BOLD,50));
//            lblbwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
//            totalGUI.add(lblbwarnings);

//  зачеты



            totalGUI.setOpaque(true);


            return totalGUI;





        }

    }






