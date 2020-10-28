package daiict.slop.email_notification.email_notification.controller;

import daiict.slop.email_notification.email_notification.dto.MailRequest;
import daiict.slop.email_notification.email_notification.dto.MailResponse;
import daiict.slop.email_notification.email_notification.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmailController {
    @Autowired
    public EmailService emailService;

    @PostMapping("/sendMail")
    public MailResponse sendEmail(@RequestBody MailRequest mailRequest) {
        Map<String, Object> model = new HashMap<>();
        model.put("Name", mailRequest.getName());
        model.put("location", "Ahmedabad Gujarat");
        return emailService.sendEmail(mailRequest, model);
    }
}
