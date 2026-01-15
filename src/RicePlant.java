public class RicePlant {

    //  2.1:
    // ประกาศตัวแปร instance
    private int id;
    private String riceVariety;
    private GrowthStage stage;

    // 2.2:
    // ประกาศ static variable
    // ใช้เก็บจำนวนต้นข้าวทั้งหมดในนา
    private static int totalPlants = 0;

    // 2.3:
    // constructor(ตัวสร้าง) เพื่อกำหนดค่าเริ่มต้นให้กับตัวแปร instance
    public RicePlant(int id, String riceVariety, GrowthStage stage) {
        this.id = id;
        this.riceVariety = riceVariety;
        this.stage = stage;
        totalPlants++;
    }

    // 2.4:
    // static method คืนค่าจำนวนต้นข้าวทั้งหมด
    public static int getTotalPlants() {
        return totalPlants;
    }

    // 2.5:
    // แสดงข้อมูลต้นข้าว
    public void displayInfo() {
        System.out.println("Plant ID: " + id);
        System.out.println("Rice Variety: " + riceVariety);
        System.out.println("Growth Stage: " + stage);
        System.out.println("------------------------");
    }

    // 2.6 (Challenge – Optional):
    // เปลี่ยนระยะการเจริญเติบโตของต้นข้าว
    public void grow() {
        // เปลี่ยนระยะการเจริญเติบโตไปยังระยะถัดไป
        //switch(การควบคุม)
        switch (stage) {
            case SEED:
                stage = GrowthStage.SPROUT;
                break;
            case SPROUT:
                stage = GrowthStage.VEGETATIVE;
                break;
            case VEGETATIVE:
                stage = GrowthStage.HEADING;
                break;
            case HEADING:
                stage = GrowthStage.HARVEST;
                break;
            case HARVEST:
                // ระยะสุดท้าย ไม่เปลี่ยนแล้ว
                break;
        }
    }
}
