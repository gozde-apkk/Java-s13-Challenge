package employeeApp.model;

import java.util.Arrays;

public class Employee {

    private long id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id,String fullname, String email,String password,String[] healthPlans){
        this.id=id;
        this.fullname= fullname;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;
    }


    //GETTER METHODS
    public  long getId(){
        return id;
    }

    public String getFullName(){
        return fullname;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String[] getHealthPlans(){
        return healthPlans;
    }

    //SETTER METHODS

    public void setId(){
        this.id=id;
    }
    public void setFullName(){
        this.fullname=fullname;
    }
    public void setEmail(){
        this.email=email;
    }
    public void setPassword(){
        this.password=password;
    }
    public void setHealthPlans(){
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        try{
            if (healthPlans == null){
                healthPlans[index] = name;
            }else{
                System.out.println("İlgili index dolu..");
            }
        }catch(ArrayIndexOutOfBoundsException ex) {//alacağımız hatayı ön gördük
            System.out.println("olmayan index için atama yapıldı");//indexin lengthinden büyük bir endekse name girmeye çalıştık
        }
    }

    public String toString(){
        return "FullName: "+fullname+"Healthplan: "+ Arrays.toString(healthPlans);
    }
}
