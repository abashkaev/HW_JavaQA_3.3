public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditPercent = 18.9; //Процентная ставка
        int termCredit = 60; //Срок кредита в месяц
        double amountCredit = 1000000; // Сумма кредита

        double paymentPerMount = service.calculate(creditPercent, termCredit, amountCredit);
        System.out.println(String.format("%.2f", paymentPerMount));

        double paymentPerMount36 = service.calculate(9.99, 36, 1_000_000);
        System.out.println(String.format("%.2f", paymentPerMount36));

        double paymentPerMount24 = service.calculate(9.99, 24, 1_000_000);
        System.out.println(String.format("%.2f", paymentPerMount24));

        double paymentPerMount12 = service.calculate(9.99, 12, 1_000_000);
        System.out.println(String.format("%.2f", paymentPerMount12));


    }
}
