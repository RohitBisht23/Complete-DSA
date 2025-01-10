/*
Flood Fill
Given a m*n integer grid image where image[i][j] repersents the pixel value of the image.
You have also given three integer sr,sc,and color. you should perform a flood fill on the image starting 
from the pisex image[sr][sr].
To perform a flood fill, consider the starting pixel, plus any pixels 
connected 4-directionally to the starting pixel of the same color as the starting pixel,
 plus any pixels connected 4-directionally to those pixels (also with the same color), and so on.
  Replace the color of all of the aforementioned pixels with color.
Ex:
Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), 
all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) 
are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting 
pixel.
 */
public class FloodFill {
    // public static void helper(int[][]img,int sr,int sc,int color,boolean vis[][],int orgColor)
    // {
    //     if(sr <0 || sc < 0 ||sr >= img.length || sc >= img.length || vis[sr][sc] || img[sr][sc] != orgColor)
    //     {
    //         return;
    //     }

    //     img[sr][sc] = color;

    //     //left
    //     helper(img, sr, sc-1,color, vis, orgColor);

    //     //right
    //     helper(img, sr, sc+1,color, vis, orgColor);

    //     //up
    //     helper(img, sr-1, sc,color, vis, orgColor);

    //     //down
    //     helper(img, sr+1, sc,color, vis, orgColor);
    // }

    public static void helper(int[][]img,int sr,int sc,int color,boolean vis[][],int orgColor)
    {
        if (sr < 0 || sr >= img.length || sc < 0 || sc >= img[0].length || vis[sr][sc] || img[sr][sc] != orgColor) {
            return;
        }

        img[sr][sc] = color;
        vis[sr][sc] = true;

        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int newRow = sr + dr[i];
            int newCol = sc + dc[i];
            helper(img, newRow, newCol, color, vis, orgColor);
        }
    }
    public static int[][] floodFill(int[][] img, int sr, int sc, int color) {
        int originalColor = img[sr][sc]; // Store the original color.
        if (originalColor == color) {
            return img;
        }

        boolean[][] vis = new boolean[img.length][img[0].length];
        helper(img, sr, sc, color, vis, originalColor);
        return img;
    }
    public static void main(String[] args)
    {
        int [][]img = {
                       {1,1,1},
                       {1,1,0},
                       {1,0,1}
                      };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int result[][] = floodFill(img,sr,sc,color);
        for(int i=0; i<result.length; i++)
        {
            for(int j=0; j<result[0].length; j++)
            {
                System.out.print(img[i][j]+" ");
            }
            System.out.println();
        }
    }
}
