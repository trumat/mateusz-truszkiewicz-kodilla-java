package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country(new BigDecimal("38088141"));
        Country ireland = new Country(new BigDecimal("4814483"));
        Country macedonia = new Country(new BigDecimal("2085531"));
        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(ireland);
        europe.addCountry(macedonia);
        Country congo = new Country(new BigDecimal("5435771"));
        Country liberia = new Country(new BigDecimal("4884857"));
        Country egypt = new Country(new BigDecimal("99843445"));
        Continent africa = new Continent();
        africa.addCountry(congo);
        africa.addCountry(liberia);
        africa.addCountry(egypt);
        Country nicaragua = new Country(new BigDecimal("6301912"));
        Country brazil = new Country(new BigDecimal("211270554"));
        Country ecuador = new Country(new BigDecimal("16924484"));
        Continent southAmerica = new Continent();
        southAmerica.addCountry(nicaragua);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(ecuador);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(southAmerica);
        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("389649178"), worldPopulation);
    }
}
