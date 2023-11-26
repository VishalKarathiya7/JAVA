package proxy;

public class Client {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("C:/Vishal/img1.jpg");
        ProxyImage proxyImage = new ProxyImage("C:/Vishal/img2.jpg");

        realImage.display();
        proxyImage.display();
    }


}
