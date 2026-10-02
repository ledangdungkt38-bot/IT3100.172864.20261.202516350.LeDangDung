import java.util.Scanner;

public class DaysOfMonth {

    public static int parseMonth(String input) {
        input = input.trim().toLowerCase();
        switch (input) {
            case "january": case "jan.": case "jan": case "1":
                return 1;
            case "february": case "feb.": case "feb": case "2":
                return 2;
            case "march": case "mar.": case "mar": case "3":
                return 3;
            case "april": case "apr.": case "apr": case "4":
                return 4;
            case "may": case "5":
                return 5;
            case "june": case "jun.": case "jun": case "6":
                return 6;
            case "july": case "jul.": case "jul": case "7":
                return 7;
            case "august": case "aug.": case "aug": case "8":
                return 8;
            case "september": case "sept.": case "sep": case "9":
                return 9;
            case "october": case "oct.": case "oct": case "10":
                return 10;
            case "november": case "nov.": case "nov": case "11":
                return 11;
            case "december": case "dec.": case "dec": case "12":
                return 12;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = -1;
        int year = -1;

        while (true) {
            System.out.print("Enter month (e.g., January, Jan., Jan, or 1): ");
            String monthInput = scanner.nextLine();
            month = parseMonth(monthInput);

            System.out.print("Enter year (non-negative integer): ");
            String yearInput = scanner.nextLine();

            try {
                year = Integer.parseInt(yearInput.trim());
                if (year < 0) {
                    year = -1;
                }
            } catch (NumberFormatException e) {
                year = -1;
            }

            if (month != -1 && year != -1) {
                break;
            }

            System.out.println("Invalid month or year entered! Please try again.\n");
        }

        int days;
        switch (month) {
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }

        System.out.println("Number of days in month " + month + " of year " + year + ": " + days);
        scanner.close();
    }
}