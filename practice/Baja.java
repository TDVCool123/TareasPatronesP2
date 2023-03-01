package ChainOfResponsability.practice;

public class Baja implements IHandler {
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
        // cadena
        System.out.println("--------------------------------------------------------");
        laFalla.showInfo();
        if (laFalla.getSeveridad().equals("BAJA")){

            System.out.println("INFO> Severidad del problema: " +laFalla.getSeveridad() + " El encargado de resolver el problema es el equipo de soporte");
        }
    }
}
