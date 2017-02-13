package com.company.behavioral.mediator;

public class TestStockMediator {

    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        Colleague broker = new GormanSlacks(nyse);
        Colleague broker2 = new JTPoorman(nyse);

        nyse.addColleague(broker);
        nyse.addColleague(broker2);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker.buyOffer("NRG", 10);

        nyse.getStockOfferings();
    }
}
