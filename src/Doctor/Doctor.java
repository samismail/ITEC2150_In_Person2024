package DoctorsAbstract;

/**
 * add getSchedule method - abstract method
 */
public abstract class Doctor {

    protected String name;

    public Doctor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //add getSchedule method - abstract method

    public abstract String getSchedule();


}
