package employeeApp.model;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    String[] developerNames;

    public Company(long id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        checkGiro();
        this.developerNames=developerNames;
    }

    private void checkGiro(){
        if (giro<0){
            this.giro=0;
        }else {
            this.giro=giro;
        }
    }
    //GETTER METHODS

    public long getId(){
        return id;
    }
    public  String getName(){
        return name;
    }
    public double getGiro(){
        return giro;
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }

    //SETTER METHODS

    public void setId(){
        this.id=id;
    }
    public void setName(){
        this.name=name;
    }
    public void setGiro(){
        this.giro=giro;
    }
    public void setDeveloperNames(){
        this.developerNames=developerNames;
    }

    public void addEmployee(int index,String name){
        try{
            if (developerNames[index] == null){
                developerNames[index]= name;
            }else {
                System.out.println("İlgili index dolu...");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("olmayan index içine atama yapıldı");
        }
    }

    public String toString(){
        return "Name:"+ name+ "Ciro:"+ giro + "Developers:"+ Arrays.toString(developerNames)
;    }
}
