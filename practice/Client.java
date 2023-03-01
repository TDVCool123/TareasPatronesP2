package ChainOfResponsability.practice;

public class Client {
    public static void main(String[]args){
        ResponsablesFallas banco = new ResponsablesFallas();

        banco.prestamo(new LaFalla("Bug","BAJA","bug de diseño"));


    }
}
