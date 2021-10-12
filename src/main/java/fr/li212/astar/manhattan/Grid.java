package fr.li212.astar.manhattan;

import java.util.List;

public interface Grid {
    int getWidth();

    int getHeight();

    List<Coordinate> getNeighbours(final Coordinate coordinate);

    Coordinate[][] getCells();
}
