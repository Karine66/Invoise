package com.mycompany.invoise.core.controller.repository;

import com.mycompany.invoise.core.controller.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    Invoice create (Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
}
