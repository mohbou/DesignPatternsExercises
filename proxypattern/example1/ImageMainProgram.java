package main.proxypattern.example1;

public class ImageMainProgram {

    public static void main(String[] args) {

        Image imageProxy = new ImageProxy("image_proxy_pattern.png");
        imageProxy.display();

    }
}
