
public class EjerciciosC{
    public String ejercicio1(int n){
        String res = "", auxCad = "";
        int aux = 1, aux2 = 12, espacios = n - 1;
        for(int i = 0; i < n; i++){
            if(aux <= 11){
                for(int j = i+1; j <= aux; j++){
                    if(j > 9){
                        auxCad += (j-10); 
                    }else{
                        auxCad += j;
                    }
                }
                for(int j = aux-1; j >= i+1; j--){
                    if(j > 9){
                        auxCad += (j-10); 
                    }else{
                        auxCad += j;
                    }
                }
                auxCad = cantidadEspacios(espacios) + auxCad;
                res += auxCad + "\n";
                auxCad = "";
                aux+=2;
                espacios--;
            }else{//i = 6
                for(int j = i+1; j <= aux2; j++){//7    7<=12  8 <= 12  9<=12  10<=12  11<= 12
                    if(j > 9){//7 > 9
                        if(j == 11){
                            auxCad += j;
                        }else{
                            auxCad += (j-10);
                        }
                    }else{
                        auxCad += j; //auxCad += 7
                    }
                }
                for(int j = aux2-1; j >= i+1; j--){// 11 >= 7 10>=7 9 >=7  8 >= 7 
                    if(j > 9){//11 > 9  10 > 9  9>9  8 > 9
                        if(j == 11){
                            auxCad += j;//11
                        }else{
                            auxCad += (j-10);// 11 0
                        }
                    }else{
                        auxCad += j; //11 0 9 8 7 
                    }
                }
                auxCad = cantidadEspacios(espacios) + auxCad;
                res += auxCad + "\n"; // 7 8 9 0 11 2 11 0 9 8 7 
                auxCad = "";
                aux2+=2;
                espacios--;
            }
        }   
        return res;
    }

    private String cantidadEspacios(int n){
        String res = "";
        for(int i = 0; i < n; i++){
            res += " ";
        }
        return res;
    }

    public String ejercicio2(int base){
        String res = "";
        for(int i = 0; i < base; i++){
            for(int j = 1; j <= i + 1; j++){
                res+= "*";
            }
            res += "\n";
        }
        return res;
    }

    public String construirArbolPino(int altCopa, int altTronco){
        String res ="", copa = "", tronco = "";
        int espaciosCopa = altCopa-1, aux = 1, tamEstrellas = 0;
        for(int i = 0; i < altCopa; i++){
            for(int j = 1; j <= aux; j++){
                copa += "*";
            }
            tamEstrellas = copa.length();
            copa = cantidadEspacios(espaciosCopa) + copa + "\n";
            res += copa;
            copa = "";
            aux+=2;
            espaciosCopa--;
        }
        if(altCopa % 2 == 0){
            altCopa--;
        }
        for(int j = 1; j <= altTronco; j++){
            for(int k = 0 ; k < altCopa; k++){
                tronco += "*";
            }
            tronco = cantidadEspacios((tamEstrellas - tronco.length())/2) + tronco + "\n";
            res += tronco;
            tronco = "";
        }    
        return res;
    }

    public String arbol2(int altCopa, int altTronco){
        String res ="", copa = "", tronco = "";
        int  aux = 1,aux2 = 2, tamEstrellas = 0;
        int espaciosCopa = altCopa;
        for(int i = 0; i < altCopa; i++){
            for(int j = 1; j <= aux2; j++){
                for(int k = 1; k <= aux; k++){
                    copa += "*";
                }
                aux += 2;
                tamEstrellas = copa.length();
                copa  = cantidadEspacios(espaciosCopa) + copa + "\n";
                res += copa;
                copa = "";
                espaciosCopa--;
            }
            aux = 1;
            aux2++;
            espaciosCopa = altCopa;
        } 
        if(altCopa % 2 == 0){
            altCopa++;
        }
        for(int j = 1; j <= altTronco; j++){
            for(int k = 0 ; k < altCopa; k++){
                tronco += "*";
            }
            tronco = cantidadEspacios((tamEstrellas - tronco.length())/2) + tronco + "\n";
            res += tronco;
            tronco = "";
        }  
        return res;
    }
    
    public String generarTablaMultiplicacion(){
        String res = "";
        for(int i = 0; i < 10; i++){
            int a = i + 1;
            for(int j = 0; j < 10; j++){
                int b = j + 1;
                res += a + " x " + b + " = " + (a * b) + "\n";
            }
            res += "\n";
        }   
        return res;
    }
}
