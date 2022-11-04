package patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("mayo")
                .ingredient("lettuce")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String bunType = bigmac.getBun();
        String sauceType = bigmac.getSauce();

        //Then
        assertEquals(2, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals("Sesame", bunType);
        assertEquals("mayo", sauceType);
    }
}
