package com.kodilla.mockito.homework;

public interface Subscriber {

    void receive(WeatherAlert weatherAlert);

    void receive(GeneralInformation generalInformation);
}
