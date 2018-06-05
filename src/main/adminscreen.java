package main;

import additional.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.mainform.btm;
import static main.mainform.frame3;
import static main.mainscreen.*;

/**
 * Created by Daha on 24.04.2017.
 */
//import static additional.TimerListener.brkcount;


    /**
     * Created by Andrew on 24.02.2017.
     */


    public class adminscreen {

        public static JLabel m1 = new JLabel();
        public static JLabel m2 = new JLabel();
        public static JLabel m3 = new JLabel();
        public static JTextField lblcategory1 = new JTextField("ADULT MALE -64kg.");
        public static JLabel category = new JLabel("MEDIC");
        public static int brk = 0;
        public static int MedicCountR = 0;
        public static int MedicCountB = 0;
        public static int tmaxround = 1;  // количество раундов в  поединке
        public static int tmaxmin = 0;  // количество минут в раунде
        public static int tmaxsec = 0;  // количество секунд в раунде
        public static int brkcount = 0; // время перерыва
        public static int min = 0;
        public static int MedicMinR = 2;
        public static int MedicMinB = 2;
        public static int rglobal = 0;
        public static int bglobal = 0;
        public static int rglobal1 = 0;
        public static int bglobal1 = 0;
        public static int rglobal2 = 0;
        public static int bglobal2 = 0;
        public static int rglobal3 = 0;
        public static int bglobal3 = 0;
        public static int rglobal4 = 0;
        public static int bglobal4 = 0;
        public static int count = 0;
        public static int amount = 0;
        public static int amountb = 0;
        public static int ar;
        public static int ab;
        public static int amount2 = 0;
        public static int amountb2 = 0;
        public static int ar2;
        public static int ab2;
        public static int amount3 = 0;
        public static int amountb3 = 0;
        public static int ar3;
        public static int ab3;
        public static int amount4 = 0;
        public static int amountb4 = 0;
        public static int ar4;
        public static int ab4;
        public static int rndnum = 1;
        public static int startstop = 2;
        public static int brktime = 0;
        public static int br;
        public static int rwarning = 0;
        public static int bwarning = 0;
        public static int wr;
        public static int wb;
        public static JLabel rwarnings1 = new JLabel("0");
        public static JLabel bwarnings1 = new JLabel("0");

        public static JLabel btotal1 = new JLabel("0");
        public static JLabel rtotal1 = new JLabel("0");
        public static JLabel rpenalty11 = new JLabel("0");
        public static JLabel bpenalty11 = new JLabel("0");
        public static JLabel rexit1 = new JLabel("0");
        public static JLabel bexit1 = new JLabel("0");
        public static int rpen = 0;
        public static int bpen = 0;
        public static int rext = 0;
        public static int bext = 0;
        public static int rpenal;
        public static int bpenal;
        public static int rexit11;
        public static int bexit11;
        public static JTextField rcompetitor1 = new JTextField("Red");
        public static JTextField bcompetitor1 = new JTextField("Blue");
        public static JLabel rs11 = new JLabel("0");
        public static JLabel bs11 = new JLabel("0");
        public static JLabel rs22 = new JLabel("0");
        public static JLabel bs22 = new JLabel("0");
        public static JLabel rs33 = new JLabel("0");
        public static JLabel bs33 = new JLabel("0");
        public static JLabel rs44 = new JLabel("0");
        public static JLabel bs44 = new JLabel("0");
        public static JLabel lbltimer = new JLabel("00:00");
        public static JLabel lblmedtimerr = new JLabel("02:00");
        public static JLabel lblmedtimerb = new JLabel("02:00");

        public static JLabel roundstop = new JLabel("Rounds");
        public static JLabel minutestop = new JLabel("Minutes");
        public static JLabel secondsstop = new JLabel("Seconds");
        public static JLabel breeaktop = new JLabel("Break");
        public static JLabel timmaxround = new JLabel(tmaxround + "");
        public static JLabel timmaxmin = new JLabel("");
        public static JLabel timmaxsec = new JLabel("");
        public static JLabel timbreaktime = new JLabel();
        public static JButton btnlog = new JButton("Show log");

        public static JLabel round1 = new JLabel(rndnum + "");
        public static Timer timer;
        public static Timer MtimerR;
        public static Timer MtimerB;
        public static JButton btnplusmaxrnd = new JButton("+");
        public static JButton btnminusmaxrnd = new JButton("-");
        public static JButton btnplusmaxmin = new JButton("+");
        public static JButton btnminusmaxmin = new JButton("-");
        public static JButton btnplusmaxsec = new JButton("+");
        public static JButton btnminusmaxsec = new JButton("-");
        public static JButton btnplusbrk = new JButton("+");
        public static JButton btnminusbrk = new JButton("-");
        public static JButton btnWatch = new JButton("START");
        public static JButton btnMedicWatchR = new JButton("START");
        public static JButton btnMedicWatchB = new JButton("START");
        public static int matchno1 = 1;
        public static JButton btnplusmatch = new JButton("+");
        public static JButton btnminusmatch = new JButton("-");
        public static JLabel leader2 = new JLabel("DRAW");

        public static JLabel lblMatchNo1 = new JLabel(matchno1 + "");


        public JPanel createContentPane() {


            JPanel totalGUI = new JPanel();
            totalGUI.setLayout(null);

//JLabel lblMatchNo1  = new JLabel(matchno+"");
            lblMatchNo1.setLocation(50, 630);
            lblMatchNo1.setSize(100, 110);
            lblMatchNo1.setHorizontalAlignment(0);
            lblMatchNo1.setForeground(Color.black);
            //  lblMatchNo1.setVerticalAlignment(0);
            lblMatchNo1.setFont(new Font("Arial", Font.BOLD, 45));
            lblMatchNo1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

            // timer.setBackground(Color.yellow);
            lblMatchNo1.setOpaque(true);
            totalGUI.add(lblMatchNo1);


            leader2.setLocation(475, 370);
            leader2.setSize(150, 50);
            leader2.setHorizontalAlignment(0);
            leader2.setBackground(Color.white);
            leader2.setOpaque(true);
            leader2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
            leader2.setForeground(Color.black);
            leader2.setFont(new Font("Arial", Font.BOLD, 20));
            totalGUI.add(leader2);

            JLabel freeware = new JLabel("Secondary screen resolution must be 1280x720                                             This program is distributed free of charge!                                         (C) Andrei Jestin  jestin.andrei@gmail.com   ");
            freeware.setLocation(10, 750);
            freeware.setSize(1250, 15);
            freeware.setHorizontalAlignment(0);
            //freeware.setBackground(Color.white);
            freeware.setOpaque(true);
            freeware.setForeground(Color.black);
            freeware.setFont(new Font("Arial", Font.ITALIC, 15));
            totalGUI.add(freeware);

// кнопка прибавления номера боя
//JButton btnplusmatch = new JButton("+");
            btnplusmatch.setLocation(10, 630);
            btnplusmatch.setSize(40, 55);

            btnplusmatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmatch.setBorder(BorderFactory.createLineBorder(Color.black));
            // btnplusmaxrnd.setBackground(Color.red);
            btnplusmatch.addActionListener(new maxmatch());
            btnplusmatch.setVisible(true);
            totalGUI.add(btnplusmatch);

//  кнопка вычитания номера боя
            //   JButton btnminusmatch = new JButton("-");
            btnminusmatch.setLocation(10, 685);
            btnminusmatch.setSize(40, 55);

            btnminusmatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmatch.setBorder(BorderFactory.createLineBorder(Color.black));
            // btnminusmaxrnd.setBackground(Color.red);
            btnminusmatch.addActionListener(new maxmatch());
            btnminusmatch.setVisible(true);
            totalGUI.add(btnminusmatch);




//lbl category
                category.setLocation(25, 85);
                category.setSize(150, 30);
                category.setHorizontalAlignment(0);
                category.setForeground(Color.black);
                category.setFont(new Font("Arial", Font.BOLD, 20));
                // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
                category.setOpaque(true);

                totalGUI.add(category);


                lblcategory1.setLocation(400, 20);
                lblcategory1.setSize(450, 50);
                lblcategory1.setHorizontalAlignment(0);
                lblcategory1.setForeground(Color.black);
                lblcategory1.setFont(new Font("Arial", Font.BOLD, 25));
                // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
                lblcategory1.setOpaque(true);
                lblcategory1.setVisible(false);
                lblcategory1.getDocument().addDocumentListener(new DocumentListener() {
                    public void removeUpdate(DocumentEvent e) {
                        System.out.println("removeUpdate");
                        lblcategory.setText("Sparring");
                    }

                    public void insertUpdate(DocumentEvent e) {
                        System.out.println("insertUpdate");
                        lblcategory.setText(lblcategory1.getText());
                    }

                    public void changedUpdate(DocumentEvent e) {
                        System.out.println("changedUpdate");
                        lblcategory.setText(lblcategory1.getText());
                    }
                });
                totalGUI.add(lblcategory1);

                // кнопка прибавления секунд

                btnplusmaxsec.setLocation(1100, 200);
                btnplusmaxsec.setSize(40, 40);

                btnplusmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
                btnplusmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
                btnplusmaxsec.addActionListener(new maxsec());
                btnplusmaxsec.setVisible(true);
                totalGUI.add(btnplusmaxsec);

//  кнопка вычитания секунд

                btnminusmaxsec.setLocation(1100, 280);
                btnminusmaxsec.setSize(40, 40);
                btnminusmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
                btnminusmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
                btnminusmaxsec.addActionListener(new maxsec());
                btnminusmaxsec.setVisible(true);
                totalGUI.add(btnminusmaxsec);

// кнопка прибавления раундов

                btnplusmaxrnd.setLocation(900, 200);
                btnplusmaxrnd.setSize(40, 40);
                btnplusmaxrnd.setFont(new Font("Arial", Font.BOLD, 25));
                btnplusmaxrnd.setBorder(BorderFactory.createLineBorder(Color.black));
                btnplusmaxrnd.addActionListener(new maxrnd());
                btnplusmaxrnd.setVisible(true);
                totalGUI.add(btnplusmaxrnd);

//  кнопка вычитания раундов

                btnminusmaxrnd.setLocation(900, 280);
                btnminusmaxrnd.setSize(40, 40);
                btnminusmaxrnd.setFont(new Font("Arial", Font.BOLD, 25));
                btnminusmaxrnd.setBorder(BorderFactory.createLineBorder(Color.black));
                btnminusmaxrnd.addActionListener(new maxrnd());
                btnminusmaxrnd.setVisible(true);
                totalGUI.add(btnminusmaxrnd);

// кнопка прибавления минут

                btnplusmaxmin.setLocation(1000, 200);
                btnplusmaxmin.setSize(40, 40);
                btnplusmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
                btnplusmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
                btnplusmaxmin.addActionListener(new maxmin());
                btnplusmaxmin.setVisible(true);
                totalGUI.add(btnplusmaxmin);

//  кнопка вычитания минут

                btnminusmaxmin.setLocation(1000, 280);
                btnminusmaxmin.setSize(40, 40);
                btnminusmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
                btnminusmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
                btnminusmaxmin.addActionListener(new maxmin());
                btnminusmaxmin.setVisible(true);
                totalGUI.add(btnminusmaxmin);

                // кнопка прибавления перерыва

                btnplusbrk.setLocation(1200, 200);
                btnplusbrk.setSize(40, 40);
                btnplusbrk.setFont(new Font("Arial", Font.BOLD, 25));
                btnplusbrk.setBorder(BorderFactory.createLineBorder(Color.black));
                btnplusbrk.addActionListener(new maxbrk());
                btnplusbrk.setVisible(true);
                totalGUI.add(btnplusbrk);

//  кнопка вычитания перерыва

                btnminusbrk.setLocation(1200, 280);
                btnminusbrk.setSize(40, 40);
                btnminusbrk.setFont(new Font("Arial", Font.BOLD, 25));
                btnminusbrk.setBorder(BorderFactory.createLineBorder(Color.black));
                btnminusbrk.addActionListener(new maxbrk());
                btnminusbrk.setVisible(true);
                totalGUI.add(btnminusbrk);

//  кол-во раундов в таймере
                timmaxround.setLocation(900, 240);
                timmaxround.setSize(40, 40);
                timmaxround.setHorizontalAlignment(0);
                timmaxround.setOpaque(true);
                timmaxround.setBorder(BorderFactory.createLineBorder(Color.black));
                timmaxround.setForeground(Color.black);
                timmaxround.setFont(new Font("Arial", Font.BOLD, 25));
                totalGUI.add(timmaxround);

//  кол-во минут в таймере
                timmaxmin.setLocation(1000, 240);
                timmaxmin.setSize(40, 40);
                timmaxmin.setHorizontalAlignment(0);
                timmaxmin.setOpaque(true);
                timmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
                timmaxmin.setForeground(Color.black);
                timmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
                totalGUI.add(timmaxmin);
//  кол-во секунд в таймере
                timmaxsec.setLocation(1100, 240);
                timmaxsec.setSize(40, 40);
                timmaxsec.setHorizontalAlignment(0);
                timmaxsec.setOpaque(true);
                timmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
                timmaxsec.setForeground(Color.black);
                timmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
                totalGUI.add(timmaxsec);
// продолжительность перерыва

                timbreaktime.setLocation(1200, 240);
                timbreaktime.setSize(40, 40);
                timbreaktime.setHorizontalAlignment(0);
                timbreaktime.setOpaque(true);
                timbreaktime.setBorder(BorderFactory.createLineBorder(Color.black));
                timbreaktime.setForeground(Color.black);
                timbreaktime.setFont(new Font("Arial", Font.BOLD, 25));
                totalGUI.add(timbreaktime);

// номер раунда
                round1.setLocation(910, 20);
                round1.setSize(70, 70);
                round1.setHorizontalAlignment(0);
                round1.setBackground(Color.yellow);
                round1.setOpaque(true);
                round1.setBorder(BorderFactory.createLineBorder(Color.black));
                round1.setForeground(Color.black);
                round1.setFont(new Font("Arial", Font.BOLD, 45));
                totalGUI.add(round1);

//      таймер

                lbltimer.setLocation(980, 20);
                lbltimer.setSize(220, 70);
                lbltimer.setHorizontalAlignment(0);
                lbltimer.setForeground(Color.black);
                lbltimer.setVerticalAlignment(0);
                lbltimer.setFont(new Font("Arial", Font.BOLD, 60));
                lbltimer.setBorder(BorderFactory.createLineBorder(Color.black));
                lbltimer.setOpaque(true);
                totalGUI.add(lbltimer);

            lblmedtimerr.setLocation(20, 140);
            lblmedtimerr.setSize(150, 50);
            lblmedtimerr.setHorizontalAlignment(0);
            lblmedtimerr.setForeground(Color.white);
            lblmedtimerr.setBackground(Color.red);
            lblmedtimerr.setVerticalAlignment(0);
            lblmedtimerr.setFont(new Font("Arial", Font.BOLD, 40));
            lblmedtimerr.setBorder(BorderFactory.createLineBorder(Color.white));
            lblmedtimerr.setOpaque(true);
                totalGUI.add(lblmedtimerr);

                lblmedtimerb.setLocation(20, 280);
            lblmedtimerb.setSize(150, 50);
            lblmedtimerb.setHorizontalAlignment(0);
            lblmedtimerb.setForeground(Color.white);
            lblmedtimerb.setBackground(Color.blue);
            lblmedtimerb.setVerticalAlignment(0);
            lblmedtimerb.setFont(new Font("Arial", Font.BOLD, 40));
            lblmedtimerb.setBorder(BorderFactory.createLineBorder(Color.white));
            lblmedtimerb.setOpaque(true);
                totalGUI.add(lblmedtimerb);

                // табличка rounds

                roundstop.setLocation(870, 150);
                roundstop.setSize(100, 40);
                roundstop.setHorizontalAlignment(0);
                roundstop.setForeground(Color.black);
                roundstop.setVerticalAlignment(0);
                roundstop.setFont(new Font("Arial", Font.BOLD, 20));
                roundstop.setOpaque(true);
                totalGUI.add(roundstop);
                // табличка minutes

                minutestop.setLocation(970, 150);
                minutestop.setSize(100, 40);
                minutestop.setHorizontalAlignment(0);
                minutestop.setForeground(Color.black);
                minutestop.setVerticalAlignment(0);
                minutestop.setFont(new Font("Arial", Font.BOLD, 20));
                minutestop.setOpaque(true);
                totalGUI.add(minutestop);
                // табличка seconds
                secondsstop.setLocation(1070, 150);
                secondsstop.setSize(100, 40);
                secondsstop.setHorizontalAlignment(0);
                secondsstop.setForeground(Color.black);
                secondsstop.setVerticalAlignment(0);
                secondsstop.setFont(new Font("Arial", Font.BOLD, 20));
                secondsstop.setOpaque(true);
                totalGUI.add(secondsstop);
                // табличка Break
                breeaktop.setLocation(1170, 150);
                breeaktop.setSize(100, 40);
                breeaktop.setHorizontalAlignment(0);
                breeaktop.setForeground(Color.black);
                breeaktop.setVerticalAlignment(0);
                breeaktop.setFont(new Font("Arial", Font.BOLD, 20));
                breeaktop.setOpaque(true);
                totalGUI.add(breeaktop);

//  сброс
                JButton btnReset = new JButton("RESET");
                btnReset.setLocation(1100, 360);
                btnReset.setSize(120, 60);
                btnReset.setFont(new Font("Arial", Font.BOLD, 25));
                btnReset.setBorder(BorderFactory.createLineBorder(Color.black));
                btnReset.setBackground(Color.red);
                btnReset.addActionListener(new WatchButtonListener());
                btnReset.setVisible(true);
                totalGUI.add(btnReset);

                JButton btnMedicResetR = new JButton("RESET");
            btnMedicResetR.setLocation(100, 189);
            btnMedicResetR.setSize(70, 30);
            btnMedicResetR.setFont(new Font("Arial", Font.BOLD, 15));
            btnMedicResetR.setBorder(BorderFactory.createLineBorder(Color.white));
            btnMedicResetR.setBackground(Color.red);
            btnMedicResetR.setForeground(Color.white);
            btnMedicResetR.addActionListener(new MedicRWatchButtonListener());
            btnMedicResetR.setVisible(true);
                totalGUI.add(btnMedicResetR);

                JButton btnMedicResetB = new JButton("RESET");
            btnMedicResetB.setLocation(100, 329);
            btnMedicResetB.setSize(70, 30);
            btnMedicResetB.setFont(new Font("Arial", Font.BOLD, 15));
            btnMedicResetB.setForeground(Color.white);
            btnMedicResetB.setBorder(BorderFactory.createLineBorder(Color.white));
            btnMedicResetB.setBackground(Color.blue);
            btnMedicResetB.addActionListener(new MedicBWatchButtonListener());
            btnMedicResetB.setVisible(true);
                totalGUI.add(btnMedicResetB);


//  старт таймера

                //JButton btnWatch = new JButton("Start");
                btnWatch.setLocation(900, 360);
                btnWatch.setSize(120, 60);
                btnWatch.setBackground(Color.green);
                btnWatch.setFont(new Font("Arial", Font.BOLD, 25));
                btnWatch.setBorder(BorderFactory.createLineBorder(Color.black));
                btnWatch.addActionListener((ActionListener) new WatchButtonListener());
                timer = new Timer(1000, new TimerListener());
                btnWatch.setVisible(true);
                totalGUI.add(btnWatch);

            btnMedicWatchR.setLocation(20, 189);
            btnMedicWatchR.setSize(80, 30);
            btnMedicWatchR.setBackground(Color.red);
            btnMedicWatchR.setFont(new Font("Arial", Font.BOLD, 15));
            btnMedicWatchR.setBorder(BorderFactory.createLineBorder(Color.white));
            btnMedicWatchR.setForeground(Color.white);
            btnMedicWatchR.addActionListener((ActionListener) new MedicRWatchButtonListener());
                MtimerR = new Timer(1000, new MTimerListenerR());
            btnMedicWatchR.setVisible(true);
                totalGUI.add(btnMedicWatchR);

                btnMedicWatchB.setLocation(20, 329);
            btnMedicWatchB.setSize(80, 30);
            btnMedicWatchB.setBackground(Color.blue);
            btnMedicWatchB.setFont(new Font("Arial", Font.BOLD, 15));
            btnMedicWatchB.setForeground(Color.white);
            btnMedicWatchB.setBorder(BorderFactory.createLineBorder(Color.white));
            btnMedicWatchB.addActionListener((ActionListener) new MedicBWatchButtonListener());
                MtimerB = new Timer(1000, new MTimerListenerB());
            btnMedicWatchB.setVisible(true);
                totalGUI.add(btnMedicWatchB);

                // звуковой сигнал
                JButton btnSignal = new JButton("*Beep");
                btnSignal.setLocation(900, 440);
                btnSignal.setSize(120, 60);
                btnSignal.setFont(new Font("Arial", Font.BOLD, 25));
                btnSignal.setBorder(BorderFactory.createLineBorder(Color.black));
                btnSignal.addActionListener((ActionListener) new WatchButtonListener());
                btnSignal.setVisible(true);
                totalGUI.add(btnSignal);


// кнопка  цвета экрана


                btnlog.setLocation(20, 540);
                btnlog.setSize(80, 30);
                btnlog.setFont(new Font("Arial", Font.BOLD, 10));
                btnlog.setBorder(BorderFactory.createLineBorder(Color.black));
                btnlog.addActionListener(new LogButtonListener());
                totalGUI.add(btnlog);

// штраф синий
                JLabel lblbluepenalty = new JLabel("MP");
                lblbluepenalty.setLocation(670, 100);
                lblbluepenalty.setSize(40, 40);
                lblbluepenalty.setHorizontalAlignment(0);
                // lblexit1.setBackground(Color.black);
                lblbluepenalty.setForeground(Color.black);
                lblbluepenalty.setOpaque(true);
                //lblbpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
                lblbluepenalty.setFont(new Font("Arial", Font.BOLD, 20));

                totalGUI.add(lblbluepenalty);

                JButton penaltyplusblue = new JButton("+");
                penaltyplusblue.setLocation(670, 140);
                penaltyplusblue.setSize(40, 40);
                penaltyplusblue.setBackground(Color.yellow);
                penaltyplusblue.setForeground(Color.black);
                penaltyplusblue.setFont(new Font("Arial", Font.BOLD, 30));
                penaltyplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
                penaltyplusblue.addActionListener(new penaltyblue());
                totalGUI.add(penaltyplusblue);

                JLabel lblblueexit = new JLabel("EX");
                lblblueexit.setLocation(800, 100);
                lblblueexit.setSize(40, 40);
                lblblueexit.setHorizontalAlignment(0);
                // lblexit1.setBackground(Color.black);
                lblblueexit.setForeground(Color.black);
                lblblueexit.setOpaque(true);
                //lblbpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
                lblblueexit.setFont(new Font("Arial", Font.BOLD, 20));

                totalGUI.add(lblblueexit);

                JButton exitplusblue = new JButton("+");
                exitplusblue.setLocation(800, 140);
                exitplusblue.setSize(40, 40);
                exitplusblue.setBackground(Color.yellow);
                exitplusblue.setForeground(Color.black);
                exitplusblue.setFont(new Font("Arial", Font.BOLD, 30));
                exitplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
                exitplusblue.addActionListener(new exitblue());
                totalGUI.add(exitplusblue);

                JButton penaltyblueminus = new JButton("-");
                penaltyblueminus.setLocation(670, 230);
                penaltyblueminus.setSize(40, 40);
                penaltyblueminus.setBackground(Color.yellow);
                penaltyblueminus.setForeground(Color.black);
                penaltyblueminus.setFont(new Font("Arial", Font.BOLD, 30));
                penaltyblueminus.setBorder(BorderFactory.createLineBorder(Color.black));
                penaltyblueminus.addActionListener(new penaltyminusblue());
                totalGUI.add(penaltyblueminus);

                JButton exitblueminus = new JButton("-");
                exitblueminus.setLocation(800, 230);
                exitblueminus.setSize(40, 40);
                exitblueminus.setBackground(Color.yellow);
                exitblueminus.setForeground(Color.black);
                exitblueminus.setFont(new Font("Arial", Font.BOLD, 30));
                exitblueminus.setBorder(BorderFactory.createLineBorder(Color.black));
                exitblueminus.addActionListener(new exitblueminus());
                totalGUI.add(exitblueminus);
//
//// штраф красный

                JLabel lblredpenalty = new JLabel("MP");
                lblredpenalty.setLocation(270, 100);
                lblredpenalty.setSize(40, 40);
                lblredpenalty.setHorizontalAlignment(0);
                lblredpenalty.setForeground(Color.black);
                lblredpenalty.setOpaque(true);
                lblredpenalty.setFont(new Font("Arial", Font.BOLD, 20));
                totalGUI.add(lblredpenalty);

                JButton penaltyplusred = new JButton("+");
                penaltyplusred.setLocation(270, 140);
                penaltyplusred.setSize(40, 40);
                penaltyplusred.setBackground(Color.yellow);
                penaltyplusred.setForeground(Color.black);
                penaltyplusred.setFont(new Font("Arial", Font.BOLD, 20));
                penaltyplusred.setBorder(BorderFactory.createLineBorder(Color.black));
                penaltyplusred.addActionListener(new penaltyred());
                totalGUI.add(penaltyplusred);


                JLabel lblredexit = new JLabel("EX");
                lblredexit.setLocation(400, 100);
                lblredexit.setSize(40, 40);
                lblredexit.setHorizontalAlignment(0);
                lblredexit.setForeground(Color.black);
                lblredexit.setOpaque(true);
                lblredexit.setFont(new Font("Arial", Font.BOLD, 20));
                totalGUI.add(lblredexit);

                JButton exitplusred = new JButton("+");
                exitplusred.setLocation(400, 140);
                exitplusred.setSize(40, 40);
                exitplusred.setBackground(Color.yellow);
                exitplusred.setForeground(Color.black);
                exitplusred.setFont(new Font("Arial", Font.BOLD, 20));
                exitplusred.setBorder(BorderFactory.createLineBorder(Color.black));
                exitplusred.addActionListener(new extired());
                totalGUI.add(exitplusred);

                JButton penaltyredminus = new JButton("-");
                penaltyredminus.setLocation(270, 230);
                penaltyredminus.setSize(40, 40);
                penaltyredminus.setBackground(Color.yellow);
                penaltyredminus.setForeground(Color.black);
                penaltyredminus.setBorder(BorderFactory.createLineBorder(Color.black));
                penaltyredminus.setFont(new Font("Arial", Font.BOLD, 20));
                penaltyredminus.addActionListener(new penaltyminusred());
                totalGUI.add(penaltyredminus);

                JButton exitredminus = new JButton("-");
                exitredminus.setLocation(400, 230);
                exitredminus.setSize(40, 40);
                exitredminus.setBackground(Color.yellow);
                exitredminus.setForeground(Color.black);
                exitredminus.setBorder(BorderFactory.createLineBorder(Color.black));
                exitredminus.setFont(new Font("Arial", Font.BOLD, 20));
                exitredminus.addActionListener(new exitredminus());
                totalGUI.add(exitredminus);
                //предупреждения

                rwarnings1.setLocation(335, 180);
                rwarnings1.setSize(40, 50);
                rwarnings1.setHorizontalAlignment(0);
                rwarnings1.setForeground(Color.black);
                rwarnings1.setBorder(BorderFactory.createLineBorder(Color.black));
                rwarnings1.setVerticalAlignment(SwingConstants.CENTER);
                rwarnings1.setFont(new Font("Arial", Font.BOLD, 40));
                totalGUI.add(rwarnings1);

                bwarnings1.setLocation(740, 180);
                bwarnings1.setSize(40, 50);
                bwarnings1.setHorizontalAlignment(0);
                bwarnings1.setVerticalAlignment(SwingConstants.CENTER);
                bwarnings1.setForeground(Color.black);
                bwarnings1.setFont(new Font("Arial", Font.BOLD, 40));
                bwarnings1.setBorder(BorderFactory.createLineBorder(Color.black));
                totalGUI.add(bwarnings1);

                // штрафные очки
                rpenalty11.setLocation(270, 180);
                rpenalty11.setSize(40, 50);
                rpenalty11.setHorizontalAlignment(0);
                rpenalty11.setForeground(Color.black);
                rpenalty11.setVerticalAlignment(SwingConstants.CENTER);
                rpenalty11.setBorder(BorderFactory.createLineBorder(Color.black));
                rpenalty11.setFont(new Font("Arial", Font.BOLD, 40));
                rpenalty11.setBackground(Color.yellow);
                rpenalty11.setOpaque(true);
                totalGUI.add(rpenalty11);

                rexit1.setLocation(400, 180);
                rexit1.setSize(40, 50);
                rexit1.setHorizontalAlignment(0);
                rexit1.setForeground(Color.black);
                rexit1.setVerticalAlignment(SwingConstants.CENTER);
                rexit1.setBorder(BorderFactory.createLineBorder(Color.black));
                rexit1.setFont(new Font("Arial", Font.BOLD, 40));
                rexit1.setBackground(Color.yellow);
                rexit1.setOpaque(true);
                totalGUI.add(rexit1);

                bpenalty11.setLocation(670, 180);
                bpenalty11.setSize(40, 50);
                bpenalty11.setHorizontalAlignment(0);
                bpenalty11.setForeground(Color.black);
                bpenalty11.setVerticalAlignment(SwingConstants.CENTER);
                bpenalty11.setFont(new Font("Arial", Font.BOLD, 40));
                bpenalty11.setBorder(BorderFactory.createLineBorder(Color.black));
                bpenalty11.setBackground(Color.yellow);
                bpenalty11.setOpaque(true);
                totalGUI.add(bpenalty11);

                bexit1.setLocation(800, 180);
                bexit1.setSize(40, 50);
                bexit1.setHorizontalAlignment(0);
                bexit1.setForeground(Color.black);
                bexit1.setVerticalAlignment(SwingConstants.CENTER);
                bexit1.setFont(new Font("Arial", Font.BOLD, 40));
                bexit1.setBorder(BorderFactory.createLineBorder(Color.black));
                bexit1.setBackground(Color.yellow);
                bexit1.setOpaque(true);
                totalGUI.add(bexit1);

                // список судей (поле)


                // общие очки
                btotal1.setLocation(650, 280);
                btotal1.setSize(200, 270);
                btotal1.setHorizontalAlignment(0);
                btotal1.setForeground(Color.white);
                btotal1.setBackground(Color.blue);
                btotal1.setFont(new Font("Arial", Font.BOLD, 220));
                btotal1.setBorder(BorderFactory.createLineBorder(Color.black));
                btotal1.setOpaque(true);

                totalGUI.add(btotal1);
                rtotal1.setLocation(250, 280);
                rtotal1.setSize(200, 270);
                rtotal1.setHorizontalAlignment(0);
                rtotal1.setForeground(Color.white);
                rtotal1.setBackground(Color.red);
                rtotal1.setFont(new Font("Arial", Font.BOLD, 220));
                rtotal1.setBorder(BorderFactory.createLineBorder(Color.black));
                rtotal1.setOpaque(true);
                totalGUI.add(rtotal1);


// Сброс очков


                JButton resetButton = new JButton("RESET ALL");
                resetButton.setLocation(1120, 680);
                resetButton.setSize(120, 50);
                resetButton.setBackground(Color.white);
                resetButton.setForeground(Color.black);
                resetButton.addActionListener(new resetscore());
                totalGUI.add(resetButton);

                JButton btnnext = new JButton("NEXT");
                btnnext.setLocation(1120, 610);
                btnnext.setSize(120, 50);
                btnnext.setBackground(Color.white);
                btnnext.setForeground(Color.black);
                btnnext.addActionListener(new nextmatch());
                totalGUI.add(btnnext);


                // замечания синий


                JLabel lblredwarning = new JLabel("W");
                lblredwarning.setLocation(335, 100);
                lblredwarning.setSize(40, 40);
                lblredwarning.setHorizontalAlignment(0);
                lblredwarning.setForeground(Color.black);
                lblredwarning.setOpaque(true);
                lblredwarning.setFont(new Font("Arial", Font.BOLD, 20));
                totalGUI.add(lblredwarning);

                JLabel lblbluewarning = new JLabel("W");
                lblbluewarning.setLocation(740, 100);
                lblbluewarning.setSize(40, 40);
                lblbluewarning.setHorizontalAlignment(0);
                lblbluewarning.setForeground(Color.black);
                lblbluewarning.setOpaque(true);
                lblbluewarning.setFont(new Font("Arial", Font.BOLD, 20));
                totalGUI.add(lblbluewarning);

                JButton warningplusblue = new JButton("+");
                warningplusblue.setLocation(740, 140);
                warningplusblue.setSize(40, 40);
                warningplusblue.setBackground(Color.blue);
                warningplusblue.setForeground(Color.white);
                warningplusblue.setFont(new Font("Arial", Font.BOLD, 30));
                warningplusblue.addActionListener(new waringblue());
                warningplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
                totalGUI.add(warningplusblue);


                JButton warningminusblue = new JButton("-");
                warningminusblue.setLocation(740, 230);
                warningminusblue.setSize(40, 40);
                warningminusblue.setBackground(Color.blue);
                warningminusblue.setForeground(Color.white);
                warningminusblue.setBorder(BorderFactory.createLineBorder(Color.black));

                warningminusblue.setFont(new Font("Arial", Font.BOLD, 30));
                warningminusblue.addActionListener(new warningblueminus());
                totalGUI.add(warningminusblue);

// замечания красный

                JButton warningplusred = new JButton("+");
                warningplusred.setLocation(335, 140);
                warningplusred.setSize(40, 40);
                warningplusred.setBackground(Color.red);
                warningplusred.setForeground(Color.white);
                warningplusred.setFont(new Font("Arial", Font.BOLD, 30));
                warningplusred.addActionListener(new warningred());
                warningplusred.setBorder(BorderFactory.createLineBorder(Color.black));
                totalGUI.add(warningplusred);


                JButton warningminusred = new JButton("-");
                warningminusred.setLocation(335, 230);
                warningminusred.setSize(40, 40);
                warningminusred.setBackground(Color.red);
                warningminusred.setForeground(Color.white);
                warningminusred.setBorder(BorderFactory.createLineBorder(Color.black));
                warningminusred.setFont(new Font("Arial", Font.BOLD, 40));


                warningminusred.addActionListener(new warningredminus());
                totalGUI.add(warningminusred);


                //участники 1 и 2

                rcompetitor1.setLocation(260, 630);
                rcompetitor1.setSize(390, 50);
                rcompetitor1.setHorizontalAlignment(0);
                rcompetitor1.setForeground(Color.white);
                rcompetitor1.setBackground(Color.red);
                rcompetitor1.setFont(new Font("Arial", Font.BOLD, 30));
                rcompetitor1.getDocument().addDocumentListener(new DocumentListener() {

                    public void removeUpdate(DocumentEvent e) {
                        System.out.println("removeUpdate");
                        rcompetitor.setText("Red");
                    }

                    public void insertUpdate(DocumentEvent e) {
                        System.out.println("insertUpdate");
                        rcompetitor.setText(rcompetitor1.getText());
                    }

                    public void changedUpdate(DocumentEvent e) {
                        System.out.println("changedUpdate");
                        rcompetitor.setText(rcompetitor1.getText());
                    }
                });
                rcompetitor1.setOpaque(true);

                totalGUI.add(rcompetitor1);

                bcompetitor1.setLocation(260, 690);
                bcompetitor1.setSize(390, 50);
                bcompetitor1.setHorizontalAlignment(0);
                bcompetitor1.setForeground(Color.white);
                bcompetitor1.setBackground(Color.blue);
                bcompetitor1.setFont(new Font("Arial", Font.BOLD, 30));
                bcompetitor1.setOpaque(true);
                bcompetitor1.getDocument().addDocumentListener(new DocumentListener() {

                    public void removeUpdate(DocumentEvent e) {
                        System.out.println("removeUpdate");
                        bcompetitor.setText("Blue");
                    }

                    public void insertUpdate(DocumentEvent e) {
                        System.out.println("insertUpdate");
                        bcompetitor.setText(bcompetitor1.getText());
                    }

                    public void changedUpdate(DocumentEvent e) {
                        System.out.println("changedUpdate");
                        bcompetitor.setText(bcompetitor1.getText());
                    }
                });
                totalGUI.add(bcompetitor1);
                //  судья 1

                m1.setLocation(650, 560);
                m1.setSize(150, 30);
                m1.setHorizontalAlignment(0);
                m1.setForeground(Color.white);
                m1.setBackground(Color.white);
                m1.setFont(new Font("Arial", Font.BOLD, 45));
                m1.setOpaque(true);
                totalGUI.add(m1);

                m2.setLocation(800, 560);
                m2.setSize(150, 30);
                m2.setHorizontalAlignment(0);
                m2.setForeground(Color.white);
                m2.setBackground(Color.white);
                m2.setFont(new Font("Arial", Font.BOLD, 45));
                m2.setOpaque(true);
                totalGUI.add(m2);

                m3.setLocation(950, 560);
                m3.setSize(150, 30);
                m3.setHorizontalAlignment(0);
                m3.setForeground(Color.white);
                m3.setBackground(Color.white);
                m3.setFont(new Font("Arial", Font.BOLD, 45));
                m3.setOpaque(true);
                totalGUI.add(m3);

                rs11.setLocation(650, 630);
                rs11.setSize(150, 50);
                rs11.setHorizontalAlignment(0);
                rs11.setForeground(Color.white);
                rs11.setBackground(Color.red);
                rs11.setFont(new Font("Arial", Font.BOLD, 45));
                rs11.setOpaque(true);


                totalGUI.add(rs11);

                bs11.setLocation(650, 690);
                bs11.setSize(150, 50);
                bs11.setHorizontalAlignment(0);
                bs11.setForeground(Color.white);
                bs11.setBackground(Color.blue);
                bs11.setFont(new Font("Arial", Font.BOLD, 45));
                bs11.setOpaque(true);

                totalGUI.add(bs11);

                //  судья 2

                rs22.setLocation(800, 630);
                rs22.setSize(150, 50);
                rs22.setHorizontalAlignment(0);
                rs22.setForeground(Color.white);
                rs22.setBackground(Color.red);
                rs22.setFont(new Font("Arial", Font.BOLD, 45));
                rs22.setOpaque(true);


                totalGUI.add(rs22);

                bs22.setLocation(800, 690);
                bs22.setSize(150, 50);
                bs22.setHorizontalAlignment(0);
                bs22.setForeground(Color.white);
                bs22.setBackground(Color.blue);
                bs22.setFont(new Font("Arial", Font.BOLD, 45));
                bs22.setOpaque(true);

                totalGUI.add(bs22);


                //судья 3
                rs33.setLocation(950, 630);
                rs33.setSize(150, 50);
                rs33.setHorizontalAlignment(0);
                rs33.setForeground(Color.white);
                rs33.setBackground(Color.red);
                rs33.setFont(new Font("Arial", Font.BOLD, 45));
                rs33.setOpaque(true);


                totalGUI.add(rs33);

                bs33.setLocation(950, 690);
                bs33.setSize(150, 50);
                bs33.setHorizontalAlignment(0);
                bs33.setForeground(Color.white);
                bs33.setBackground(Color.blue);
                bs33.setFont(new Font("Arial", Font.BOLD, 45));
                bs33.setOpaque(true);

                totalGUI.add(bs33);


                return totalGUI;


            }


            private class WatchButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent event) {
                    if (event.getActionCommand().equals("START")) {
                        min = tmaxmin;
                        count = tmaxsec;
                        brkcount = br;
                        btnWatch.setText("STOP");
                        btnWatch.setBackground(Color.yellow);
                        // btnReset.setEnabled(false);
                        sound.playSound("sounds/start2s.wav").join();
                        timer.start();

                        String[] str10 = new String[5];
                        str10[0] = "Jury President";
                        str10[1] = round.getText();
                        str10[2] = lbltimer.getText();
                        str10[3] = "Match No " + matchno1 + " Starts!";
                        str10[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                        btm.addDate(str10);
                        btm.fireTableDataChanged();

                    } else if (event.getActionCommand().equals("RESUME")) {
                        btnWatch.setBackground(Color.yellow);
                        btnWatch.setText("STOP");
                        timer.start();

                    } else if (event.getActionCommand().equals("*Beep")) {
                        sound.playSound("sounds/pip.wav").join();

                    } else if (event.getActionCommand().equals("RESET")) {
                        count = 0;
                        min = 0;
                        brk = 0;
                        rndnum = 1;

                        lbltimer.setText("00:00");
                        lbltimer1.setText("00:00");
                        timer.stop();
                        btnWatch.setText("START");
                        btnWatch.setBackground(Color.green);

                    } else {
                        timer.stop();
                        btnWatch.setText("RESUME");
                        btnWatch.setBackground(Color.green);
                    }
                }
            }  private class MedicRWatchButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent event) {
                    if (event.getActionCommand().equals("START")) {
                       // min = tmaxmin;
                     //   count = tmaxsec;
                        brkcount = br;
                        btnMedicWatchR.setText("STOP");
                        lblmedtimerr2.setVisible(true);
                      //  btnMedicWatchR.setBackground(Color.yellow);
                        // btnReset.setEnabled(false);
                     //   sound.playSound("sounds/start2s.wav").join();
                        MtimerR.start();

                        String[] str10 = new String[5];
                        str10[0] = "Jury President";
                        str10[1] = round.getText();
                        str10[2] = lbltimer.getText();
                        str10[3] = "Match No " + matchno1 + " Starts!";
                        str10[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                        btm.addDate(str10);
                        btm.fireTableDataChanged();

                    } else if (event.getActionCommand().equals("RESUME")) {
                       // btnMedicWatchR.setBackground(Color.yellow);
                        btnMedicWatchR.setText("STOP");
                        lblmedtimerr2.setVisible(true);
                        MtimerR.start();

                    } else if (event.getActionCommand().equals("*Beep")) {
                       // sound.playSound("sounds/pip.wav").join();

                    } else if (event.getActionCommand().equals("RESET")) {
                        MedicCountR = 0;
                        MedicMinR = 2;
                        lblmedtimerr2.setVisible(false);

                        lblmedtimerr.setText("02:00");
                        lblmedtimerr2.setText("02:00");
                       // lbltimer1.setText("00:00");
                        MtimerR.stop();
                        btnMedicWatchR.setText("START");
                      //  btnMedicWatchR.setBackground(Color.green);

                    } else {
                        MtimerR.stop();
                        btnMedicWatchR.setText("RESUME");
                        lblmedtimerr2.setVisible(false);
                    //    btnMedicWatchR.setBackground(Color.green);
                    }
                }
            } private class MedicBWatchButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent event) {
                    if (event.getActionCommand().equals("START")) {
                       // min = tmaxmin;
                     //   count = tmaxsec;
                        brkcount = br;
                        btnMedicWatchB.setText("STOP");
                        lblmedtimerb2.setVisible(true);

                        MtimerB.start();

                        String[] str10 = new String[5];
                        str10[0] = "Jury President";
                        str10[1] = round.getText();
                        str10[2] = lbltimer.getText();
                        str10[3] = "Match No " + matchno1 + " Starts!";
                        str10[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
                        btm.addDate(str10);
                        btm.fireTableDataChanged();

                    } else if (event.getActionCommand().equals("RESUME")) {
                       // btnMedicWatchR.setBackground(Color.yellow);
                        lblmedtimerb2.setVisible(true);
                        btnMedicWatchB.setText("STOP");
                        MtimerB.start();

                    } else if (event.getActionCommand().equals("*Beep")) {
                        sound.playSound("sounds/pip.wav").join();

                    } else if (event.getActionCommand().equals("RESET")) {
                        MedicCountB = 0;
                        MedicMinB = 2;
                        //brk = 0;
                       // rndnum = 1;
                        lblmedtimerb2.setVisible(false);
                        lblmedtimerb.setText("02:00");
                        lblmedtimerb2.setText("02:00");
                       // lbltimer1.setText("00:00");
                        MtimerB.stop();
                        btnMedicWatchB.setText("START");
                      //  btnMedicWatchR.setBackground(Color.green);

                    } else {
                        MtimerB.stop();
                        btnMedicWatchB.setText("RESUME");
                        lblmedtimerb2.setVisible(false);
                    //    btnMedicWatchR.setBackground(Color.green);
                    }
                }
            }

            private class LogButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent event) {
                    if (event.getActionCommand().equals("Show log")) {
                        frame3.setExtendedState(JFrame.NORMAL);
                        btnlog.setText("Hide log");


                    } else if (event.getActionCommand().equals("Hide log")) {
                        frame3.setState(JFrame.ICONIFIED);
                        btnlog.setText("Show log");


                    } else {

                    }
                }
            }

        }






                //распечатать массив



















