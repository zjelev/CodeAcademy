import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which task would you like to run? ");
        int taskNum = scan.nextInt();

        switch (taskNum) {
            case 1:
                double length = scan.nextDouble();
                double width = scan.nextDouble();
                double perimeter = (length + width) * 2;
                double area = length * width;
                String form = "Rectangle";
                if (length <= 0 || width <= 0) {
                    System.out.println("Not valid");
                } else {
                    if (length == width) {
                        form = "Square";
                    }
                    System.out.printf("%s with perimeter %.2f and area %.2f", form, perimeter, area);
                }
                break;

            case 2:
                enum WeekDays {
                    Mon,
                    Tue,
                    Wed,
                    Thu,
                    Fri,
                    Sat,
                    Sun
                }
                System.out.print("Input day number: ");
                int day = scan.nextInt();
                switch (day) {
                    case 1:
                        System.out.println(WeekDays.Mon);
                        break;
                    case 2:
                        System.out.println(WeekDays.Tue);
                        break;
                    case 3:
                        System.out.println(WeekDays.Wed);
                        break;
                    case 4:
                        System.out.println(WeekDays.Thu);
                        break;
                    case 5:
                        System.out.println(WeekDays.Fri);
                        break;
                    case 6:
                        System.out.println(WeekDays.Sat);
                    case 7:
                        System.out.println(WeekDays.Sun);
                        break;
                    default:
                        break;
                }
                System.out.println(WeekDays.Fri);
                break;

            case 3:
                double budget = 20;
                double priceTomatoKg = 7;
                double priceCucumberKg = 6;
                double pricePepperKg = 5;
                double priceOnionKg = 3;
                double priceCheeseKg = 15;
                double ratioTomato = 0.4;
                double ratioCucubmer = 0.2;
                double ratioPepper = 0.2;
                double ratioOnion = 0.1;
                double ratioCheese = 0.1;
                double salataPricePerKg = priceTomatoKg + ratioTomato + priceCucumberKg * ratioCucubmer +
                        pricePepperKg * ratioPepper + priceOnionKg * ratioOnion + priceCheeseKg * ratioCheese;
                double quantity = budget / salataPricePerKg;
                System.out.printf("With %.2f leva you can make %.2f kg salata.", budget, quantity);
                break;

            case 4:
                double pricePensioner = 0.9;
                double priceStudent = 0.7;
                double pricePupil = 0.5;
                double priceChild = 0;
                System.out.print("Enter regular ticket price: ");
                double ticketPrice = scan.nextDouble();
                if (ticketPrice > 0 ) {
                    double totalAmount = ticketPrice * (2 * pricePensioner + 1 * 2 + 1 * priceStudent + 2 * pricePupil);
                    System.out.printf("The total amount is %.2f", totalAmount);
                } else {
                    System.out.println("Price should be positive.");
                }

                break;

            case 5:
                Date date = new Date();
                System.out.println(date.toString());
                String format = "E, dd-MMM-yyyy HH:mm:ss";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                System.out.println(simpleDateFormat.format(date));
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(format)));
                break;

            default:
                break;
        }
    }
}
