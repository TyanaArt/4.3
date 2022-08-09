public class CreditPaymentService {

    public double calculate(int a, double b, int c) {
        double sum = 1 + b;

        Math.pow(sum, c);
        double payment = a * ((b * Math.pow(sum, c)) / (Math.pow(sum, c) - 1));
        return payment;
    }

    // a сумма кредита
    // b процентная ставка
    // c количество месяцев
    // payment ежемес.платеж

}
