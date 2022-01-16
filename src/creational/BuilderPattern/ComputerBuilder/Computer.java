package creational.BuilderPattern.ComputerBuilder;

public class Computer {

    private String CPU;
    private String RAM;
    private String HDD;
    private String monitor;
    private String graphicsCard;
    private String SMPS;
    private String keyboard;
    private String mouse;

    public Computer(String cPU, String rAM, String hDD, String monitor, String graphicsCard, String sMPS,
                    String keyboard, String mouse){
        CPU = cPU;
        RAM = rAM;
        HDD = hDD;
        this.monitor = monitor;
        this.graphicsCard = graphicsCard;
        SMPS = sMPS;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    /**
     * @return the CPU
     */
    public String getCPU() {
        return CPU;
    }

    /**
     * @param CPU  the CPU to set
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * @return the RAM
     */
    public String getRAM() {
        return RAM;
    }


    /**
     * @param RAM the RAM to set
     */
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    /**
     * @return the HDD
     */
    public String getHDD() {
        return HDD;
    }

    /**
     * @param HDD the HDD to set
     */
    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    /**
     * @return the monitor
     */
    public String getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the graphicsCard
     */
    public String getGraphicsCard() {
        return graphicsCard;
    }

    /**
     * @param graphicsCard the graphics card to set
     */
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    /**
     * @return the SMPS
     */
    public String getSMPS() {
        return SMPS;
    }

    /**
     * @param SMPS the SMPS to set
     */
    public void setSMPS(String SMPS) {
        this.SMPS = SMPS;
    }

    /**
     * @return the keyboard
     */
    public String getKeyboard() {
        return keyboard;
    }

    /**
     * @param keyboard the keyboard to set
     */
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * @return the mouse
     */
    public String getMouse() {
        return mouse;
    }

    /**
     * @param mouse the mouse to set
     */
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
