package Sample.Wtn;

public class BoxDim
{
    double width, height,depth;
    BoxDim(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume()
    {
        return width * height * depth;
    }
}
