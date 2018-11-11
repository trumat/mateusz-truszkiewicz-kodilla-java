package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product cup = new Product("Cup");
        Product glass = new Product("Glass");
        Product plate = new Product("Plate");

        Invoice invoice = new Invoice("2018-1");

        Item item1 = new Item(cup, new BigDecimal(6.5), 3, new BigDecimal(3), invoice);
        Item item2 = new Item(glass, new BigDecimal(5), 6, new BigDecimal(2.5), invoice);
        Item item3 = new Item(plate, new BigDecimal(4), 2, new BigDecimal(2), invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
