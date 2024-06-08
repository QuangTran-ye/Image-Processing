package homework4;

public class NegativeFilter implements Filter {
    public void filter(PixelImage pi)
    {
        Pixel[][] data = pi.getData();
        int width = pi.getWidth();
        int height= pi.getHeight();
        for (int row = 0; row < height; ++row)
        {
            for (int col =0 ; col < width; ++ col)
            {
                data[row][col].red = (255-data[row][col].red);
                data[row][col].green = (255-data[row][col].green);
                data[row][col].blue= (255-data[row][col].blue);        
            }
        }
        pi.setData(data);
    }
}
