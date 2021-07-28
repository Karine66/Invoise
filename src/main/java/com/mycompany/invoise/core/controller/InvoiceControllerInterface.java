package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.controller.entity.Invoice;
import com.mycompany.invoise.core.controller.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
   String createInvoice(Invoice invoice);
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
