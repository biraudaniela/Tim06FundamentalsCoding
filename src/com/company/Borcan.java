package com.company;

import java.util.Objects;

public class Borcan {


    private String continut;

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;//this da valoarea continutului de sus din instanta
                                  // borcan nu din variabila lovala
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Borcan borcan = (Borcan) o;
        return Objects.equals(continut, borcan.continut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continut);
    }
}
