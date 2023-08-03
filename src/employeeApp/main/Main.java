package employeeApp.main;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.HealthPlan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        HealthPlan healthPlan1 = new HealthPlan(1,"X", Plan.BASIC);
        HealthPlan healthPlan2 = new HealthPlan(2,"Y",Plan.ADVANCE);
        String[] healtplans=new String[4];
        healtplans[0]=healthPlan1.getName();
        healtplans[1]=healthPlan2.getName();

        System.out.println(healthPlan1.getPlan().getPrice());

        Employee employee = new Employee(1,"gozde apk","lafhladhf","OIDJO", healtplans);



    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
