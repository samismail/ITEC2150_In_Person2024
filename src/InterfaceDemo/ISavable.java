package InterfaceDemo;

import java.util.List;
public interface ISavable {

    //public abstract List<String> write();
    List<String> write();

    //public abstract void read();
    void read(List<String> listOfSavedValues);

}

