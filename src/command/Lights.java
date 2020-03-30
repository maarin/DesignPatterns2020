package command;

public class Lights {
    private Boolean isLightsOn;

    public void switchOn(){
        System.out.println("Lights are on.");
        this.isLightsOn = true;
    }

    public void switchOff(){
        System.out.println("Lights are off.");
        this.isLightsOn = false;
    }
}
