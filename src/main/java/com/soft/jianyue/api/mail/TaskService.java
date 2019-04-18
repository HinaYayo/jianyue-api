package com.soft.jianyue.api.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
//@Async
public class TaskService {
    @Autowired
    private MailService mailService;

    @Scheduled(cron = "0 50 13 * * ?")
    public void proces(){
        mailService.sendMail("1601764856@qq.com","王聪的定时邮件","曾经沧海难为水");
        System.out.println("111");
    }
}
