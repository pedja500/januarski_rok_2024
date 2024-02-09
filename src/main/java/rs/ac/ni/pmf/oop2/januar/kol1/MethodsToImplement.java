package rs.ac.ni.pmf.oop2.januar.kol1;

import rs.ac.ni.pmf.oop2.januar.kol1.figures.Figure;


public interface MethodsToImplement {

    /**
     * adds new figure to the collection
     * @param figure - figure that should be added
     */
    void add(Figure figure);

    /**
     * finds number of triangles in the collection
     * @return numbers of triangle in the collection
     */
    int numberOfTriangles();
    /**
     * finds number of quadrilateral in the collection
     * @return numbers of quadrilateral  in the collection
     */
    int numberOfQuadrilateral();

    /**
     * finds figure with the maximum area amount all figures in the collection. If two figures have the same area, they should be
     * compared by circumference. If that is also the same they should be compared by which one was added earlier.
     * @return @Figure with maximum area
     */
    int figureWithMaximumArea();


    // To find orientation of ordered triplet (p, q, r).
    // The function returns following values
    // 0 --> p, q and r are collinear
    // 1 --> Clockwise
    // 2 --> Counterclockwise
//     default int orientation(Point2D p, Point2D q, Point2D r) {
//        double val = (q.getX() - p.getX()) * (q.getY()-r.getY())-(q.getY()-p.getY()) * (q.getX()-r.getX());
//        if (val == 0) return 0;  // collinear
//        return (val > 0) ? 1: 2; // clock or counterclockwise
//    }

}
