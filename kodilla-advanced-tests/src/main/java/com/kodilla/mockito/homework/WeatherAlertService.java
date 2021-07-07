package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherAlertService {

    private HashMap<Location, Set<Subscriber>> subscriptionLists = new HashMap<>();
    private Set<Subscriber> subscribers = new HashSet<>();


    public void addSubscriber(Subscriber subscriber, Location location) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber, Location location) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).remove(subscriber);
    }

    public void addLocation(Location location) {
        if (!subscriptionLists.containsKey(location))
            this.subscriptionLists.put(location, new HashSet<>());
    }

    public void removeLocation(Location location) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.remove(location);

    }

    public void removeSubscriberFromAllLocations(Subscriber subscriber) {
        if (subscriptionLists.isEmpty())
            this.subscriptionLists.clear();
    }

    public void sendWeatherAlert(Location location, WeatherAlert weatherAlert) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).forEach(subscriber -> subscriber.receive(weatherAlert));
    }

    public void sendAlertToAll(WeatherAlert weatherAlert) {
        for (Location location : subscriptionLists.keySet())
            this.subscriptionLists.get(location).forEach(subscriber -> subscriber.receive(weatherAlert));
    }

    public void sendGeneralInformation(Location location, GeneralInformation generalInformation) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).forEach((subscriber -> subscriber.receive(generalInformation)));
    }


    public void sendGeneralInformationToAll(Set<Subscriber> subscribers, GeneralInformation generalInformation) {
        for (Subscriber sub : subscribers) {
            sub.receive(generalInformation);
        }
    }



}
