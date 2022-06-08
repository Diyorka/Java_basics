package Enum;

public enum Season {
    SUMMER(38),WINTER(0),AUTUMN(10),SPRING(20);

    private int temperature;

    Season(int temperature){
        this.temperature=temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
