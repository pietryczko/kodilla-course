package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Test product");
        productDao.save(product);

        Invoice invoice = new Invoice("143256");
        Item item = new Item(new BigDecimal(100), 10, new BigDecimal(100));
        item.setProduct(product);
        item.setInvoice(invoice);

        //When
        invoice.getItems().add(item);
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        itemDao.deleteById(item.getId());
        invoiceDao.deleteById(invoiceId);
        productDao.deleteById(product.getId());
    }
}
