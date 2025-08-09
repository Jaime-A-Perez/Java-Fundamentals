package constantes;

public class Constants {
    public static void main(String[] arg) {
        int workDays = 10;
        workDays = 20;

        final double ANNUAL_INTEREST_RATE = 0.5;

        final double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);
        System.out.println("netSalary = " + netSalary);
    }
}
