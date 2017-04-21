package main.proxypattern.example1;

public class RealImage implements Image {
    public String fileName;


    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file... "+fileName);
    }
    private void loadFile(String fileName) {
        System.out.println("Loading file... "+fileName);
    }
}
