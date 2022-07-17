import java.util.*;

public class Resolucion{
    //(20%) Dado n, devolver el primer Fibonacci mayor o igual a n.
    public int ejercicio1(int n){
        int a = 1;
        int b = 1;
        int c;
        int primerFibonacci = 0;
        boolean band = false;
        for(int i= 2; i<n && band == false; i++){
            c = a + b;
            a = b;
            b = c;
            if(c >= n){
                primerFibonacci = c;
                band = true;
            }
        }
        return primerFibonacci;
    }
    //20%) dado A y B, devolver la suma de los Fibonacci mayores o iguales A y menores o iguales a B
    public int ejercicio2(int A, int B){
        int a = 1;
        int b = 1;
        int c;
        int suma = 0;
        if(A == 1 && B == 1){
            suma = a + b;
        }else{
            for(int i= 2; i<B; i++){
                c = a + b;
                a = b;
                b = c;
                if(c >= A && c<=B){
                    suma = suma + c;
                }
            }
        }
        return suma;
    }
    //(20%) Dado n, imprimir el numero al revés y decir si el numero escrito al revés es numero primo
    public String ejercicio3(int n){
        String res = "";
        int inverso = 0;
        int digitos = contarDigitos(n) - 1;
        while(n > 0){
            int ultimoDigito = n % 10;
            inverso = ultimoDigito * (int)Math.pow(10,digitos) + inverso; 
            n = n / 10;
            digitos--;
        }
        if(esPrimo(inverso)){
            res = inverso + " es primo";
        }else{
            res = inverso + " no es primo";
        }
        return res;
    }

    private boolean esPrimo(int n){
        boolean res;
        int cont = 2;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                cont++;
            }
        }
        if(n == 1 || n == 0){
            res = false;
        }else{
            if(cont == 2){
                res = true;
            }else{
                res = false;
            }
        }
        return res;
    }

    private int contarDigitos(int n){
        int cont = 0;
        while(n > 0){
            n = n / 10;
            cont++;
        }
        return cont;
    }
    //(20%) Dado n, decir si n es un numero perfecto.
    public String numerPerfecto(int n){
        String res;
        int suma = 1;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                suma = suma  + i;
            }
        }
        if(suma == n){
            res = "es perfecto";
        }else{
            res = "no es perfecto";
        }
        return res;
    }
    //(15%) Dado n imprimir los divisores del número que se formaría si tomamos los dígitos de las posiciones impares de n.
    public void divisoresNumero(int n){
        int cont = 0;
        int aux = 0;
        int inverso = 0;
        while(n > 0){
            if(aux % 2 == 0){
                int ultimoDigito = n % 10;
                inverso = ultimoDigito * (int)Math.pow(10,cont) + inverso;
                cont++;
            }
            aux++;
            n = n / 10;
        }
        for(int i = 1; i<= inverso; i++){
            if(inverso % i == 0){
                System.out.println(i);
            }
        }
    }
    //(15%) Dado n imprimir la suma de las potencias de 2 menores o iguales a n.
    public int potenciasDos(int n){
        int res =0;
        int i = 0;
        int potenciaDos = (int)Math.pow(2,i);
        while(potenciaDos <= n){
            res = res + potenciaDos;
            i++;
            potenciaDos = (int)Math.pow(2,i);
        }
        return res;
    }
}