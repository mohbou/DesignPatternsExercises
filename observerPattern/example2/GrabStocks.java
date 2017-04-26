package main.observerPattern.example2;

public class GrabStocks{
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 =  new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197);
        stockGrabber.setAaplPrice(500);
        stockGrabber.setGoogPrice(250);

        StockObserver observer2 =  new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(200);
        stockGrabber.setAaplPrice(450);
        stockGrabber.setGoogPrice(350);
        
        stockGrabber.unregister(observer1);
    }
}
