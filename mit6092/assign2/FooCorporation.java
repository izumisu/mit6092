public class FooCorporation {

    public static void calculatePay(double basePay, int workTime) {

        // Do the judge on basePay and workTime
        if (basePay < 8.00) {

            System.out.println("Error! Base pay is less than 8.00");
        } else if (workTime > 60) {

            System.out.println("Error! Work time is greater than 60");
        } else {

            int overtime = 0;
            if (workTime > 40) {

                overtime = workTime - 40;
                workTime = 40;
            }
            double fooPay = basePay * workTime;
            fooPay += overtime * basePay * 1.5;
            System.out.println("This money you get should be: " + fooPay);
        }
    }
    public static void main(String[] args) {

        // calculate the money they get
        calculatePay(7.50, 35);
        calculatePay(8.20, 47);
        calculatePay(10.00, 73);
    }
}
