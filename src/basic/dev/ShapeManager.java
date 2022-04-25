package basic.dev;
import advance.dev.models.Shape;
public class ShapeManager implements IShape {
		public Shape shapes[] =new Shape[5];
		public int index = 0;
		
		public void add(Shape shape) {
			if(index >= 5) index = 0;
			shapes[index] = shape;
			index++;
			
		}
		public void print() {
			for(Shape shape : shapes) {
				System.out.println(shape);
			}
		}
		

}