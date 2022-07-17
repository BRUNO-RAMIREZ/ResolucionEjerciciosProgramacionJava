
public class Posicion{
    private int x;
    private int y;
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void mover(char direccion){
        switch(direccion){
            case 'U': x += 1; break;
            case 'D': x -= 1; break;
            case 'R': y += 1; break;
            case 'L': y -= 1;
        }
    }
    public void mover(int patron){
        while(patron > 0){
            int numero = patron % 10;
            switch(numero){
                case 1: x += 1; break;
                case 2: x -= 1; break;
                case 3: y += 1; break;
                case 4: y -= 1;
            }
            patron /= 10;
        }
    }
}
