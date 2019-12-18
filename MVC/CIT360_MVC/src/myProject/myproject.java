package myProject;
//site works for entire MVC project:
//https://www.javaguides.net/2018/11/spring-mvc-5-hibernate-5-jsp-mysql-crud-tutorial.html
//https://www.javaguides.net/2019/12/spring-mvc-tutorial-for-beginners.html
//https://examples.javacodegeeks.com/desktop-java/swing/java-swing-form-example/
//https://docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html
import Model.*;
import View.*;
import Control.*;
public class myproject {
    public static void main(String[] args) {
        view myView = new view();
        model myModel = new model();
        control myController = new control(myView,myModel);
        myView.setVisible(true);
    }
}
