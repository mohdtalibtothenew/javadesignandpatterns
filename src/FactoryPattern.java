// Question 2
// Implement Factory Pattern to get the Polygon of differnt type.

interface PolygonType
{
    void polygonshape();
}
class Quadrilateral implements PolygonType
{
    @Override
    public void polygonshape()
    {
        System.out.println("Quadrilateral with 4 sides");
    }
}
class Pentagon implements PolygonType
{
    @Override
    public void polygonshape()
    {
        System.out.println("Pentagon with 5 sides");
    }
}
class Hexagon implements PolygonType
{
    @Override
    public void polygonshape()
    {
        System.out.println("Hexagon with 6 sides");
    }
}
class Polygon
{
    PolygonType polygonType;
    public PolygonType getPolygonType() {
        return polygonType;
    }
    public void setPolygonType(PolygonType polygonType) {
        this.polygonType = polygonType;
    }
}
class PolygonFactory
{
    static Polygon getPolygonObject(String name)
    {
        Polygon polygon =new Polygon();
        switch (name)
        {
            case "polygonshapeQuadrilateral" :
                polygon.setPolygonType(new Quadrilateral());
                break;
            case "polygonshapePentagon" :
                polygon.setPolygonType(new Pentagon());
                break;
            case "polygonshapeHexagon" :
                polygon.setPolygonType(new Hexagon());
                break;
        }
        return polygon;
    }
}
public class FactoryPattern
{
    public static void main(String[] args)
    {
        Polygon polygonshapeQuadrilateral=PolygonFactory.getPolygonObject("polygonshapeQuadrilateral");
        polygonshapeQuadrilateral.getPolygonType().polygonshape();
        Polygon polygonshapePentagon=PolygonFactory.getPolygonObject("polygonshapePentagon");
        polygonshapePentagon.getPolygonType().polygonshape();
        Polygon polygonshapeHexagon=PolygonFactory.getPolygonObject("polygonshapeHexagon");
        polygonshapeHexagon.getPolygonType().polygonshape();
    }
}