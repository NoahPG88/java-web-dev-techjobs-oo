package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    protected Integer id;
    private static Integer nextId = 1;
    protected String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
