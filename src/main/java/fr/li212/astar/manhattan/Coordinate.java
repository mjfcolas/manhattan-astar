package fr.li212.astar.manhattan;


public interface Coordinate {
    int getX();
    int getY();
    int distance(final Coordinate startCoordinate);
}
