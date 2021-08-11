package com.mycompany.invoise.core.controller.service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.controller.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    Iterable<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
