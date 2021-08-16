/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import backend.Characteristics.Hygiene;
import backend.Characteristics.Security;
import backend.People.Employees;
import backend.People.Investor;
import backend.People.Theifs;
import backend.People.Visitors;
import backend.components.Field_Building;
import backend.components.RoadManager;
import backend.components.Wall;

import java.util.ArrayList;

/**
 * @author Ali Sbiaa
 */
public class Park {
    // Components of the park
    private RoadManager roadManager;
    private Wall wall;
    private ArrayList<Field_Building> buildings;

    // People of the park
    private Visitors visitors;
    private Employees employees;
    private Theifs theifs;
    private Investor investor;  // the player himself

    // Characteristics
    private Hygiene hygiene;
    private Security security;
    private int capacity;

    public Park(Investor investor) {
        this.investor = investor;
    }


}
