package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private String stampDimension;
    private boolean stampStamped;

    public Stamp (String stampName, String stampDimension, boolean stampStamped){
        this.stampName = stampName;
        this.stampDimension = stampDimension;
        this.stampStamped = stampStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampStamped == stamp.stampStamped &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampDimension, stamp.stampDimension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimension, stampStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimension='" + stampDimension + '\'' +
                ", stampStamped=" + stampStamped +
                '}';
    }
}
