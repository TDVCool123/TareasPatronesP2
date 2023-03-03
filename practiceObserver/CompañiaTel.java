package Observer.practiceObserver;

import java.util.ArrayList;
import java.util.List;

public class CompañiaTel implements IEmpresa {
    private String name;
    private String description;
    private List<IClient> suscriptorList = new ArrayList<>();
    private List<Propaganda> propagandaList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Propaganda> getVideoList() {
        return propagandaList;
    }

    public void uploadVideo(Propaganda newPropaganda) {
        this.propagandaList.add(newPropaganda);
        this.notify(newPropaganda);
    }

    @Override
    public void subscription(IClient user, String category) {
        user.setCategoryVideo(category);
        suscriptorList.add(user);
    }

    @Override
    public void removeSubscription(IClient user) {
        suscriptorList.remove(user);
    }

    @Override
    public void notify(Propaganda propaganda) {
        for (IClient suscriptor:suscriptorList) {
            if (propaganda.getCategory().equals(suscriptor.getCategoryVideo()))
                suscriptor.update("El canal: ["+name+"] subio un nuevo video: \n", propaganda);
        }
    }
}
