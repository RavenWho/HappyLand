package backend.components;

import backend.People.Investor;

import java.awt.*;


public class Field_Building {



    public enum Building_LVL {
        EMPTY, LVL0, LVL1, LVL2, LVL3;
    }
    public enum Building_Types {

        }

    final private int INIT_capacity = 30;

    final private int INIT_price = 1000;
    final private int commission = 30; /// from lvl1 to lvl2 building_price = price + 30%
    final private int capacity_per_upgrade = 25; /// from lvl1 to lvl2 capacity = capacity + 30%
    private Building_Types name;

    private int building_price; // related to Building_LVL
    private int capacity; // related to Building_LVL
    private Point location;
    private Building_LVL status;
    public Field_Building(Building_Types name, Point location) {
        this.name = name;
        this.location = location;
        status = Building_LVL.EMPTY;
    }

    public void build(Investor investor) {
        // check if the player has enough money
        if (investor.getBudget() >= building_price) {
            // check if we can build and if there exist another building
            if (isReachable() && status.equals(Building_LVL.EMPTY)) {
                /// do something
                // 1.take the money
                investor.setBudget(investor.getBudget() - building_price);
                // 2.upgrade the building
                status = Building_LVL.LVL0;
                // 3.increase the price
                building_price += building_price * commission / 100;
                // 4.increase capacity
                capacity = INIT_capacity;
                // 5.Set price
                building_price = INIT_price;
            }else {
                System.out.println("\nERROR : you can't Here ! ");
            }
        }else {
            System.out.println("\nNOT ENOUGH MONEY");
        }

    }

    public void upgrade(Investor investor) {
        switch (status) {
            case LVL0:
                investor.setBudget(investor.getBudget() - building_price);
                status = Building_LVL.LVL1;
                building_price += building_price * commission / 100;
                capacity += capacity_per_upgrade;
            case LVL1:
                investor.setBudget(investor.getBudget() - building_price);
                status = Building_LVL.LVL2;
                building_price += building_price * commission / 100;
                capacity += capacity_per_upgrade;
            case LVL2:
                investor.setBudget(investor.getBudget() - building_price);
                status = Building_LVL.LVL3;
                building_price += building_price * commission / 100;
                capacity += capacity_per_upgrade;
            case LVL3:
                System.out.println("\nYour building reached its maximum LVL!");
                break;
            default:
                System.out.println("\nYou cannot upgrade an empty field!");
                break;
        }
    }

    public void demolishBuilding(Investor investor) {
        // when demolishing a building the investor gains half of its current price
        if(status.equals(Building_LVL.EMPTY)) return;
        investor.setBudget(investor.getBudget() - building_price);
        capacity = INIT_capacity;
        building_price = 0;

    }

    private boolean isReachable() {
        return true;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
