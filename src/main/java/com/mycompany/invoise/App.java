package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.prefix.InvoiceServicePrefixe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
//Usefull with SpringBoot if the class name is application.properties, SpringBoot automatically recognize
//@PropertySource("classpath:application.properties")
public class App {
    public static void main(String[] args) {

//       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class, args);
       InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);
        invoiceController.createInvoice();
    }

}
