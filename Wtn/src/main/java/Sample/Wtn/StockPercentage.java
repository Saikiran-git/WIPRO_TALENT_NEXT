package Sample.Wtn;

import java.util.Scanner;



public class StockPercentage {
	String stockName;
	String stockSymbol;
	double prevPrice;
	double currPrice;
	StockPercentage(String stockName, String stockSymbol, double prevPrice, double currPrice){
		this.stockName = stockName;
		this.stockSymbol = stockSymbol;
		this.prevPrice = prevPrice;
		this.currPrice = currPrice;
	}
	
	double getChangePercentage() {
		double percentChange = 0.0;
		percentChange = ((currPrice - prevPrice) / prevPrice) * 100;
		return percentChange;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stockName = sc.next();
		String stockSymbol = sc.next();
		double prevPrice = sc.nextDouble();
		double currPrice = sc.nextDouble();
		StockPercentage sp = new StockPercentage(stockName, stockSymbol, prevPrice, currPrice);
		double result = sp.getChangePercentage();
		System.out.println(result);
		sc.close();
	}

}



/*
 
 Create a new class called “Stock” which contains the following: 
1. A String for the stock name
2. A String for the stock symbol
3. A double storing the previous closing price of the stock
4. A double storing the current closing price of the stock
5. A constructor that allows you to define a stock’s name,
 symbol, previous closing price and current closing price
6. A method getChangePercentage() that returns the percentage change
 from the previous closing price to the current closing price
 
 */