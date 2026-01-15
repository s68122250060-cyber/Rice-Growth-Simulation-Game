public class RiceGameDemo {

    public static void main(String[] args) {

        // 3.1:
        // สร้างต้นข้าวอย่างน้อย 3 ต้น
        RicePlant r1 = new RicePlant(1, "Jasmine Rice", GrowthStage.SEED);
        RicePlant r2 = new RicePlant(2, "Sticky Rice", GrowthStage.SPROUT);
        RicePlant r3 = new RicePlant(3, "Brown Rice", GrowthStage.VEGETATIVE);

        // 3.2:
        // เรียก displayInfo() ของต้นข้าวแต่ละต้น
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();

        // 3.3:
        // แสดงจำนวนต้นข้าวทั้งหมดในนา
        System.out.println("Total rice plants: " + RicePlant.getTotalPlants());

        // 3.4 (Challenge – Optional):
        // เรียก method grow() และแสดงผลอีกครั้ง
        r1.grow();
        r2.grow();
        r3.grow();

        System.out.println("After growing:");
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();
    }
}
