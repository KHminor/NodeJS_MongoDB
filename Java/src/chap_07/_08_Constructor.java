package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        System.out.println(b1.serialNumber);
        BlackBox b2 = new BlackBox("까망이", "UHD", 300000, "블랙");
        System.out.println(b2.serialNumber);
    }
}