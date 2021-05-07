package exercicios.exercicios01;

public class AppRobo {
    public static void main(String[] args) {
        Robo robo = new Robo (10,10,12);

        System.out.println(robo.exibir());
        robo.moverNorte();
        robo.moverNorte();
        robo.moverNorte();
        robo.moverNorte();
        System.out.println(robo.exibir());

       
    }
    
}


