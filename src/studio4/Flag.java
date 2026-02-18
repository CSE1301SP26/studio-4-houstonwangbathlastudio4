package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;


public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(0,0,255); // for blue
		StdDraw.setPenRadius(0.05);
		StdDraw.filledRectangle(0.8, 1, 1,0.32);
		StdDraw.setPenColor(125,0,125);
		StdDraw.filledRectangle(0.8, 0, 1, 0.32);
		StdDraw.setPenColor(0,255,0);
		double x_coor[] = {0,0.5,0};
		double y_coor[] = {1,0.5,0};
		StdDraw.filledPolygon(x_coor, y_coor);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5, 0.5,0.5);
		
	}
}