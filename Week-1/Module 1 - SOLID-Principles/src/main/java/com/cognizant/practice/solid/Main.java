package com.cognizant.practice.solid;

import com.cognizant.practice.solid.srp.*;
import com.cognizant.practice.solid.ocp.*;
import com.cognizant.practice.solid.lsp.*;
import com.cognizant.practice.solid.isp.*;
import com.cognizant.practice.solid.dip.*;

public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        inv.addItem(new Item("Pen", 10));
        inv.addItem(new Item("Book", 50));
        InvoicePrinter p = new InvoicePrinter();
        p.printInvoice(inv);
        InvoiceRepository repo = new InvoiceRepository();
        repo.saveToFile(inv);

        OrderService os = new OrderService();
        System.out.println(os.getFinalPrice(200, new FlatDiscount(30)));
        System.out.println(os.getFinalPrice(200, new PercentageDiscount(10)));

        CheckingAccount ca = new CheckingAccount(1000);
        ca.withdraw(300);
        System.out.println("Balance: " + ca.getBalance());
        FixedDepositAccount fd = new FixedDepositAccount(5000);
        fd.deposit(500);
        System.out.println("FD Balance: " + fd.getBalance());

        BasicPrinter bp = new BasicPrinter();
        bp.print("report.pdf");
        AllInOnePrinter aio = new AllInOnePrinter();
        aio.scan("invoice.pdf");

        NotificationService ns = new NotificationService(new EmailSender());
        ns.notify("Order placed");
        NotificationService ns2 = new NotificationService(new SmsSender());
        ns2.notify("OTP: 1234");
    }
}
