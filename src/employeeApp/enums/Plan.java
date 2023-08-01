package employeeApp.enums;

public enum Plan {

    BASIC("BASIC",1000),
    NORMAL("NORMAL",3000),
    ADVANCE("ADVANCE",5000);
    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){

        return name;
    }
    
    public double getPrice(){

        return price;
    }
}


