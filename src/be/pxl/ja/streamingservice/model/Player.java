package be.pxl.ja.streamingservice.model;

public abstract class Player {
    private String name;

    protected Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
