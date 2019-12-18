package Control;

import View.*;
import Model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class control {
        private view myView;
        private model myModel;

    class CalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int input1, input2 = 0;
            try {
                input1 = myView.getInput1();
                input2 = myView.getInput2();
                myModel.addTwoInputs(input1, input2);
                myView.setCalSolution(myModel.getCalValue());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                myView.ErrorMessage("Requires 2 Integers (i.e., '1' or '2')");
            }
        }
    }

        public control(view myView, model myModel) {
            this.myView = myView;
            this.myModel = myModel;
            this.myView.addCalListener(new CalListener());
        }
}
