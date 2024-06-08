package homework4;

public class SharpenFilter implements Filter {
    public static int [][] kernel = {
        {-1, -1, -1, -1, -1},
        {-1,  1,  2,  1, -1},
        {-1,  2,  4,  2, -1},
        {-1,  1,  2,  1, -1},
        {-1, -1, -1, -1, -1}
    };

    public final int divisor =1 ;

    public void filter(PixelImage pi)
    {
        Pixel [][] result = pi.getData();
        Pixel [][] data = pi.getData();
        for (int row=2; row<pi.getHeight()-2; ++row)
        {
            for (int col=2; col<pi.getWidth()-2; ++col)
            {
                int redSum = 0;
                int greenSum = 0;
                int blueSum =0;

                for(int i=-2; i<=2; ++i)
                {
                    for (int j =-2; j<=2; ++j)
                    {
                        Pixel p = data[row+i][col+j];
                        redSum += (p.red * kernel[i+2][j+2]);
                        greenSum += (p.green * kernel[i+2][j+2]);
                        blueSum += (p.blue * kernel[i+2][j+2]);
                    }
                }
                redSum = (int)(redSum/ divisor);
                greenSum = (int) (greenSum/ divisor);
                blueSum = (int)(blueSum/divisor);

                redSum = Math.max(0, Math.min(255, redSum));
                greenSum = Math.max(0, Math.min(255, greenSum));
                blueSum = Math.max(0, Math.min(255, blueSum));
                
                result[row][col] = new Pixel(redSum, greenSum, blueSum);
            }

        }
        pi.setData(result);
    }
    }

