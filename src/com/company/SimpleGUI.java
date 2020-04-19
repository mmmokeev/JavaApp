package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{

    //выделяем память под компоненты
    private JButton button = new JButton("Посчитать");
    private JLabel label = new JLabel("Доход:");
    private JLabel label1 = new JLabel("Еда:");
    private JLabel label2 = new JLabel("Тренировки:");
    private JLabel label3 = new JLabel("Квартплата:");
    private JLabel label4 = new JLabel("Сотик:");

    private JTextField[] input = new JTextField[5];


//    JButton[] but = new JButton[i];
//    but[i] = new JButton();
//for (int j = 0; j < i; j++){
//        but[j].setText(j);
//        Его надо заполнить данными:

//    private JTextField input = new JTextField("Введите сумму",2);
//    private JTextField input1 = new JTextField("Введите сумму",2);
//    private JTextField input2 = new JTextField("Введите сумму",2);




    //Конструктор класса
    public SimpleGUI (){
        super("Планирование бюджета");
        this.setBounds(800,400,550,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       // int x;
        //JTextField[] input = new JTextField[x];
        for (int x =0; x < input.length; x++)
            input[x] = new JTextField("", 2);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6,2,2,2));
        //добавляем компоненты на панель ( в контейнер)
        container.add(label);
        container.add(input[0]);
        container.add(label1);
        container.add(input[1]);
        container.add(label2);
        container.add(input[2]);
        container.add(label3);
        container.add(input[3]);
        container.add(label4);
        container.add(input[4]);

        //на кнопку вешаем слушатель и добавляем кнопку в контейнер
        button.addActionListener ( new ButtonEventListener());
        container.add(button);

    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
        //метод описывает действие при нажатии на кнопку
            int summa =0;

            for (int i =1; i<input.length; i++) {
                summa += Integer.parseInt(input[i].getText().toString());
                }


            String message = "";
            //message += input[0];
            message += "При доходе = " + Integer.parseInt(input[0].getText().toString()) + "\n";
            message += "Сумма расходов = " + summa + "\n";


           message += "Свободный остаток: "+ (Integer.parseInt(input[0].getText().toString())-summa) +"\n"+"\n";

           message += "Удачного месяца, бомжара ;)\n";
//            message += "Burtton wasPressed\n";
//            message += "Text is " + input.getText() + "\n";
//            message += (radio_1.isSelected() ? "Radio#1" : "Radio#2" ) + "is selected!\n";
//            message += "CheckBox is " + ((check.isSelected()) ? "checked" : "unchecked\n");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);


        }
    }

}