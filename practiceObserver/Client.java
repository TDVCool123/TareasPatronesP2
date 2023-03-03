package Observer.practiceObserver;

public class Client {
    public static void main (String []args){

        CompañiaTel upbChannel = new CompañiaTel();
        upbChannel.setName("upb academy");
        upbChannel.setDescription("this academy to share videos");

        Cliente jose = new Cliente("123","Mauricio");
        Cliente ambar = new Cliente("222","Jose");
        Cliente dylan = new Cliente("333","aDRIANA");
        Cliente emanuel = new Cliente("444","Marcos");

        upbChannel.subscription(jose,"Accion");
        upbChannel.subscription(ambar,"Comedia");
        upbChannel.subscription(dylan,"Terror");
        upbChannel.subscription(emanuel,"Comedia");

        // ****************** //

        upbChannel.uploadVideo(new Propaganda("55555","Terror","Chistes"));

    }
}
