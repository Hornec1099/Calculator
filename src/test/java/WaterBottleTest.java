import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void setWaterBottle(){ waterbottle = new WaterBottle(100);}

    @Test
    public void WaterBottleHasWater(){
        assertEquals(100, waterbottle.getWater());
    }
    @Test
    public void WatterBottleIsDrunk(){
        assertEquals(90, waterbottle.drink());
    }
    @Test
    public void WatterBottleEmptied(){
        assertEquals(0, waterbottle.empty());
    }
    @Test
    public void FillWaterBottle(){
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(100 , waterbottle.fill());
    }
}
