package creational.BuilderPattern.ComputerBuilder;

public class Assembler {
    public static void main(String [] args){
        Computer computer = new ConcreteComputerBuilder("Intel", "8 gb",
                "1 TB Segate HDD", "LCD Monitor", "Radeon Graphics Card", "220 V SMPS",
                "Logitech Key Board", "Wireless Mouse").buildComputer();
        System.out.println(computer.toString());
    }
}
