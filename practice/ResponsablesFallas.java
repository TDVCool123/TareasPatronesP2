package ChainOfResponsability.practice;

public class ResponsablesFallas implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void prestamo(LaFalla laFalla) {

        Critica asesor = new Critica();
        Alta director = new Alta();
        Media gerente = new Media();
        Baja presidente = new Baja();

        this.setNext(asesor);
        asesor.setNext(director);
        director.setNext(gerente);
        gerente.setNext(presidente);

        this.next.prestamo(laFalla);

    }
}
