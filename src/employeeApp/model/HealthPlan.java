package employeeApp.model;


import employeeApp.enums.Plan;

public class HealthPlan {
    private long id;
    private String name;

    private Plan plan;

    public HealthPlan(long id, String name, Plan plan){
        this.id = id;
        this.name=name;
        this.plan = plan;
    }

    //GETTER METHODS
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Plan getPlan(){
        return plan;
    }

    //SETTER METHODS
    public void setId(){
        this.id=id;
    }

    public void setName(){
        this.name = name;
    }

    public void setPlan(){
        this.plan = plan ;
    }

    public String toString(){
        return "HealthPlan= "+"id: "+id+"name: "+name+"plan: "+plan;
    }
}
