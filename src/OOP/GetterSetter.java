package OOP;

public class GetterSetter {

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        if (length==breadth){
            return true;
        }
        else
            return false;
    }

    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int l){
        if (l<0){
            length = 0;
        }
        else
            length = l;
    }

    public void setBreadth(int b){
        breadth = b;
    }

    public static void main(String[] args) {
        GetterSetter rect1 = new GetterSetter();

        rect1.setLength(10);
        rect1.setBreadth(3);

        System.out.println(rect1.area());
        System.out.println(rect1.perimeter());

        System.out.println(rect1.getBreadth());
        System.out.println(rect1.getLength());

        System.out.println(rect1.isSquare());

    }

}
