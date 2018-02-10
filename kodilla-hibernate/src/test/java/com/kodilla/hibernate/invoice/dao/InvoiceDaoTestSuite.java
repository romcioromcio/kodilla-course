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

import javax.persistence.Table;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemdao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product book = new Product("book");
        Product wine = new Product("wine");
        Product phone = new Product("phone");

        Item item1 = new Item(book, new BigDecimal(80),5, new BigDecimal(400));
        Item item2 = new Item(wine, new BigDecimal(25), 2, new BigDecimal(50));
        Item item3 = new Item(phone, new BigDecimal(500), 1, new BigDecimal(500));

        book.getItems().add(item1);
        wine.getItems().add(item2);
        phone.getItems().add(item3);

        item1.setProduct(book);
        item2.setProduct(wine);
        item3.setProduct(phone);

        Invoice invoice = new Invoice("560300200");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int size = invoice.getItems().size();

        //Then
        Assert.assertEquals(7, id);
        Assert.assertEquals(3, size);


        //Cleanup
        //try{
        //    invoiceDao.delete(invoice);
        //} catch (Exception e) {
        //    //do nothing
        //}

    }
}

