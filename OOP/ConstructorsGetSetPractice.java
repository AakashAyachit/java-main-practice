package OOP;

public class ConstructorsGetSetPractice {

    private String itemNo;
    private String name;
    private int price;
    private int qty;

    public ConstructorsGetSetPractice(String itemno){
        itemNo = itemno;
    }

    public ConstructorsGetSetPractice(String itemno, String name){
        itemNo = itemno;
        this.name = name;
    }

    public ConstructorsGetSetPractice(String itemno, String name, int price, int qty){
        itemNo = itemno;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }
    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int calculateTotal() {
        return price * qty;
    }
    public void displayItem() {
        System.out.println("Item No: " + itemNo);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total: ₹" + calculateTotal());
    }

    public static void main(String[] args) {
        ConstructorsGetSetPractice x1 = new ConstructorsGetSetPractice("1","apple",100,5);
        x1.displayItem();

        System.out.println("-----------------------------------");

        ConstructorsGetSetPractice x2 = new ConstructorsGetSetPractice("2","banana");
        x2.setPrice(200);
        x2.setQty(3);
        x2.displayItem();

    }
}
