
public class Robot{
    Posicion posicion;
    public Robot(){
        posicion = new Posicion(0,0);
    }
    public String adelante(){
        char UP = 'U';
        posicion.mover(UP);
        return "El robot se encuentra en ( " + posicion.getX() + " , " + posicion.getY() + " )"; 
    }
    public String atras(){
        char DOWN = 'D';
        posicion.mover(DOWN);
        return "El robot se encuentra en ( " + posicion.getX() + " , " + posicion.getY() + " )"; 
    }
    public String derecha(){
        char RIGHT = 'R';
        posicion.mover(RIGHT);
        return "El robot se encuentra en ( " + posicion.getX() + " , " + posicion.getY() + " )"; 
    }
    public String izquierda(){
        char LEFT = 'L';
        posicion.mover(LEFT);
        return "El robot se encuentra en ( " + posicion.getX() + " , " + posicion.getY() + " )"; 
    }
    public String caminar(int patron){
        posicion.mover(patron);
        return "El robot se encuentra en ( " + posicion.getX() + " , " + posicion.getY() + " )"; 
    }
}
