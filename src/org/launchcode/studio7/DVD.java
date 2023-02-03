package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{
    private String dataType;
    private int layerCount;
    private ArrayList<String> features;

    public DVD(String name, String content, double capacity, String shape, String dataType, int layerCount, ArrayList<String> features) {
        super(name, content, capacity, shape);
        this.dataType = dataType;
        this.layerCount = layerCount;
        this.features = features;
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void frisbeeToss() {

    }

    @Override
    public void checkProtectiveCoating() {

    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getLayerCount() {
        return layerCount;
    }

    public void setLayerCount(int layerCount) {
        this.layerCount = layerCount;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
