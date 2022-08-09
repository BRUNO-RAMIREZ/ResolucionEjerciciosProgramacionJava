
public class EjerciciosPP{
    public int ejercicio1(int num){
        int crapulo;
        int sumaDigs = 0;
        int numAux = num;
        sumaDigs = sumaDigitos(num);
        if(sumaDigs < 10){
            crapulo = sumaDigs;
        }else{
            crapulo = sumaDigitos(sumaDigs);
        }
        return crapulo;
    }
    private int sumaDigitos(int num){
        int sumaDigs = 0;
        while(num > 0){
            int ultDig = num % 10;
            sumaDigs += ultDig;
            num /= 10;
        }
        return sumaDigs;
    }
    public String ejercicio2(int num){
        String res ="";
        int cantDig = (int)Math.log10(num) + 1;
        int orden = 0;
        while(cantDig > 0){
            orden++;
            cantDig -= orden;
        }
        if(cantDig == 0){
            boolean par = num  % 2 == 0;
            boolean esMAlternante = true;
            for(int i = orden; i>0; i--){
                for(int j = 0; j < i; j++){
                    if(num % 2 == 0 != par){
                        esMAlternante = false;
                    }
                    num /= 10;
                }
                par = !par;
            }
            if(esMAlternante){
                res = "Es un numero M-Alternante de orden: " +orden;
            }else{
                res = "No es un numero M-Alternante";
            }
        }else{
            res = "No es un numero M-Alternante";
        }
        return res;
    }
    public double ejercicio4(int x){
        double res = 0;
        for(int i = 0; i < x; i++){ // 1 < 2    2<3
            double factorial = factorial(i);// 1    2
            double division = Math.pow(x,i) / factorial;//1/1     4/2
            res += division;//2    +  2
        }
        return res;
    }
    private int factorial(int num){
        int res = 1;
        if(num == 0 || num == 1){
            res = 1;
        }else{
            for(int i=2; i<=num; i++){
                res = res * i;
            }
        }
        return res;
    }
    public int ejercicio5(int binario){
        int decimal = 0;
        int pos = 0;
        for(int i = binario; i > 0; i /= 10){
            if(i % 10 == 1){
                decimal += (int)Math.pow(2,pos);
            }
            pos++;
        }
        return decimal;
    }
    public String ejercicio6(int hora, int minuto, int segundo){
        String res = "";
        if(hora == 23 && minuto == 59 && segundo == 59){
            res = "00:00:00";
        }else if(hora != 23 && minuto == 59 && segundo == 59){
            hora = hora + 1;
            if(hora >=0 && hora <10){
                res = "0"+hora+":00:00";
            }else{
                res = hora + ":00:00";
            }
        }else if(hora <= 23 && minuto != 59 && segundo == 59){
            minuto = minuto + 1;
            if(hora >=0 && hora <10){
                if(minuto >= 0 && minuto < 10){
                    res = "0"+(hora)+":0"+minuto+":00";
                }else{
                    res = "0"+(hora)+":"+minuto+":00";
                }
            }else{
                if(minuto >= 0 && minuto < 10){
                    res = hora+":0"+minuto+":00";
                }else{
                    res = hora+":"+minuto+":00";
                }
            }
        }else{
            segundo = segundo + 1;
            if(hora>=0 && hora<10 && minuto>=0 && minuto<10 && segundo>=0 && segundo<10){
                res = "0"+hora + ":0" + minuto + ":0" + segundo;
            }else if(hora>=0 && hora<10 && minuto>=0 && minuto<10 && segundo >= 10){
                res = "0"+hora + ":0" + minuto + ":" + segundo;
            }else if(hora>=0 && hora<10 && minuto>=10 && segundo >= 10){
                res = "0"+hora + ":"+ minuto + ":" + segundo;
            }else if(hora>=0 && hora<10 && minuto>=10 && segundo>=0 && segundo<10){
                res = "0"+hora + ":"+ minuto + ":0"+segundo;
            }else if(hora>=10 && minuto>=0 && minuto<10 && segundo>=0 && segundo<10){
                res = hora + ":0" + minuto + ":0" + segundo;
            }else if(hora>=10 && minuto>=10 && segundo>=0 && segundo<10){
                res = hora +":"+ minuto + ":0" + segundo;
            }else{
                res = hora + ":"+ minuto + ":" + segundo;
            }
        }
        return res;
    }
    
    public String ejercicio7(int n){
        String res = "";
        String asteriscos = "";
        int aux = n;
        for(int i=1; i<=n; i++){  
            for(int j=0; j<aux; j++){
                asteriscos += "*";
            }
            res += cantidadEspacios(n-i) + asteriscos +"\n";
            asteriscos = "";
            aux += 2;
        }
        int pos = 1;
        for(int i=2; i<=n; i++){  
            for(int j=aux-4; j>0; j--){
                asteriscos += "*";
            }
            res += cantidadEspacios(pos) + asteriscos +"\n";
            asteriscos = "";
            pos++;
            aux -= 2;
        }
        return res;
    }
    private String cantidadEspacios(int n){
        String res ="";
        for(int i=0; i<n; i++){
            res += " ";
        }
        return res;
    }
    public String ejercicio8(){
        String res = "";
        String aux = "";
        int resultado;
        for(int i = 1; i<=9; i++){
            aux += i;
            resultado = Integer.parseInt(aux) * 8 + i;
            res += aux + " x " + "8 + " + i + " = " + resultado + "\n";
        }
        return res;
    }
    public String ejercicio9(){
        String res = "";
        for(int i = 0; i<16; i++){
            res += convertirBinario(i) + "\n";            
        }
        return res;
    }
    public String convertirBinario(int dividendo){
        String res = "";
        boolean band = true;
        while(band == true){
            int residuo = dividendo % 2;
            int cociente = dividendo / 2;
            res = residuo + res;
            if(cociente == 1 || cociente == 0){
                res  = cociente + res;
                band = false;
            }
            dividendo = cociente;
        }
        if(res.length() == 2){
            res = "00" + res;
        }else if(res.length() == 3){
            res = "0" + res;
        }
        return res;
    }
    
    public String ejercicio10(int n){
        String res = "";
        String numeros = "";
        int suma = 0;
        int resultado = 1;
        int aux = 1;
        for(int i = 0; i<n; i++){
            res += "(";
            for(int j=0; j<i+1; j++){
                if(j != i){
                    numeros += aux + "+";
                }else{
                    numeros += aux;
                }
                suma += aux;
                aux++;
            }
            resultado *= suma;
            suma = 0;
            res += numeros +")";
            numeros = "";
            if(i != n - 1){
                res += "*";
            }
        }
        return res + " = " + resultado;
    }
    
    public String ejercicio11(int n){
        String res = "";
        int unidades,decenas,centenas,millar;
        unidades = n%10; n /= 10;
        decenas = n%10; n/= 10;
        centenas = n%10; n/= 10;
        millar = n%10; n/= 10;
        switch(millar){
            case 1: res += "M";break;
            case 2: res += "MM";break;
            case 3: res += "MMM"; break;
        }
        switch(centenas){
            case 1: res += "C";break;
            case 2: res += "CC";break;
            case 3: res += "CCC";break;
            case 4: res += "CD";break;
            case 5: res += "D";break;
            case 6: res += "DC";break;
            case 7: res += "DCC";break;
            case 8: res += "DCCC";break;
            case 9: res += "CM";break;
            case 10: res += "M";break;
        }
        switch(decenas){
            case 1: res += "X";break;
            case 2: res += "XX";break;
            case 3: res += "XXX";break;
            case 4: res += "LX";break;
            case 5: res += "L";break;
            case 6: res += "LX";break;
            case 7: res += "LXX";break;
            case 8: res += "LXXX";break;
            case 9: res += "XC";break;
            case 10: res += "C";break;
        }
        switch(unidades){
            case 1: res += "I";break;
            case 2: res += "II";break;
            case 3: res += "III";break;
            case 4: res += "IV";break;
            case 5: res += "V";break;
            case 6: res += "VI";break;
            case 7: res += "VII";break;
            case 8: res += "VIII";break;
            case 9: res += "IX";break;
            case 10: res += "X";break;
        }
        return res;
    }
}
