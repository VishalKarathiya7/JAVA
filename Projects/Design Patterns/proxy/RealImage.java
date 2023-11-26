package proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    public void loadImageFromDisk(){
        System.out.println("Loading Image From Disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }
}
