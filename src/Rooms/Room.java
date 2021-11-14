package Rooms;


public abstract class Room {
    private final char symbol;

    public Room(char s) {
        symbol = s;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract void displayRoom();
}
