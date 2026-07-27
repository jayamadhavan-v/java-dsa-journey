package QSpider_Tasks.hotel;

import java.util.Scanner;

public class Hotel {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Hotel htl = new Hotel();

        htl.hotel();
    }

    public void hotel() throws Exception {

        boolean flag = true;
        System.out.println("\t\t Welcome to the Hotel");
        Thread.sleep(200);
        do {
            System.out.println("List Of Hotels");
            Thread.sleep(800);
            System.out.println("1.buhari");
            Thread.sleep(500);
            System.out.println("2.A2B");
            Thread.sleep(500);
            System.out.println("3.Exit");
            Thread.sleep(400);
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            // list of hotel
            switch (choice) {
                case 1 -> {
                    System.out.println("\t\t Welcome to the Hotel Buhari");
                    Thread.sleep(1000);
                    System.out.println(" Hotel Menu Card ");
                    Thread.sleep(1000);

                    System.out.println("1.Idly ");
                    Thread.sleep(500);
                    System.out.println("2.Upma");
                    Thread.sleep(500);
                    System.out.println("3.Pullav");
                    Thread.sleep(500);
                    System.out.println("4.Exit");
                    Thread.sleep(500);
                    System.out.print("Enter your choice: ");
                    int menuChoice = sc.nextInt();
                    switch (menuChoice) {
                        case 1 -> {
                            Thread.sleep(1200);
                            System.out.println("\t\tselected Item Idly");
                            double price = 20.0;
                            Thread.sleep(600);
                            System.out.println("\t\t price  : " + price);
                            Thread.sleep(600);
                            System.out.print("Enter the Number of Quantity : ");
                            int quantity = sc.nextInt();
                            Thread.sleep(200);
                            System.out.println("Redirecting  to the Payment page ");
                            Thread.sleep(1000);
                            boolean pymnt = payment(quantity, price, "Idly");
                            if (pymnt) {
                                System.out.println("Thank you come Again ");
                                Thread.sleep(1200);
                                return;
                            }
                        }
                        case 2 -> {
                            Thread.sleep(2000);
                            System.out.println("\t\tselected Item Upma");
                            double price = 20.0;
                            System.out.println("\t\t price  : " + price);
                            System.out.print("Enter the Number of Quantity : ");
                            int quantity = sc.nextInt();
                            System.out.println("Redirecting  to the Payment page ");
                            Thread.sleep(2000);
                            boolean pymnt = payment(quantity, price, "Idly");
                            if (pymnt) {
                                System.out.println("Thank you come Again ");
                                Thread.sleep(1200);
                                return;
                            }
                        }
                        case 3 -> {
                            Thread.sleep(2000);
                            System.out.println("\t\tselected Item Pullav");
                            double price = 20.0;
                            System.out.println("\t\t price  : " + price);
                            System.out.print("Enter the Number of Quantity : ");
                            int quantity = sc.nextInt();
                            System.out.println("Redirecting  to the Payment page ");
                            Thread.sleep(2000);
                            boolean pymnt = payment(quantity, price, "Idly");
                            if (pymnt) {
                                System.out.println("Thank you come Again ");
                                Thread.sleep(1200);
                                return;
                            }
                        }
                        case 4 -> {
                            Thread.sleep(300);
                            System.out.println("\t\tReturning to Hotel Page * * * * * ");
                            Thread.sleep(1500);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("\t\t Welcome to the Hotel A2B");
                    Thread.sleep(1000);
                    System.out.println(" Hotel Menu Card ");
                    Thread.sleep(1000);

                    System.out.println("1.Briyani ");
                    Thread.sleep(500);
                    System.out.println("2.chicken-65");
                    Thread.sleep(500);
                    System.out.println("3.Ghree Rice");
                    Thread.sleep(500);
                    System.out.println("4.Exit");

                    System.out.print("Enter your choice: ");
                    int menuChoice = sc.nextInt();
                    switch (menuChoice) {
                        case 1 -> {
                            Thread.sleep(1200);
                            System.out.println("\t\tselected Item Briyani");
                            double price = 20.0;
                            Thread.sleep(600);
                            System.out.println("\t\t price  : " + price);
                            Thread.sleep(600);
                            System.out.print("Enter the Number of Quantity : ");
                            int quantity = sc.nextInt();
                            Thread.sleep(200);
                            System.out.println("Redirecting  to the Payment page ");
                            Thread.sleep(1000);
                            boolean pymnt = payment(quantity, price, "Briyani");
                            if (pymnt) {
                                System.out.println("Thank you come Again ");
                                Thread.sleep(1200);
                                return;
                            }

                        }
                        case 2 -> {
                            Thread.sleep(1200);
                            System.out.println("\t\tselected Item chicken-65");
                            double price = 20.0;
                            Thread.sleep(600);
                            System.out.println("\t\t price  : " + price);
                            Thread.sleep(600);
                            System.out.print("Enter the Number of Quantity : ");
                            int quantity = sc.nextInt();
                            Thread.sleep(200);
                            System.out.println("Redirecting  to the Payment page ");
                            Thread.sleep(1000);
                            boolean pymnt = payment(quantity, price, "chicken-65");
                            if (pymnt) {
                                System.out.println("Thank you come Again ");
                                Thread.sleep(1200);
                                return;
                            }
                        }
                        case 3 -> {
                            Thread.sleep(1200);
                            System.out.println("\t\tselected Item Ghree Rice");
                            double price = 20.0;
                            Thread.sleep(600);
                            System.out.println("\t\t price  : " + price);
                            Thread.sleep(600);
                            System.out.print("Enter the Number of Quantity : ");
                            int quantity = sc.nextInt();
                            Thread.sleep(200);
                            System.out.println("Redirecting  to the Payment page ");
                            Thread.sleep(1000);
                            boolean pymnt = payment(quantity, price, "Ghree Rice");
                            if (pymnt) {
                                System.out.println("Thank you come Again ");
                                Thread.sleep(1200);
                                return;
                            }
                        }
                        case 4 -> {
                            Thread.sleep(300);
                            System.out.println("\t\tReturning to Hotel Page * * * * * ");
                            Thread.sleep(1500);
                        }
                    }
                }
                case 3 -> {
                    Thread.sleep(2000);
                    flag = false;
                }
            }
        } while (flag);
        System.out.println("Thank you come Again ");
    }

    public static boolean payment(int Quantity, double price, String Item) throws Exception {


            System.out.println("\t\t Welcome to the Payment page ");
            Thread.sleep(500);
            System.out.println("\t\tBill Amount : " + Quantity * price);
            Thread.sleep(500);
            System.out.println("PayMent Choice ");
            Thread.sleep(300);
            System.out.println("*******************");
            Thread.sleep(500);

            System.out.println("1.Gpay");
            Thread.sleep(500);
            System.out.println("2.Phonepe");
            Thread.sleep(500);
            System.out.println("3.paytm");
            Thread.sleep(500);
            System.out.println("4.Cash");
            Thread.sleep(500);
            System.out.println("5.Cancel Order");
            Thread.sleep(500);
            System.out.print("Enter your choice : ");

            int paymentChoice = sc.nextInt();
            switch (paymentChoice) {
                case 1 -> {
                    System.out.println("selected Payment Choice GPay");
                    Thread.sleep(400);
                    System.out.print("Enter the Bill Amount and Complete the Payment : ");
                    int billAmount = sc.nextInt();

                    if (billAmount == (int) Quantity * price) {
                        System.out.println("payment completed Successfully");
                        return true;
                    } else {
                        System.out.println("Invalid Bill Amount");
                        Thread.sleep(400);

                    }
                }
                case 2 -> {
                    System.out.println("selected Payment Choice Phonepe");
                    Thread.sleep(400);
                    System.out.print("Enter the Bill Amount and Complete the Payment : ");
                    int billAmount = sc.nextInt();

                    if (billAmount == (int) Quantity * price) {
                        System.out.println("payment completed Successfully");
                        return true;
                    } else {
                        System.out.println("Invalid Bill Amount");
                        Thread.sleep(400);

                    }
                }
                case 3 -> {
                    System.out.println("selected Payment Choice paytm");
                    Thread.sleep(400);
                    System.out.print("Enter the Bill Amount and Complete the Payment : ");
                    int billAmount = sc.nextInt();

                    if (billAmount == (int) Quantity * price) {
                        System.out.println("payment completed Successfully");
                        return true;
                    } else {
                        System.out.println("Invalid Bill Amount");
                        Thread.sleep(400);

                    }
                }
                case 4 -> {
                    System.out.println("selected Payment Choice Cash");
                    Thread.sleep(400);
                    System.out.print("Enter the Bill Amount and Complete the Payment : ");
                    int billAmount = sc.nextInt();

                    if (billAmount == (int) Quantity * price) {
                        System.out.println("payment completed Successfully");
                        return true;
                    } else {
                        System.out.println("Invalid Bill Amount");
                        Thread.sleep(400);

                    }
                }
                case 5 -> {
                    Thread.sleep(1200);
                    return false;
                }
            }

        return false;
    }

}