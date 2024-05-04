package View;
import Controller.RiderController;
import Model.Rider;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RiderView extends JFrame  {
    private JTextField textRiderName;
    private JTextField textCountry;
    private JTextField textWeight;
    private JTextField textHeight;
    private JTextField textSearchByRiderName;
    private JTextField textOlympicMedals;
    private JTextField textTopSpeed;
    private JTextField textMedals;
    private JButton btnAddRider;
    private JButton btnCalculater;
    private JButton btnSearch;
    private JPanel rootPane;

    Rider rider;
    Rider.Records records;
    RiderController controller;

    public RiderView() {
        btnAddRider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String Name = textRiderName.getText();
              String Country=textCountry.getText();
              float Weight=Float.parseFloat(textWeight.getText());
              float Height=Float.parseFloat(textHeight.getText());

              int medals=Integer.parseInt(textOlympicMedals.getText());
              float topSpeed=Float.parseFloat(textTopSpeed.getText());
              int national =Integer.parseInt(textMedals.getText());

              controller =new  RiderController();
              rider = controller.addRider( Name,  Country, Weight,Height);


              JOptionPane.showMessageDialog(rootPane, "Rider Added Successfully","Sucess",0);

            }
        });
        btnCalculater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float Weight=Float.parseFloat(textWeight.getText());
                double  Height=Float.parseFloat(textHeight.getText());
                JOptionPane.showMessageDialog(rootPane, "Your BMI: " + rider.calBMI(Weight, Height), "Success", JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }
    private void createUIComponents() {

    }
    public static void main(String[] args) {
        RiderView riderView= new RiderView();
        riderView.setContentPane(riderView.rootPane);
        riderView.setTitle("Bicycle Manager");
        riderView.setSize(600,600);
        riderView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        riderView.setVisible(true);
    }
}
