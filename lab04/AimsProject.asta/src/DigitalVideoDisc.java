public class DigitalVideoDisc {
    // Thuộc tính static dùng chung cho toàn bộ lớp để đếm số đĩa
    private static int nbDigitalVideoDiscs = 0;

    // Thuộc tính riêng của từng đối tượng
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // 1. Constructor theo title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 2. Constructor theo category, title, cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 3. Constructor theo director, category, title, cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 4. Constructor đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Các Getter sẵn có
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Setter tạm thời của Section 10
    public void setTitle(String title) {
        this.title = title;
    }
}