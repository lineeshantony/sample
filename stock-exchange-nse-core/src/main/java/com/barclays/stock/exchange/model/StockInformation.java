package com.barclays.stock.exchange.model;

public class StockInformation {

	private String stockName;
	private String stockSymbol;
	private double stockPrice;

	public StockInformation() {
	}

	public StockInformation(String stockName, String stockSymbol, double stockPrice) {
		this.stockName = stockName;
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return String.format("Stock{Name=%s, Symbol=%s, price=%s}", stockName, stockSymbol, stockPrice);
	}
}
