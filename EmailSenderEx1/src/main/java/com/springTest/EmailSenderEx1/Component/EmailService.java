package com.springTest.EmailSenderEx1.Component;

import com.springTest.EmailSenderEx1.beans.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    
    private final DataSource dataSource;
    
    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void sendMail() {
        System.out.println("Using DataSource: " + dataSource.getClass().getSimpleName());
        String[] emails = dataSource.getEmails();
        for (String email : emails) {
            System.out.println("Sending email to: " + email);
        }
    }


}
