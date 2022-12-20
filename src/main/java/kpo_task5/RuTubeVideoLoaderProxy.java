package kpo_task5;

public class RuTubeVideoLoaderProxy implements VideoLoader{
    RuTubeVideoLoader vloader;
    String filepath;

    public RuTubeVideoLoaderProxy(String filepath) {
        this.filepath = filepath;
    }
    @Override
    public void display() {
        System.out.println("Video " + filepath + " displaying");
    }
    @Override
    public void load() {
        if (vloader == null)
            vloader = new RuTubeVideoLoader(filepath);
        else System.out.println("Video already loaded");
    }
}
