package com.artfactory.project01.todayart;

import com.artfactory.project01.todayart.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class TodayartApplication implements ApplicationRunner {
public class TodayartApplication {
    @Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(TodayartApplication.class, args);
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Mail mail = new Mail();
//
//        mail.setFrom("bit.todayart@gmail.com");
//        mail.setTo("zxcvbnm1436@naver.com");
//        mail.setSubject("테스트 메일입니다.");
//        mail.setContent("테스트 콘텐츠입니다.");
//
//        emailService.sendSimpleMessage(mail);
//    }
}
