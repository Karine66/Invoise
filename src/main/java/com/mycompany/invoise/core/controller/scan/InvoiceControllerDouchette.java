package com.mycompany.invoise.core.controller.scan;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.controller.entity.Invoice;
import com.mycompany.invoise.core.controller.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    public InvoiceServiceInterface invoiceService;
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoice() {
    System.out.println("Usage of the scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Virgin Galactic");
        invoiceService.createInvoice(invoice);
    }
}
