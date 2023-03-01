package ChainOfResponsability.practice;

public class Critica implements IHandler {
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
        if (laFalla.getSeveridad().equals("CRITICA")){

            System.out.println("INFO> Severidad del problema: " +laFalla.getSeveridad() + " El encargado de resolver el problema es el DEV");
        } else {
            System.out.println("WARN > Severidad del problema:" + laFalla.getSeveridad() +  " El DEV no esta encargado de resolverlo, debe revisarlo el QA ... *pasa problema al QA*");
            next.prestamo(laFalla);
        }
    }
}
