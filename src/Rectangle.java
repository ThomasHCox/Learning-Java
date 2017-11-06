public class Rectangle implements IShape, IColor {

	protected int mLength;
	protected int mWidth;
	protected String mColor;

	public Rectangle(int length, int width) {
		mLength = length;
		mWidth = width;
	}

	public int getLength() {
		return mLength;
	}

	public void setLength(int length) {
		mLength = length;
	}

	public int getSurfaceArea() {
		return mLength * mWidth;
	}

	public String getName() {
		return "Rectangle";
	}

	public String getSurfaceAreaUnitOfMeasure() {
		return "Square Feet";
	}
	
	public void setColor(String color){
		mColor = color;
	}
	
	public String getColor(){
		return mColor;
	}
}
