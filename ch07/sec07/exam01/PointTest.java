package ch07.sec07.exam01;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D();  //여기에 본값 외로, 값 지정 가능 
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);

	}

}


class Point{
	int x, y;
	
	Point(){}   //1
	Point(int x, int y){
	
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x:" + x +", y:" + y;
	}
}




class Point3D extends Point {
	int z;
	
	Point3D(){
		this(100,200,300);  //기본 지정값 
	}
	
	Point3D(int x, int y, int z){
		
//		super(x, y);  // point 에서 x, y 불러오기
		super();  ///1
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x:" + x +", y:" + y + ", z:" + z; 
	}
}