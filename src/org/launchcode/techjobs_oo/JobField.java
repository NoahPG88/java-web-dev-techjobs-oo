package org.launchcode.techjobs_oo;

public abstract class JobField {
    protected int id;
    private static int nextId = 1;
    protected String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }
}
