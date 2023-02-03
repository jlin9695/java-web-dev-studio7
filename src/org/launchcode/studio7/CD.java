package org.launchcode.studio7;

import javax.print.DocFlavor;

public class CD extends BaseDisc implements OpticalDisc{
    private String dataType;

    public CD(String name, String content, double capacity, String shape, String dataType) {
        super(name, content, capacity, shape);
        this.dataType = dataType;
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


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
