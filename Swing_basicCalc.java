import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Swing_basicCalc implements ActionListener {
    JLabel first,second,result;
    JTextField firstField,secondField;
    JButton add,sub,mul,div;
    String text;

    public Swing_basicCalc(){
        JFrame jframe = new JFrame();

        first = new JLabel("First Number");
        first.setBounds(50,80,100,30);

        second = new JLabel("Second Number");
        second.setBounds(50,130,100,30);

        firstField = new JTextField();
        firstField.setBounds(150,80,200,30);

        secondField = new JTextField();
        secondField.setBounds(150,130,200,30);

        add = new JButton("+");
        add.setBounds(60,180,55,30);

        sub = new JButton("-");
        sub.setBounds(130,180,55,30);

        mul = new JButton("x");
        mul.setBounds(200,180,55,30);

        div = new JButton("/");
        div.setBounds(270,180,55,30);

        text = "Result : ";
        result = new JLabel(text);
        result.setBounds(60,230,200,30);

        jframe.add(result);
        jframe.add(first);
        jframe.add(second);
        jframe.add(firstField);
        jframe.add(secondField);
        jframe.add(add);
        jframe.add(sub);
        jframe.add(mul);
        jframe.add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setLocation(550, 120);
        jframe.setVisible(true);
        jframe.setTitle("Basic Calculator");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        try{
            int num1 = Integer.parseInt(firstField.getText());
            int num2 = Integer.parseInt(secondField.getText());

            if(e.getSource() == add){
                result.setText(text+(num1+num2));
            }
            if(e.getSource() == sub){
                result.setText(text+(num1-num2));
            }
            if(e.getSource() == mul){
                result.setText(text+(num1*num2));
            }
            if(e.getSource() == div){
                result.setText(text+(num1/num2));
            }
        }
        catch(NumberFormatException e1){
            result.setText(text+"Enter numbers only");
        }
        catch(ArithmeticException e2){
            result.setText(text+"Cannot divide by 0");
        }
    }

    public static void main(String[] args) {
        new Swing_basicCalc();
    }
}
