package homework4;

public class LaplacianFilter implements Filter {
    public static int [][] kernel = {
        {-1, -1, -1},
        {-1, 8, -1},
        {-1, -1, -1}
    };
    public void filter(PixelImage pi)
    {
        pi.computeNewImage(kernel, 1);
    }
    
}
