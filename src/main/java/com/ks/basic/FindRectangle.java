package com.ks.basic;

class FindRectangle {
  public static void main(String[] args) {
    int[][] image1 = {
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 0, 0, 0, 1},
      {1, 1, 1, 0, 0, 0, 1},
      {1, 1, 1, 1, 1, 1, 1}
    };

    int[][] image2 = {
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 0}
    };

    int[][] image3 = {
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 0, 0},
      {1, 1, 1, 1, 1, 0, 0}
    };

    int[][] image4 = {
      {0, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1}
    };

    int[][] image5 = {{0}};

    int[] rectangle1 = findRectangle(image1);
    int[] rectangle2 = findRectangle(image2);
    int[] rectangle3 = findRectangle(image3);
    int[] rectangle4 = findRectangle(image4);
    int[] rectangle5 = findRectangle(image5);
  }

  private static int[] findRectangle(int[][] image) {
    int rectagleSize[] = new int[2];
    int maxX = image.length;
    int maxY = image[0].length;

    Integer startX = null, startY = null;

    for (int i = 0; i < maxX; i++) {
      for (int j = 0; j < maxY; j++) {

        if (image[i][j] == 0) {
          startX = i;
          startY = j;
          break;
        }
      }
      if (startX != null) {
        break;
      }
    }
    System.out.println("Start X=" + startX);
    System.out.println("Start Y=" + startY);

    rectagleSize[0] = 1;
    rectagleSize[1] = 1;

    // Now we know the start point

    for (int i = startX + 1; i < maxX; i++) {
      if (image[i][startY] == 0) {
        rectagleSize[0]++;
      } else {
        break;
      }
    }

    for (int i = startY + 1; i < maxY; i++) {
      if (image[startX][i] == 0) {
        rectagleSize[1]++;
      } else {
        break;
      }
    }

    System.out.println("length = " + rectagleSize[0] + " Width =" + rectagleSize[1]);
    return rectagleSize;
  }
}
