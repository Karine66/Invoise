package com.mycompany.invoise.core.controller.repository.database;

import com.mycompany.invoise.core.controller.entity.Invoice;
import com.mycompany.invoise.core.controller.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {



    public void create(Invoice invoice) {
    System.out.println("Database : Invoice added with number"+ invoice.getNumber()+"for"+invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("Num_1");
        invoice1.setCustomerName("EDF");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber("Num_2");
        invoice2.setCustomerName("La Poste");
        return List.of(invoice1,invoice2);
    }
}
