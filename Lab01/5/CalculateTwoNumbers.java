import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, 
                "Please input the first number: ", "Input First Number", 
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second number: ", "Input Second Number", 
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String strNotification = "First number: " + num1 + "\n"
                + "Second number: " + num2 + "\n"
                + "Sum: " + sum + "\n"
                + "Difference: " + difference + "\n"
                + "Product: " + product + "\n";

        if (num2 != 0) {
            double quotient = num1 / num2;
            strNotification += "Quotient: " + quotient;
        } else {
            strNotification += "Quotient: Division by zero is not allowed!";
        }

        JOptionPane.showMessageDialog(null, strNotification, 
                "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}