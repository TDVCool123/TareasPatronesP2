package ChainOfResponsability.practice;

public class Media implements IHandler {
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
        if (laFalla.getSeveridad().equals("MEDIA")){

            System.out.println("INFO> Severidad del problema: " +laFalla.getSeveridad() + " El encargado de resolver el problema es el PO");
        } else {
            System.out.println("WARN > Severidad del problema:" + laFalla.getSeveridad() +  " El PO no esta encargado de resolverlo, debe revisarlo el equipo de soporte ... *pasa problema al equipo de soporte*");
            next.prestamo(laFalla);
        }
    }
}
