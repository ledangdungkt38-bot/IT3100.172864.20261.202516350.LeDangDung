import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String choiceStr = JOptionPane.showInputDialog(null,
                "Choose equation type to solve:\n"
                + "1. First-degree equation with one variable (ax + b = 0)\n"
                + "2. System of first-degree equations with two variables\n"
                + "3. Second-degree equation with one variable (ax^2 + bx + c = 0)",
                "Equation Solver", JOptionPane.QUESTION_MESSAGE);

        if (choiceStr == null) System.exit(0);
        int choice = Integer.parseInt(choiceStr);

        switch (choice) {
            case 1:
                solveLinearEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            case 3:
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }

    // 1. ax + b = 0
    private static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Solution: x = " + x);
        }
    }

    // 2. a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2
    private static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Unique solution:\nx1 = " + x1 + "\nx2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        }
    }

    // 3. ax^2 + bx + c = 0
    private static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        if (a == 0) {
            // Degenerates to bx + c = 0
            if (b == 0) {
                JOptionPane.showMessageDialog(null, c == 0 ? "Infinitely many solutions." : "No solution.");
            } else {
                JOptionPane.showMessageDialog(null, "Linear equation solution: x = " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "The equation has no real roots.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Two distinct real roots:\nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
}