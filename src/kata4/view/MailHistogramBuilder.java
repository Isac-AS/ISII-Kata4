package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    
    public Histogram<String> build (List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
