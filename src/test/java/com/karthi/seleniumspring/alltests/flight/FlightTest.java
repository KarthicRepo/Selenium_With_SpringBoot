package com.karthi.seleniumspring.alltests.flight;

import com.karthi.seleniumspring.BaseSpringTestNG;
import com.karthi.seleniumspring.pages.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTest extends BaseSpringTestNG {

    @Autowired
    FlightPage flightPage;

    @Autowired
    FlighAppdata flighAppdata;

    @Test
    public void flightTest(){
        flightPage.gotoUrl(flighAppdata.getUrl());
        Assert.assertTrue(flightPage.isAt());
        Assert.assertEquals(flightPage.getLabels(),flighAppdata.getLabels());
        flightPage.close();
    }
}
