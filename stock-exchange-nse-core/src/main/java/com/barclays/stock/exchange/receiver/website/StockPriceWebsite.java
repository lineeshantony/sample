package com.barclays.stock.exchange.receiver.website;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.barclays.stock.exchange.model.StockInformation;

@Component
public class StockPriceWebsite {

	@JmsListener(destination = "stockexchange", containerFactory = "myFactory")
	public void receiveMessage(StockInformation stockInformation) {
		System.out.println("Received in Website <" + stockInformation + ">");
	}
}
