package TDD.Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void powerOnTest(){
        BikeTDD myBikeTDD = new BikeTDD();
        myBikeTDD.ignition(false);
        boolean value = myBikeTDD.checkPower();
        assertEquals(false, myBikeTDD.checkPower());
        myBikeTDD.ignition(true);
        assertEquals(true, myBikeTDD.checkPower());
    }
    @Test
    public void powerOffTest(){
        BikeTDD myBikeTDD = new BikeTDD();
        myBikeTDD.ignition(true);
        boolean value = myBikeTDD.checkPower();
        assertEquals(true, value);
        myBikeTDD.ignition(false);
        assertEquals(false, myBikeTDD.checkPower());
    }
    @Test
    public void accelerationTest() {
        BikeTDD myBikeTDD = new BikeTDD();
        myBikeTDD.ignition(true);
        assertEquals(true, myBikeTDD.checkPower());
        //Gear 1
        myBikeTDD.speedGear(1);
        int number = myBikeTDD.checkGear();
        assertEquals(1, myBikeTDD.checkGear());
        myBikeTDD.accelerate(15);
        int speed = myBikeTDD.finalSpeed();
        assertEquals(16, myBikeTDD.finalSpeed());
        //Gear 2
        myBikeTDD.speedGear(2);
        assertEquals(2, myBikeTDD.checkGear());
        myBikeTDD.accelerate(24);
        assertEquals(26, myBikeTDD.finalSpeed());
        //Gear 3
        myBikeTDD.speedGear(3);
        assertEquals(3, myBikeTDD.checkGear());
        myBikeTDD.accelerate(35);
        assertEquals(38, myBikeTDD.finalSpeed());
        //Gear 4
        myBikeTDD.speedGear(4);
        assertEquals(4, myBikeTDD.checkGear());
        myBikeTDD.accelerate(44);
        assertEquals(48, myBikeTDD.finalSpeed());
    }
    @Test
    public void decelerationTest(){
        BikeTDD myBikeTDD = new BikeTDD();
        myBikeTDD.ignition(true);
        assertEquals(true, myBikeTDD.checkPower());
        //Gear 1
        myBikeTDD.speedGear(1);
        int number = myBikeTDD.checkGear();
        assertEquals(1, myBikeTDD.checkGear());
        myBikeTDD.deccelerate(15);
        int speed = myBikeTDD.finalSpeed();
        assertEquals(14, myBikeTDD.finalSpeed());
        //Gear 2
        myBikeTDD.speedGear(2);
        assertEquals(2, myBikeTDD.checkGear());
        myBikeTDD.deccelerate(24);
        assertEquals(22, myBikeTDD.finalSpeed());
        //Gear 3
        myBikeTDD.speedGear(3);
        assertEquals(3, myBikeTDD.checkGear());
        myBikeTDD.deccelerate(35);
        assertEquals(32, myBikeTDD.finalSpeed());
        //Gear 4
        myBikeTDD.speedGear(4);
        assertEquals(4, myBikeTDD.checkGear());
        myBikeTDD.deccelerate(44);
        assertEquals(40, myBikeTDD.finalSpeed());
    }
    @Test
    public void GearSpeedTest(){
        BikeTDD myBikeTDD = new BikeTDD();
        myBikeTDD.ignition(true);
        assertEquals(true, myBikeTDD.checkPower());
        //Gear 1
        myBikeTDD.accelerate(15);
        myBikeTDD.gearShift(1);
        int number = myBikeTDD.checkGear();
        assertEquals(1, myBikeTDD.checkGear());
        //Gear 2
        myBikeTDD.accelerate(21);
        myBikeTDD.gearShift(2);
        assertEquals(2, myBikeTDD.checkGear());
        //Gear 3
        myBikeTDD.accelerate(30);
        myBikeTDD.gearShift(3);
        assertEquals(3, myBikeTDD.checkGear());
        //Gear 4
        myBikeTDD.accelerate(50);
        myBikeTDD.gearShift(2);
        assertEquals(4, myBikeTDD.checkGear());
    }
}