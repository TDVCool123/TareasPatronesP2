package Observer.practiceObserver;

public interface IClient {
    void update(String message, Propaganda propaganda);
    void setCategoryVideo(String categoria);
    String getCategoryVideo();
}
