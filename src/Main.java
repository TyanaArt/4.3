public class Main {

    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        int a = 1000000;
        double b = 0.0999 / 12;
        int c = 12;

        double index = payment.calculate(a, b, c);
        System.out.printf("Ежемесячный платеж составит: " + "%.0f", index);
        System.out.println();

        int a1 = 1000000;
        double b1 = 0.0999 / 12;
        int c1 = 24;

        double index1 = payment.calculate(a1, b1, c1);
        System.out.printf("Ежемесячный платеж составит: " + "%.0f", index1);
        System.out.println();

        int a2 = 1000000;
        double b2 = 0.0999 / 12;
        int c2 = 36;

        double index2 = payment.calculate(a2, b2, c2);
        System.out.printf("Ежемесячный платеж составит: " + "%.0f", index2);
        System.out.println();




    }
}
