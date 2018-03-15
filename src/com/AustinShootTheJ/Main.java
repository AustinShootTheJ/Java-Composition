package com.AustinShootTheJ;

/* Composition is used in place of inheritance when a class is made up of classes that are not subclasses to that superclass.

in this example we build a computer out of a motherboard, a monitor, and a case. Both the monitor and case have their own
subcompisitions in Resolution and Dimensions. The Resolution is a component of the Monitor just as the Monitor is a component
of the PC. In our Monitor deceleration we also declare the resolution in our constructor. This is useful when we do not need
to access that object anywhere but within our composed class.
*
*
* */




public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27,new Resolution(2540,1440));

        Motherboard theMotherBoard = new Motherboard("BJ-2000", "Asus",4,6,"v2.44");


        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

        thePC.getTheCase().pressPowerButton();
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");




    }
}
