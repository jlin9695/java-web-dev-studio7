package org.launchcode.studio7;

public class BaseDisc {
    public String name;
    public String content;
    public double capacity;
    public String shape;

    public BaseDisc(String name, String content, double capacity, String shape) {
        this.name = name;
        this.content = content;
        this.capacity = capacity;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public void writeData(){};
    public void readData(){};
    public void getMetaData(){
    }

}
