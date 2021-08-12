package com.mycompany.invoise.core.controller.service.number;

import com.mycompany.invoise.core.controller.CustomerRepositoryInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.controller.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.controller.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;
    @Autowired
    private CustomerRepositoryInterface customerRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    @Transactional
    public Invoice createInvoice(Invoice invoice){
        customerRepository.save(invoice.getCustomer());
        return invoiceRepository.save(invoice);
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }
}
