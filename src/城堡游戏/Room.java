package 城堡游戏;

public class Room {
    private final String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    public Room(String description) {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null)
            northExit = north;
        if (east != null)
            eastExit = east;
        if (south != null)
            southExit = south;
        if (west != null)
            westExit = west;
    }

    @Override
    public String toString() {
        return description;
    }

    public String getExitDesc() {
        StringBuilder ret = new StringBuilder();
        if (northExit != null)
            ret.append("north");
        if (eastExit != null)
            ret.append("east");
        if (westExit != null)
            ret.append("west");
        if (southExit != null)
            ret.append("south");
        return ret.toString();
    }

    public Room getExit(String direction) {
        Room as = null;
        if (direction.equals("north")) {
            as = northExit;
        }
        if (direction.equals("east")) {
            as = eastExit;
        }
        if (direction.equals("south")) {
            as = southExit;
        }
        if (direction.equals("west")) {
            as = westExit;
        }
        return as;
    }
}
