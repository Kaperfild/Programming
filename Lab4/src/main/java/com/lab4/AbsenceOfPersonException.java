package com.lab4;

public class AbsenceOfPersonException extends NullPointerException {
    public AbsenceOfPersonException() {
    }

    public AbsenceOfPersonException(String s) {
        super(s);
    }
}
