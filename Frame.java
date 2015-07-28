/**
 * Write a description of class JFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class Frame extends JFrame
{
    JPanel j = new JPanel();
    JPanel f = new JPanel();
    JRadioButton booster = new JRadioButton("Confidence Booster");
    JRadioButton easy = new JRadioButton("Easy");
    JRadioButton med = new JRadioButton("Medium");
    JRadioButton hard = new JRadioButton("Hard");
    JRadioButton human = new JRadioButton("Human");
    JRadioButton booster2 = new JRadioButton("Confidence Booster");
    JRadioButton easy2 = new JRadioButton("Easy");
    JRadioButton med2 = new JRadioButton("Medium");
    JRadioButton hard2 = new JRadioButton("Hard");
    JRadioButton human2 = new JRadioButton("Human");
    JLabel p1 = new JLabel("Player 1");
    JLabel p2 = new JLabel("Player 2");
    CardLayout c = new CardLayout();
    ButtonGroup g1 = new ButtonGroup();
    ButtonGroup g2 = new ButtonGroup();
    GamePanel g = new GamePanel();
    int buttonsPressed1=0;
    int buttonsPressed2=0;
public Frame()
{
    //j.setLayout();
    f.setLayout(c);
    j.setLayout(null);
    f.add(j);
    //GamePanel g = new GamePanel();
    f.add(g);
    setTitle("Connect 4");
    p1.setBounds(20, 10, 150, 25);
    booster.setBounds(20, 40, 150, 25);
    easy.setBounds(20, 70, 150, 25);
    med.setBounds(20, 100, 150, 25);
    hard.setBounds(20, 130, 150, 25);
    human.setBounds(20, 160, 150, 25);
    p2.setBounds(180, 10, 150, 25);
    booster2.setBounds(180, 40, 150, 25);
    easy2.setBounds(180, 70, 150, 25);
    med2.setBounds(180, 100, 150, 25);
    hard2.setBounds(180, 130, 150, 25);
    human2.setBounds(180, 160, 150, 25);
    j.add(p1);
    j.add(p2);
    g1.add(booster);
    g1.add(easy);
    g1.add(med);
    g1.add(hard);
    g1.add(human);
    g2.add(booster2);
    g2.add(easy2);
    g2.add(med2);
    g2.add(hard2);
    g2.add(human2);
    j.add(booster);
    j.add(easy);
    j.add(med);
    j.add(hard);
    j.add(human);
    j.add(booster2);
    j.add(easy2);
    j.add(med2);
    j.add(hard2);
    j.add(human2);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    booster.addActionListener(new Action());
    easy.addActionListener(new Action());
    med.addActionListener(new Action());
    hard.addActionListener(new Action());
    human.addActionListener(new Action());
    booster2.addActionListener(new Action());
    easy2.addActionListener(new Action());
    med2.addActionListener(new Action());
    hard2.addActionListener(new Action());
    human2.addActionListener(new Action());
    add(f);
    pack();
}
public static void main (String[] args)
{
    Frame f = new Frame();
}
public class Action implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        //c.next(f);
        if (e.getSource().equals(booster))
        {
        g.level1(0);
        buttonsPressed1++;
    }
        if (e.getSource().equals(easy))
        {
        g.level1(1);
        buttonsPressed1++;
    }
        if (e.getSource().equals(med))
        {
        g.level1(2);
        buttonsPressed1++;
    }
        if (e.getSource().equals(hard))
        {
        g.level1(3);
        buttonsPressed1++;
    }
        if (e.getSource().equals(human))
        {
        g.level1(4);
        buttonsPressed1++;
    }
    
        if (e.getSource().equals(booster2))
        {
        g.level2(0);
        buttonsPressed2++;
    }
        if (e.getSource().equals(easy2))
        {
        g.level2(1);
        buttonsPressed2++;
    }
        if (e.getSource().equals(med2))
        {
        g.level2(2);
        buttonsPressed2++;
    }
        if (e.getSource().equals(hard2))
        {
        g.level2(3);
        buttonsPressed2++;
    }
        if (e.getSource().equals(human2))
        {
        g.level2(4);
        buttonsPressed2++;
    }
    
        if (buttonsPressed1 > 0&& buttonsPressed2 > 0)
        c.next(f);
    }
}
}
