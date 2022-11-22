package ru.miet.testing.presenter;

import ru.miet.testing.model.Calculator;
import ru.miet.testing.model.ICalculator;
import ru.miet.testing.view.ICalculatorView;

public class CalculatorPresenter implements ICalculatorPresenter{
    private ICalculatorView calculatorView;
    private ICalculator calculator;

    public CalculatorPresenter(ICalculatorView calculatorView, Calculator calculator) {
        this.calculatorView = calculatorView;
        this.calculator = calculator;
    }
    @Override
    public void onPlusClicked() {
        double result, firstValue, secondValue;
        try {
            firstValue = Double.parseDouble(calculatorView.getFirstArgumentAsString());
            secondValue = Double.parseDouble(calculatorView.getSecondArgumentAsString());
            result = calculator.sum(firstValue, secondValue);
            calculatorView.printResult(result);
        }
        catch (Exception e) {
            calculatorView.displayError("Exception. Try again");
        }
    }

    @Override
    public void onMinusClicked() {
        double result, firstValue, secondValue;
        try {
            firstValue = Double.parseDouble(calculatorView.getFirstArgumentAsString());
            secondValue = Double.parseDouble(calculatorView.getSecondArgumentAsString());
            result = calculator.subtract(firstValue, secondValue);
            calculatorView.printResult(result);
        }
        catch (Exception e) {
            calculatorView.displayError("Exception. Try again");
        }
    }

    @Override
    public void onDivideClicked() {
        double result, firstValue, secondValue;
        try {
            firstValue = Double.parseDouble(calculatorView.getFirstArgumentAsString());
            secondValue = Double.parseDouble(calculatorView.getSecondArgumentAsString());
            result = calculator.divide(firstValue, secondValue);
            calculatorView.printResult(result);
        }
        catch (ArithmeticException exception) {
            calculatorView.displayError("Exception. Divide 0");
        }
        catch (Exception exception) {
            calculatorView.displayError("Exception. Try again");
        }
    }

    @Override
    public void onMultiplyClicked() {
        double result, firstValue, secondValue;
        try {
            firstValue = Double.parseDouble(calculatorView.getFirstArgumentAsString());
            secondValue = Double.parseDouble(calculatorView.getSecondArgumentAsString());
            result = calculator.multiply(firstValue, secondValue);
            calculatorView.printResult(result);
        }
        catch (Exception e) {
            calculatorView.displayError("Exception. Try again");
        }
    }
}
