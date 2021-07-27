package com.mycompany.invoise.core.controller.service.number;

import com.mycompany.invoise.core.controller.entity.Invoice;
import com.mycompany.invoise.core.controller.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.controller.service.InvoiceServiceInterface;

import java.util.List;

//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber = 0L;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }
}
