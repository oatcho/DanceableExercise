package com.company;

public class MarcCuban implements Danceable{

    @Override
    public void typeOfDance(String danceType){
        danceType = "Waltz";
    }

    @Override
    public void styleOfDance(String styleType){
        styleType = "Clunky";
    }
}
