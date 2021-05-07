package exercicios.exercicios01;

//criar a classe Robo que permite um robo ser navegado pelas direções: N,S,L ou O.
// a classe possui coordenadas x, y que indicam a posição atual do robo^no plano cartesiano e um valor maximo nbo pano até o qual ele pode ser movido.
// a cada chamada do metodo para mover o robo, ele deve se deslocar uma unidade
// deve - se verificar se o movimento do robo é valido
// criar os metodos necessarios

public class Robo {
    // atributo = info do robo = caracteristicas
    private int coordX, coordY;
    private final int MAX; // assume plano quadrado
    private final int MAX_PLANO = 100;
    private final int MAX_DEFAULT = 10;

    public Robo(int coordY, int coordX, int MAX) {
        if (MAX > 0 && MAX < MAX_PLANO) {
            this.MAX = MAX;
        } else {
            this.MAX = MAX_DEFAULT;
        }
        if (coordX > -MAX && coordX < MAX) {
            this.coordX = coordX;
        }
        if (coordY > -MAX && coordY < MAX) {
            this.coordY = coordY;
        }
    }

    public String exibir() {
        return coordX + ":" + coordY;
    }

    //metodos = ações

    public void moverNorte(){
        if (coordY<MAX){
            coordY++;
        }
    }

}
