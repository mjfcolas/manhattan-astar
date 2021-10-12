package fr.li212.astar.manhattan;


import java.util.List;

public class Path {
    private final List<Coordinate> path;
    private final boolean exists;

    public Path(final List<Coordinate> path, final boolean exists) {
        this.path = path;
        this.exists = exists;
    }

    public List<Coordinate> getPath() {
        return path;
    }

    public boolean exists() {
        return exists;
    }
}
