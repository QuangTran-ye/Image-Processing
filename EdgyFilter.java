package homework4;

public class EdgyFilter implements Filter {
    public static int [][] kernel = {
        {-1, -1, -1},
        {-1, 9, -1},
        {-1,-1, -1}
    };
    public void filter(PixelImage pi)
    {
        pi.computeNewImage(kernel, 1);
    }
}
