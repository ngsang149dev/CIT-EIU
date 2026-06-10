package lab7.p5;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency("Muong 14");

        Observer email = new EmailSubcriber();
        Observer sms = new SMSSubscriber();

        agency.addObserver(email);
        agency.addObserver(sms);

        agency.publishNews("Breaking News!");
    }
}
