package io.elmiguelo;

import io.elmiguelo.business.Order;
import io.elmiguelo.model.Computer;
import io.elmiguelo.model.Keyboard;
import io.elmiguelo.model.Monitor;
import io.elmiguelo.model.Mouse;

public class App 
{
    public static void main( String[] args )
    {
        Monitor monitorHP = new Monitor("HP",13);
        Keyboard keyboardHP = new Keyboard("bluetooth","HP");
        Mouse mouseHP = new Mouse("bluetooth","HP");
        Computer computerHP = new Computer("HP Computer",monitorHP,keyboardHP,mouseHP);

        Monitor monitorGamer = new Monitor("Gamer",34);
        Keyboard keyboardGamer = new Keyboard("bluetooth","Gamer");
        Mouse mouseGamer = new Mouse("bluetooth","Gamer");
        Computer computerGamer = new Computer("Gamer Computer",monitorGamer,keyboardGamer,mouseGamer);

        Order order = new Order();
        order.addComputer(computerHP);
        order.addComputer(computerGamer);

        order.shoOrder();
    }
}
