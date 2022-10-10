import java.util.Scanner;
import java.util.Vector;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;

class ReadImg 
{
    public static int height;
    public static int width;
    public int getHeight() 
    {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int[][] readImage(String path) {
        // return matrix of the original image
        BufferedImage img;
        try {
            img = ImageIO.read(new File(path));
            height = img.getHeight();
            width = img.getWidth();
            int[][] imagePixels = new int[height][width];
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    Color pixel = new Color(img.getRGB(x, y));
                    int red = pixel.getRed();
                    imagePixels[y][x] = red;
                }
            }
            return imagePixels;
        } catch (IOException e) {
            return null;
        }
    }
}

public class Compress {
    public static void main(String[] args) throws IOException {
        Compress compress = new Compress();
        ReadImg img = new ReadImg();
        int[][] matrix;
        matrix = img
                .readImage("D:\\JavaClg\\compressimg_ca.jpg");//path image 

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height Vector");
        int VectorHeight = input.nextInt();

        System.out.println("Enter Width Vector");
        int VectorWidth = input.nextInt();

        System.out.println("Enter codeBlockSize");
        int codeBlockSize = input.nextInt();

        Vector<Vector<Integer>> Vectors = new Vector<>();
        Vectors = compress.getVectors(matrix, img.getHeight(), img.getWidth(), VectorHeight, VectorWidth);

        Vector<Vector<Integer>> QuantizeVector = new Vector<>();
        compress.Split(codeBlockSize, Vectors, QuantizeVector);

        Vector<Integer> NumberOfCodeBlocks = compress.NearFromCodeBlock(Vectors, QuantizeVector);

        FileWriter myWriter = new FileWriter("DataInput.txt");
        myWriter.write("VectorWidth is :" + VectorWidth + "\n");
        myWriter.write("VectorHegiht is :" + VectorHeight + "\n");
        myWriter.write("codeBlockSize is :" + codeBlockSize + "\n");
        myWriter.write("hegihtimg is :" + img.getHeight() + "\n");
        myWriter.write("Widthimg is :" + img.getWidth() + "\n");

        myWriter.close();

        FileOutputStream fileOut = new FileOutputStream("NumberOfCodeBlocks.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

        objectOut.writeObject(NumberOfCodeBlocks);
        objectOut.close();

        FileOutputStream fileOut2 = new FileOutputStream("QuantizedCode.txt");
        ObjectOutputStream objectOut2 = new ObjectOutputStream(fileOut2);

        objectOut2.writeObject(QuantizeVector);
        objectOut2.close();

        input.close();
    }

    public Vector<Vector<Integer>> getVectors(int[][] img, int hegiht, int width, int VectorHeight, int VectorWidth) {
        Vector<Vector<Integer>> tempVectors = new Vector<>();
        for (int i = 0; i < hegiht; i += VectorHeight) {
            for (int j = 0; j < width; j += VectorWidth) {
                tempVectors.add(new Vector<>());
                for (int k = i; k < i + VectorHeight; k++) {
                    for (int l = j; l < j + VectorWidth; l++) {
                        if (k < hegiht && l < width)
                            tempVectors.lastElement().add(img[k][l]);
                    }
                }
            }
        }
        return tempVectors;
    }

    private Vector<Integer> CalculateAverage(Vector<Vector<Integer>> Vectors) {
        int[] SumElements = new int[Vectors.get(0).size()];
        for (Vector<Integer> vector : Vectors)
            for (int i = 0; i < vector.size(); i++)
                SumElements[i] += vector.get(i);
        Vector<Integer> AvgVector = new Vector<>();
        for (int i = 0; i < SumElements.length; i++)
            AvgVector.add(SumElements[i] / Vectors.size());
        return AvgVector;
    }

    private void Split(int CodeBook, Vector<Vector<Integer>> Vectors, Vector<Vector<Integer>> Quantized) {
        if (Vectors.size() == 0)
            return;
        if (CodeBook == 1) {
            Quantized.add(CalculateAverage(Vectors));
            return;
        }
        Vector<Vector<Integer>> leftVectors = new Vector<>();
        Vector<Vector<Integer>> rightVectors = new Vector<>();
        Vector<Integer> AvgVector = CalculateAverage(Vectors);
        for (Vector<Integer> vec : Vectors) {
            int right = NearstFrom(vec, AvgVector, 1);
            int left = NearstFrom(vec, AvgVector, -1);
            if (right >= left)
                leftVectors.add(vec);
            else
                rightVectors.add(vec);
        }
        Split(CodeBook / 2, leftVectors, Quantized);
        Split(CodeBook / 2, rightVectors, Quantized);
    }

    private int NearstFrom(Vector<Integer> vec, Vector<Integer> Qun, int Spliting) {
        int distance = 0;
        for (int i = 0; i < vec.size(); i++)
            distance += Math.pow(vec.get(i) - Qun.get(i) + Spliting, 2);
        return distance;
    }

    private Vector<Integer> NearFromCodeBlock(Vector<Vector<Integer>> Vectors, Vector<Vector<Integer>> Quantized) {
        Vector<Integer> NumberofCodeBlock = new Vector<>();
        for (Vector<Integer> vector : Vectors) {
            int tempDestance = NearstFrom(vector, Quantized.get(0), 0);
            int NearFrom = 0;
            for (int i = 1; i < Quantized.size(); i++) {
                int tempDestance2 = NearstFrom(vector, Quantized.get(i), 0);
                if (tempDestance2 < tempDestance) {
                    tempDestance = tempDestance2;
                    NearFrom = i;
                }
            }
            NumberofCodeBlock.add(NearFrom);
        }
        return NumberofCodeBlock;
    }
}   