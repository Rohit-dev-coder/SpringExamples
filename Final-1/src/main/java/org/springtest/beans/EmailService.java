package org.springtest.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private DataSource ds;

    public EmailService(@Qualifier("fileDataSource") DataSource ds) {
        this.ds = ds;
    }

    public void sendEmail() {
        System.out.println("Sending mails using " + ds.getClass().getName());
        String[] emails = ds.getEmails();
        for (String email : emails) {
            System.out.println("Sending mail to:" + email);
        }
    }
}
