package com.ks.dynamicprob;

/**
 * @author Ahil
 */
public class BoxStack {
  public static void main(String args[]) {
    int[][] x = {{4, 7, 9}, {5, 8, 9}, {11, 20, 40}, {1, 2, 3}};

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(x[i][j]);
      }
      System.out.println();
    }
    BoxStack boxStack = new BoxStack();
    System.out.println("Max height which can be obtained :" + boxStack.solve(x));
  }

  public int solve(int[][] x) {

    Box[] boxes = new Box[x.length * 3];
    for (int i = 0; i < x.length; i++) {
      int h = x[i][0];
      int w = x[i][1];
      int d = x[i][2];
      boxes[i * 3] = new Box(h, w, d); // normal dimension
      boxes[i * 3 + 1] = new Box(w, h, d); // first dimension
      boxes[i * 3 + 2] = new Box(d, h, w); // second dimension
    }
    return 0;
  }
}

class Box implements Comparable<Box> {
  int height;
  int width;
  int depth;

  public Box(int height, int width, int depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  public int compareTo(Box o) {
    int area = o.depth * o.width;
    int thisArea = this.depth * this.width;

    return area - thisArea;
  }
}
