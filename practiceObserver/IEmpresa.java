package Observer.practiceObserver;

public interface IEmpresa {
    void subscription(IClient user, String category);
    void removeSubscription(IClient user);
    void notify(Propaganda propaganda);
}
