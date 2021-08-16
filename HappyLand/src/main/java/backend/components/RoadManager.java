package backend.components;

import backend.People.Investor;

import java.awt.*;
import java.util.ArrayList;




public class RoadManager {
    public enum ROAD_STATUS {
        BUILT,EMPTY
    }
    private class Road {

        final private int price = 1000;
        // a road always have 2 sides . in our case its a building
        private Point sideA;
        private Point sideB ;
        private ROAD_STATUS status;

        /// this list is for the roads that are related to this one
        private ArrayList<Road> roads_connected;

        public Road() {
            status =ROAD_STATUS.EMPTY;
        }


        // this function is to check if a certain building have this road as an edge
        public boolean checkRoad_Building(Field_Building building) {
            return building.getLocation().equals(sideA) || building.getLocation().equals(sideB);
        }

        public void buildRoad(Investor investor) {
            if (status.equals(ROAD_STATUS.BUILT))
                System.out.println("\n This road is already built!! ");
            else if (investor.getBudget() >= price) {
                investor.setBudget(investor.getBudget() - price);
                status = ROAD_STATUS.BUILT;
            }
        }

        public void demolishRoad() {
            /// still thinking if I should create this function or not;
        }

        // to add the connected roads (setter)
        public void add_connected_road(Road road) {
            roads_connected.add(road);
        }

        public ArrayList<Road> getRoads_connected() {
            return roads_connected;
        }

        public ROAD_STATUS getStatus() {
            return status;
        }

        public void setSideA(Point sideA) {
            this.sideA = sideA;
        }

        public void setSideB(Point sideB) {
            this.sideB = sideB;
        }

        public Point getSideA() {
            return sideA;
        }
        public Point getSideB() {
            return sideB;
        }
    }

    private ArrayList<Road> roads = new ArrayList<>();

    public RoadManager() {
        // All roads are empty except the green one
        // 1. we create all the empty roads
        for (int i = 0; i < 24; i++) {
            roads.add(new Road());
        }

        //2. iterate horizontal roads and set sideA and side B
        // from 1 to 12
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                roads.get(i + j).setSideA(new Point(i+1, j+1));
                roads.get(i + j).setSideB(new Point(i+2, j+1));
            }
        }
        //2. iterate vertical roads and set sideA and side B
        // from 12 to 24
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                roads.get(i + j + 12).setSideA(new Point(i+1, j+1));
                roads.get(i + j + 12).setSideB(new Point(i+1, j+2));
            }
        }
        setConnections();
    }

    private void setConnections() {
        for (int i = 0; i < roads.size(); i++) {
            Point tmp_sideA = roads.get(i).sideA;
            Point tmp_sideB = roads.get(i).sideB;
            for (int j = 0; j < roads.size(); j++) {
                if(i==j) continue;
                if(tmp_sideA== roads.get(j).sideA || tmp_sideA== roads.get(j).sideB )
                    roads.get(i).add_connected_road(roads.get(j));
                else if(tmp_sideB== roads.get(j).sideA || tmp_sideB== roads.get(j).sideB )
                    roads.get(i).add_connected_road(roads.get(j));
            }
        }
    }
}
