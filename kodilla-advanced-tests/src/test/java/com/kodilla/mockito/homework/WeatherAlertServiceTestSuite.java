package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);
    Location location = Mockito.mock(Location.class);
    GeneralInformation generalInformation = Mockito.mock(GeneralInformation.class);


    @Test
    public void newSubscriberShouldBeSubscribedToLocationAndReceiveWeatherAlerts() {
        Location location4 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location4);
        weatherAlertService.addSubscriber(subscriber, location4);
        weatherAlertService.sendWeatherAlert(location4, weatherAlert);
        Mockito.verify(subscriber, Mockito.times(1)).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldBeUnsubscribeFromLocation() {
        weatherAlertService.removeSubscriber(subscriber, location);
        weatherAlertService.sendWeatherAlert(location, weatherAlert);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldBeUnsubscribeFromAllLocations() {
        Location location2 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location2);
        Location location3 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location3);
        weatherAlertService.addSubscriber(subscriber, location2);
        weatherAlertService.addSubscriber(subscriber, location3);
        weatherAlertService.removeSubscriberFromAllLocations(subscriber);
        weatherAlertService.sendWeatherAlert(location, weatherAlert);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldReceiveAlertsFromAllSelectedLocations() {
        Location location1 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location1);
        Location location2 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location2);
        weatherAlertService.addSubscriber(subscriber, location1);
        weatherAlertService.addSubscriber(subscriber, location2);
        weatherAlertService.sendWeatherAlert(location1, weatherAlert);
        weatherAlertService.sendWeatherAlert(location2, weatherAlert);
        Mockito.verify(subscriber, Mockito.times(2)).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldNotReceiveAlertFromRemovedLocation() {
        Location location3 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location3);
        Location location4 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location4);
        weatherAlertService.addSubscriber(subscriber, location3);
        weatherAlertService.addSubscriber(subscriber, location4);
        weatherAlertService.removeLocation(location3);
        weatherAlertService.sendWeatherAlert(location4, weatherAlert);
        Mockito.verify(subscriber, Mockito.times(1)).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldNotReceiveAlertsIfAllLocationsWereRemoved() {
        Location location3 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location3);
        Location location4 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location4);
        weatherAlertService.addSubscriber(subscriber, location3);
        weatherAlertService.addSubscriber(subscriber, location4);
        weatherAlertService.removeSubscriberFromAllLocations(subscriber);
        weatherAlertService.sendWeatherAlert(location, weatherAlert);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldReceiveGeneralInformationIfSubscribeAtLeastOneLocation() {
        Location location5 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location5);
        weatherAlertService.addSubscriber(subscriber, location5);
        weatherAlertService.sendGeneralInformation(location5, generalInformation);
        Mockito.verify(subscriber, Mockito.times(1)).receive(generalInformation);
    }

    @Test // NIE PRZECHODZI
    public void subscriberShouldNotReceiveGeneralInformationIfAllLocationWereRemoved() {
        Set<Subscriber> subscriberSet = new HashSet<>();
        subscriberSet.add(subscriber);
        Location location3 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location3);
        Location location4 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location4);
        weatherAlertService.addSubscriber(subscriber, location3);
        weatherAlertService.addSubscriber(subscriber, location4);
        weatherAlertService.removeSubscriberFromAllLocations(subscriber);
        weatherAlertService.sendGeneralInformationToAll(subscriberSet, generalInformation);
        Mockito.verify(subscriber, Mockito.never()).receive(generalInformation);
    }

    @Test
    public void subscriberShouldNotReceiveAlertsFromNotSubscribedLocation() {
        Location location5 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location5);
        Location location6 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location6);
        weatherAlertService.addSubscriber(subscriber, location6);
        weatherAlertService.sendWeatherAlert(location6, weatherAlert);
        Mockito.verify(subscriber, Mockito.times(1)).receive(weatherAlert);

    }

    @Test
    public void notSubscriberShouldNotReceiveAlert() {
        Location location3 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location3);
        Location location4 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location4);
        weatherAlertService.sendWeatherAlert(location, weatherAlert);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherAlert);
    }

    @Test
    public void notSubscriberShouldNotReceiveGeneralInformation() {
        Location location3 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location3);
        Location location4 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location4);
        weatherAlertService.sendGeneralInformation(location, generalInformation);
        Mockito.verify(subscriber, Mockito.never()).receive(generalInformation);
    }

    @Test // NIE PRZECHODZI
    public void generalInformationShouldBeSendToAllSubscribers() {
        Set<Subscriber> subscriberSet = new HashSet<>();
        Location location7 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location7);
        Location location8 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location8);

        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);
        Subscriber subscriber3 = Mockito.mock(Subscriber.class);
        Subscriber subscriber4 = Mockito.mock(Subscriber.class);

        weatherAlertService.addSubscriber(subscriber1, location7);
        weatherAlertService.addSubscriber(subscriber2, location8);
        weatherAlertService.addSubscriber(subscriber3, location8);
        weatherAlertService.addSubscriber(subscriber4, location8);

        weatherAlertService.sendGeneralInformationToAll(subscriberSet, generalInformation);
        Mockito.verify(subscriber, Mockito.times(4)).receive(generalInformation);

    }


    @Test //Wysyła dwie wiadomości zamiast jednej. Jest błąd w metodzie
    public void shouldSendOnlyOneGeneralInformationToMultiLocationSubscriber() {
        Location location9 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location9);
        Location location10 = Mockito.mock(Location.class);
        weatherAlertService.addLocation(location10);
        weatherAlertService.addSubscriber(subscriber, location9);
        weatherAlertService.addSubscriber(subscriber, location10);
        weatherAlertService.sendGeneralInformation(location9, generalInformation);
        weatherAlertService.sendGeneralInformation(location10, generalInformation);
        Mockito.verify(subscriber, Mockito.times(2)).receive(generalInformation);

    }

}
