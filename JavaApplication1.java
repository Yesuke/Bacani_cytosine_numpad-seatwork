package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaApplication1 {
    JFrame frame;
    JButton nlock;
    JButton slash;
    JButton asterisk;
    JButton dash;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton four;
    JButton five;
    JButton six;
    JButton one;
    JButton two;
    JButton three;
    JButton zero;
    JButton period;
    JButton plus;
    JButton enter;
    
    public JavaApplication1(){
        frame=new JFrame("Numpad");
     nlock = new JButton("Num Lock");
     slash = new JButton("/");
    asterisk = new JButton("*");
    dash = new JButton("-");
    seven = new JButton("7");
    eight = new JButton("8");
    nine = new JButton("9");
    four = new JButton("4");
    five = new JButton("5");
    six = new JButton("6");
    one = new JButton("1");
    two = new JButton("2");
    three = new JButton("3");
    zero = new JButton("0");
    period = new JButton(".");
    plus = new JButton("+");
    enter = new JButton("Enter");
        
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(8,10)));
        frame.add( nlock,new Rectangle(0,0,2,2));
        frame.add( slash,new Rectangle(2,0,2,2));
        frame.add( asterisk,new Rectangle(4,0,2,2));
        frame.add( dash,new Rectangle(6,0,2,2)) ;       
        frame.add( seven,new Rectangle(0,2,2,2))  ;      
        frame.add( eight,new Rectangle(2,2,2,2))  ;      
        frame.add( nine,new Rectangle(4,2,2,2))   ;     
        frame.add( four,new Rectangle(0,4,2,2));
        frame.add( five,new Rectangle(2,4,2,2));
        frame.add( six,new Rectangle(4,4,2,2));
        frame.add( one,new Rectangle(0,6,2,2));
        frame.add( two,new Rectangle(2,6,2,2));
        frame.add( three,new Rectangle(4,6,2,2));
        frame.add( zero,new Rectangle(0,8,4,2));
        frame.add( period,new Rectangle(4,8,2,2));
        frame.add( plus,new Rectangle(6,2,2,4));
        frame.add( enter,new Rectangle(6,6,2,4)) ;   
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(300,400);
    }
    
    public static void main(String[] args){
        JavaApplication1 la=new JavaApplication1();
        la.setFrame();
    }   
}