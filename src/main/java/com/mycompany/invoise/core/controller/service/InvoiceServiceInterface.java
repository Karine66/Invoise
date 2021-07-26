package com.mycompany.invoise.core.controller.service;

import com.mycompany.invoise.core.controller.entity.Invoice;
import com.mycompany.invoise.core.controller.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);
    List<Invoice> getInvoiceList();
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
