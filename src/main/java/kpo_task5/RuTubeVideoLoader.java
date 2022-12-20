package kpo_task5;

public class RuTubeVideoLoader implements VideoLoader{

    String filepath;

    public RuTubeVideoLoader(String filepath) {
        this.filepath = filepath;
        load();
    }
    @Override
    public void display() {
        System.out.println("Video " + filepath + " displaying");
    }
    @Override
    public void load() {
        System.out.println("Video is loaded");
    }
}
