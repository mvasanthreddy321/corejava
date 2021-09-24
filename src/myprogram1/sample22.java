package myprogram1;


interface drawable
{ 
	void drawingcolor();
	void thickness();
	}
interface fillable
{
  void fillingcolor();
  void size();
}

class line implements drawable,fillable
{

	@Override
	public void fillingcolor() {
		// TODO Auto-generated method stub
		System.out.println("color is red");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("size is thin");
	}

	@Override
	public void drawingcolor() {
		// TODO Auto-generated method stub
		System.out.println("drawing color is black");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("thickness 1mm");
	}
	}

class circle implements drawable,fillable
{

	@Override
	public void fillingcolor() {
		// TODO Auto-generated method stub
		System.out.println("color is blue");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("size is thin");
	}

	@Override
	public void drawingcolor() {
		// TODO Auto-generated method stub
		System.out.println("drawing color is white");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("thickness 2mm");
	}
	}

class square implements drawable,fillable
{

	@Override
	public void fillingcolor() {
		// TODO Auto-generated method stub
		System.out.println("color is green");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("size is thin");
	}

	@Override
	public void drawingcolor() {
		// TODO Auto-generated method stub
		System.out.println("drawing color is black");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("thickness 3mm");
	}
	}
public class sample22 {

	public static void main(String[] args) {
		line l1=new line();
		l1.fillingcolor();
		l1.size();
		l1.drawingcolor();
		l1.thickness();
		
		square l2=new square();
		l2.fillingcolor();
		l2.size();
		l2.drawingcolor();
		l2.thickness();
		
		circle l3=new circle();
		l3.fillingcolor();
		l3.size();
		l3.drawingcolor();
		l3.thickness();

	}

}

/*
2.Create two interfaces namely Drawable and Fillable. Create class called Line, Circle, Square and
implement following methods through interface.

<I>Drawable ------ drawingColor(), thickness ()
<I>Fillable ---------- fillingColor (), size ()
*/