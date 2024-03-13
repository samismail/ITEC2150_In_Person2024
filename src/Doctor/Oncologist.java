package DoctorsAbstract;

public class Oncologist extends Doctor{
    /**
     * superclass
     * public Doctor(String name){
     *         this.name = name;
     *     }
     *
     */
    public Oncologist(String name){
        super(name);
    }

    public String getSchedule(){
        return "Everyday - 10 AM to 2 PM";
    }


}
