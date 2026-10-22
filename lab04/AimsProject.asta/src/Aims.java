public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart (Section 7)
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Hiển thị danh sách DVD và tổng tiền theo format yêu cầu
        System.out.println("--- Cart items before removal ---");
        anOrder.print();

        // Section 8: Test xóa một đĩa khỏi giỏ hàng
        System.out.println("\n--- Testing removeDigitalVideoDisc ---");
        anOrder.removeDigitalVideoDisc(dvd2);

        // Hiển thị lại giỏ hàng và tổng tiền sau khi xóa
        System.out.println("\n--- Cart items after removal ---");
        anOrder.print();
    }
}