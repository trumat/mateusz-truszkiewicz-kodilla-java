package com.kodilla.patterns.builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.SESAME_BUN)
                .burgers(2)
                .sauce(Bigmac.BARBECUE_SAUCE)
                .ingredient(Bigmac.BACON)
                .ingredient(Bigmac.CHEESE)
                .build();
        //When
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();
        int numberOfIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals("Sesame bun", bun);
        Assert.assertEquals("Barbecue sauce", sauce);
        Assert.assertEquals(2, numberOfIngredients);
    }
}
