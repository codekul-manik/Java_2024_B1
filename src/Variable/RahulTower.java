package Variable;

public class RahulTower {
    static int waterCapacity = 100;
    int personalWaterCapacity = 0;

    public static void main(String[] args) {

        RahulTower flat501 = new RahulTower();
        flat501.personalWaterCapacity = 400;
        waterCapacity = waterCapacity - 80;

        RahulTower flat401 = new RahulTower();
        flat401.personalWaterCapacity = 350;
        waterCapacity = waterCapacity - 20;

        System.out.println(flat501.personalWaterCapacity);      //
        System.out.println(waterCapacity);                      //
        System.out.println(flat401.personalWaterCapacity);      //
        System.out.println(waterCapacity);                      //
    }
}
