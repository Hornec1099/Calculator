public class WaterBottle {

    int Water;

    public WaterBottle(int water){
        this.Water = water;
    }

    public int getWater(){
        return this.Water;
    }
    public int drink(){
        return this.Water -10 ;
    }
    public int empty(){
        return this.Water = 0;
    }
    public int fill(){
        return this.Water = 100;
    }
}
