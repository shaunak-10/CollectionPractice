package sealedClasses;

public sealed interface Shape permits Circle, Rectangle
{
    int numsides();
}

final class Circle implements Shape
{
    @Override
    public int numsides()
    {
        return 0;
    }
}

non-sealed class Rectangle implements Shape
{

    @Override
    public int numsides()
    {
        return 4;
    }
}



