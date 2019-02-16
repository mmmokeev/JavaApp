//package com.company;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Gui_old {
//}
//
//
//
//
//public class SimpleGUI extends JFrame {
//    private JButton button = new JButton("Посчитать");
//
//
//
//
//
//
////    JButton[] but = new JButton[i];
////    but[i] = new JButton();
////for (int j = 0; j < i; j++){
////        but[j].setText(j);
////        Его надо заполнить данными:
//
////    private JTextField input = new JTextField("Введите сумму",2);
////    private JTextField input1 = new JTextField("Введите сумму",2);
////    private JTextField input2 = new JTextField("Введите сумму",2);
//
//    private JLabel label = new JLabel("Доход:");
//    private JLabel label1 = new JLabel("Еда:");
//    private JLabel label2 = new JLabel("Тренировки:");
//
//    private JRadioButton radio_1 = new JRadioButton("Select");
//    private JRadioButton radio_2 = new JRadioButton("Select");
//    private JCheckBox check = new JCheckBox("Chexk", false);
//
//    public SimpleGUI (){
//        super("Simple Example");
//        this.setBounds(800,400,550,400);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//        int x=0;
//        JTextField[] input = new JTextField[x];
//        for (x =0; x < input.length; x++)
//            input[x] = new JTextField("l", 2);
//
//        Container container = this.getContentPane();
//        container.setLayout(new GridLayout(5,2,2,2));
//        container.add(label);
//        container.add(input[0]);
////        container.add(label1);
////        container.add(input1);
////        container.add(label2);
////        container.add(input2);
//
////        ButtonGroup group = new ButtonGroup();
////        group.add(radio_1);
////        group.add(radio_2);
////        container.add(radio_1);
////        radio_1.setSelected(true);
////        container.add(radio_2);
////        container.add(check);
//        button.addActionListener ( new ButtonEventListener());
//        container.add(button);
//
//    }
//    class ButtonEventListener implements ActionListener {
//        public void actionPerformed(ActionEvent e){
//
//
//
//
//
//            String message = "";
//            int summa=0;
////            for (int i =0; i<1; i++)
//            summa = Integer.parseInt(input[0].getText().toString());
//
//            message += "Остаток: "+ (Integer.parseInt(input[0].getText().toString())-summa) +"\n";
////            message += "Burtton wasPressed\n";
////            message += "Text is " + input.getText() + "\n";
////            message += (radio_1.isSelected() ? "Radio#1" : "Radio#2" ) + "is selected!\n";
////            message += "CheckBox is " + ((check.isSelected()) ? "checked" : "unchecked\n");
//            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
//
//
//        }
//    }
//}
