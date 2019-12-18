package View;

import java.awt.event.ActionListener;
import javax.swing.*;

public class view extends JFrame{
    private JLabel instructLabel = new JLabel("Enter your first and second numbers. Then click Calculate to add the numbers:               ", 2);
    private JTextField input1  = new JTextField(11);
    private JLabel additionLabel = new JLabel("+");
    private JTextField input2 = new JTextField(11);
    private JButton calButton = new JButton("Calculate");
    private JTextField calSolution = new JTextField(11);
    public view(){
        JPanel calPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calPanel.add(instructLabel);
        calPanel.add(input1);
        calPanel.add(additionLabel);
        calPanel.add(input2);
        calPanel.add(calButton);
        calPanel.add(calSolution);
        this.add(calPanel);
    }
    public int getInput1(){
        return Integer.parseInt(input1.getText());
    }
    public int getInput2(){
        return Integer.parseInt(input2.getText());
    }
    public void setCalSolution(int solution){
        calSolution.setText(Integer.toString(solution));
    }
    public void addCalListener(ActionListener Button){
        calButton.addActionListener(Button);
    }
    public void ErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}