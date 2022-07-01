
public class InterpreteCodigoMorse{
    String[] codigoMorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
    char[] abecedarioYNumeros = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
    public  String interpretarCodigo(String codigo){
        String respuesta ="";
        String[] codigoArreglo = codigo.split("\\*");
        for(int i = 0; i<codigoArreglo.length; i++){
            String codigoActual = codigoArreglo[i];
            String aux2 = buscarLetra(codigoActual);
            if(aux2 != ""){
                respuesta = respuesta + aux2;
            }
        }
        return respuesta;
    }

    public String buscarLetra(String codigo){
        String res = "";
        boolean band = false;
        String[] codigoSubArreglo = codigo.split("@");
        int tamanio = codigoSubArreglo.length;
        for(int i = 0; i< codigoSubArreglo.length; i++){
            String codigoActual = codigoSubArreglo[i];
            band = false;
            for(int j = 0; j < codigoMorse.length && band == false; j++){
                if(codigoActual.equals(codigoMorse[j])){
                    if(tamanio != 1){
                        res = res + abecedarioYNumeros[j] + " ";
                        tamanio--;
                    }else{
                    res = res  + abecedarioYNumeros[j];
                    }
                    band = true;
                }
            }
            if(band == false){
                res = res + "#";
            }
        }
        return res;
    }
}
