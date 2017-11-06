
public class ThreeDimensionalRectangle extends Rectangle implements IShape, IColor {
	
	private int mHeight;
	
	public ThreeDimensionalRectangle (int length, int width, int height){
		super(length, width);
		mHeight = height;
		
		
		
	}
	
	public int getHeight(){
		return mHeight;
	}
	
	public void setHeight(int height){
		mHeight = height;
	}
	
	public int getVolume(){
		return mHeight*mLength*mWidth;
		
	}
	
	@Override
	public int getSurfaceArea(){
		int lengthWidth = super.getSurfaceArea();
		int heightWidth = mHeight * mWidth;
		int lengthHeight = mLength * mHeight;
		//The surface area is calculated by 2LW + 2HW + 2LH		
		
		return (2*lengthWidth) + (2 * heightWidth) + (2*lengthHeight);
	
	}
	
	public String getName(){
		return "3-dimensional rectangle";
	}
	
}
