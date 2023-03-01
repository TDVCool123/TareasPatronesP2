package ChainOfResponsability.practice;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void prestamo(LaFalla laFalla);
}
