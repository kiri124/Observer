import java.util.ArrayList;
import java.util.List;

public class producto implements subject {

private  List<observer> observers = new ArrayList<>();
        //lista llamada observers
private boolean disponible=false;
@Override
public void AddObserver(observer observer){
observers.add(observer);
}

@Override 
public void removeObserver(observer observer){
    observers.remove(observer);
}

@Override
public void notifyObserver(){
if (disponible){
    for (observer observer : observers){
        observer.update("actualiza");
    }
}
}
public void setDisponible(boolean disponible){
this.disponible=disponible;
if (disponible){
    notifyObserver();
}
}

}
