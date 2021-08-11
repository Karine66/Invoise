package com.mycompany.invoise.core.controller.repository.database;

import com.mycompany.invoise.core.entity.Invoice;

//@Repository
//public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    //for create 1 invoice
//    public Invoice create(Invoice invoice) {
//
//        KeyHolder kh=new GeneratedKeyHolder();
//
//        jdbcTemplate.update(connection -> {
//            PreparedStatement ps = connection.prepareStatement("INSERT INTO INVOICE(CUSTOMER_NAME,ORDER_NUMBER) VALUES (?,?)",
//                    Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1,invoice.getCustomerName());
//            ps.setString(2,invoice.getOrderNumber());
//            return ps;
//        },kh);
//        invoice.setNumber(kh.getKey().toString());
//        return invoice;
//    }
//    //for retrieve list of invoices
//    @Override
//    public List<Invoice> list() {
//        return jdbcTemplate.query("SELECT INVOICE_NUMBER, CUSTOMER_NAME FROM INVOICE",
//                (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
//                        rs.getString("CUSTOMER_NAME")));
//    }
//
//    //for retrieve détails of 1 invoice
//    @Override
//    public Invoice getById(String number) {
//        return jdbcTemplate.queryForObject("SELECT INVOICE_NUMBER, CUSTOMER_NAME,ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER=?",
//                new Object[] {number},
//                        (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
//                                rs.getString("CUSTOMER_NAME"), rs.getString("ORDER_NUMBER")));
//    }
//}
