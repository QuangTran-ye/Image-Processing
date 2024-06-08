package homework4;

public class GaussianBlurFilter implements Filter {
    public static int [][] kernel = {
        {1, 2, 1},
        {2, 4, 2},
        {1, 2, 1}
    };
    public void filter(PixelImage pi)
    {
        pi.computeNewImage(kernel, 16);
    }

    
}
