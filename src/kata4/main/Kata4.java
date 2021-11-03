package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    
    private static String fileName;
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    private static HistogramDisplay histoDisplay;

    public static void main(String[] args) {
        fileName = "email.txt";
        execute();
    }
    
    private static void execute() {
        input();
        process();
        output();
        histoDisplay.execute();
    }
    
    private static void input() {
        mailList = new MailListReader().read(fileName);
    }
    
    private static void process() {
        histogram = new MailHistogramBuilder().build(mailList);
    }

    private static void output() {
        histoDisplay = new HistogramDisplay(histogram);
    }
}
