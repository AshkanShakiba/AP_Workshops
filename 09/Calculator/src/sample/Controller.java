package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    private double firstNumber;
    private double secondNumber;
    private char operation=' ';

    private double getInput(){
        return Double.parseDouble(textField.getText());
    }
    private void setInput(String number){
        String input=textField.getText();
        if(input.equals("0"))
            input=number;
        else
            input+=number;
        textField.setText(input);
    }
    private void reset(){
        textField.setText("0");
    }
    public void C(){
        textField.setText("0");
        operation=' ';
    }
    public void addition(){
        firstNumber=getInput();
        operation='+';
        reset();
    }
    public void subtraction(){
        firstNumber=getInput();
        operation='-';
        reset();
    }
    public void multiplication(){
        firstNumber=getInput();
        operation='*';
        reset();
    }
    public void division(){
        firstNumber=getInput();
        operation='/';
        reset();
    }
    public void calculate(){
        double result;
        String resultStr;
        secondNumber=getInput();
        switch (operation){
            case '+':
                result=firstNumber+secondNumber;
                break;
            case '-':
                result=firstNumber-secondNumber;
                break;
            case '*':
                result=firstNumber*secondNumber;
                break;
            case '/':
                result=firstNumber/secondNumber;
                break;
            default:
                result=0;
        }
        resultStr=result+"";
        if((int)result==result)
            resultStr=resultStr.substring(0,resultStr.length()-2);
        textField.setText(resultStr);
        operation=' ';
    }
    public void point(){
        setInput(".");
    }
    public void zero(){
        setInput("0");
    }
    public void one(){
        setInput("1");
    }
    public void two(){
        setInput("2");
    }
    public void three(){
        setInput("3");
    }
    public void four(){
        setInput("4");
    }
    public void five(){
        setInput("5");
    }
    public void six(){
        setInput("6");
    }
    public void seven(){
        setInput("7");
    }
    public void eight(){
        setInput("8");
    }
    public void nine(){
        setInput("9");
    }
}