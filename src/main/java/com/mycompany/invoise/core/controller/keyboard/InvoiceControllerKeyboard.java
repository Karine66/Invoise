package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.controller.entity.Invoice;
import com.mycompany.invoise.core.controller.service.InvoiceServiceInterface;

import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {
    public InvoiceServiceInterface invoiceService;
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }



    public void createInvoice() {
        System.out.println("What is customer name ?");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}
