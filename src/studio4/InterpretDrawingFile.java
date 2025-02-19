package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeName = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		StdDraw.setPenColor(red, green, blue);

		if (shapeName.equals("ellipse")) {
			if (isFilled == true) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			} else {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		}
		if (shapeName.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		if (shapeName.equals("triangle")) {
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double xarray[] = {x, halfWidth, x3};
			double yarray[] = {y, halfHeight, y3};
			if (isFilled == true) {
				StdDraw.filledPolygon(xarray, yarray);
			}else {
				StdDraw.polygon(xarray, yarray);
			}
		}
	}
}
