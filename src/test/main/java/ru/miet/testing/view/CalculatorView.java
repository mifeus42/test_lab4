package ru.miet.testing.view;

import ru.miet.testing.model.Calculator;
import ru.miet.testing.presenter.CalculatorPresenter;
import ru.miet.testing.presenter.ICalculatorPresenter;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame implements ICalculatorView {
    private ICalculatorPresenter calculatorPresenter;

    private JTextField resultField;
    private JTextField firstValueField;
    private JTextField secondValueField;

    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;

    public CalculatorView() {
        calculatorPresenter = new CalculatorPresenter(this, new Calculator());
        createGUI();
    }

    private void createGUI() {
        JPanel mainPanel = new JPanel(new GridLayout(3,1,0,20));

        JPanel resultPanel = new JPanel(new GridLayout(2,1,0,0));
        resultField = new JTextField();
        resultField.setName("resultField");
        resultField.setEnabled(false);
        resultPanel.add(new JLabel("Result"));
        resultPanel.add(resultField);

        JPanel valuePanel = new JPanel(new GridLayout(4,1,0,0));
        firstValueField = new JTextField();
        firstValueField.setName("firstValueField");
        secondValueField = new JTextField();
        secondValueField.setName("secondValueField");

        valuePanel.add(new JLabel("First Value"));
        valuePanel.add(firstValueField);
        valuePanel.add(new JLabel("Second Value"));
        valuePanel.add(secondValueField);

        JPanel operationsPanel = new JPanel(new GridLayout(2,2,5,5));

        plusButton = new JButton("+");
        plusButton.setName("plusButton");
        plusButton.addActionListener(e -> {
            calculatorPresenter.onPlusClicked();
        });
        minusButton = new JButton("-");
        minusButton.setName("minusButton");
        minusButton.addActionListener(e -> {
            calculatorPresenter.onMinusClicked();
        });
        multiplyButton = new JButton("*");
        multiplyButton.setName("multiplyButton");
        multiplyButton.addActionListener(e -> {
            calculatorPresenter.onMultiplyClicked();
        });
        divideButton = new JButton("/");
        divideButton.setName("divideButton");
        divideButton.addActionListener(e -> {
            calculatorPresenter.onDivideClicked();
        });

        operationsPanel.add(plusButton);
        operationsPanel.add(minusButton);
        operationsPanel.add(multiplyButton);
        operationsPanel.add(divideButton);

        mainPanel.add(resultPanel);
        mainPanel.add(valuePanel);
        mainPanel.add(operationsPanel);


        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300,300);
        setResizable(false);
        setTitle("Calculator");
        setVisible(true);
    }

    public void setCalculatorPresenter(ICalculatorPresenter calculatorPresenter) {
        this.calculatorPresenter = calculatorPresenter;
    }

    @Override
    public void printResult(double result) {
        resultField.setText(String.valueOf(result));
    }

    @Override
    public void displayError(String message) {
        resultField.setText(message);
    }

    @Override
    public String getFirstArgumentAsString() {
        return firstValueField.getText();
    }

    @Override
    public String getSecondArgumentAsString() {
        return secondValueField.getText();
    }
}
