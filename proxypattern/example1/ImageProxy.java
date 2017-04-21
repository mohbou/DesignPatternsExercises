package main.proxypattern.example1;

public class ImageProxy implements Image {

    private String file;
    private RealImage realImage;

    public ImageProxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(realImage==null)
        realImage = new RealImage(file);
        realImage.display();

    }
}
