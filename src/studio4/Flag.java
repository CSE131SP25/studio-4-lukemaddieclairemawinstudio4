package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255,255,153);
		StdDraw.filledCircle(0.5, 0.8,0.2001);
		StdDraw.filledRectangle(0.5,0.5,0.2,0.3);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.5, 0.7, 0.2, 0.03);
		StdDraw.filledCircle(0.5,0.7,0.1);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(0.5, 0.7, 0.08);
		StdDraw.setPenColor(225,225,153);
		StdDraw.filledRectangle(0, 0, 0, 0);
		StdDraw.setPenColor(0,0,225);
		StdDraw.filledRectangle(0.5, 0.3, 0.2, 0.1);
		StdDraw.setPenColor(0,0,0);
		StdDraw.arc(0.5, 0.55, 0.1,200,340);
		StdDraw.setPenColor(150,75,0);
		StdDraw.filledCircle(.5, 0.7, 0.05);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(.5, 0.7, 0.025);
		StdDraw.setPenColor(0,0,225);
		StdDraw.filledRectangle(0.4, 0.2, 0.05, .05);
		StdDraw.filledRectangle(0.6, 0.2, 0.05, .05);
		StdDraw.setPenColor(225,225,153);
	}
}