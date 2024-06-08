package homework4;

public class UnsharpMasking implements Filter {

    public static int [][] kernel = {
        {-1, -2, -1},
        {-2, 28, -2},
        {-1, -2, -1}
    };
    public void filter(PixelImage pi)
    {
        pi.computeNewImage(kernel, 16);
    }
}
