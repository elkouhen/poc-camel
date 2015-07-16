package com.mycompany.elkouhen.app;

import lombok.extern.log4j.Log4j;
import org.apache.camel.spring.Main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j
public class App {
    public static void main(String[] args) throws Exception {

        Main main = new Main();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "com.mycompany");
        main.setApplicationContext(ctx);

        main.enableHangupSupport();
        main.enableTrace();

        main.run();
    }
}
