package ChainOfResponsability.practice;

public class Alta implements IHandler {
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
            if (laFalla.getSeveridad().equals("ALTA")){

                System.out.println("INFO> Severidad del problema: " +laFalla.getSeveridad() + " El encargado de resolver el problema es el QA");
            } else {
                System.out.println("WARN > Severidad del problema:" + laFalla.getSeveridad() +  " El QA no esta encargado de resolverlo, debe revisarlo el PO ... *pasa problema al PO*");
                next.prestamo(laFalla);
            }
        }
}
