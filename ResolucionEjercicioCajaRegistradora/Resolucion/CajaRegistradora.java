
public class CajaRegistradora{
    private String contrasenia;
    private double saldo = 1000;
    private boolean bloqueado;
    private String tipoMoneda;
    public CajaRegistradora(String contrasenia){
        this.contrasenia = contrasenia;
        bloqueado = true;
        tipoMoneda = "Bs";
    }

    public boolean autentificarse(String contrasenia){
        return bloqueado = !this.contrasenia.equals(contrasenia);
    }

    public String ingresarDinero(int monto){
        String reporte;
        if(bloqueado == false){
            if(monto>=0){
                saldo+= monto;
                reporte = "Monto añadido " + monto + ", saldo total " + saldo;
            }else{
                reporte = "Intentelo nuevamente, no se permiten ingresar montos negativos";
            }
        }else{
            reporte = "Por favor, autentifiquese antes de proceder a este servicio";        
        }
        return reporte;
    }

    public String retirarDinero(int retiro){
        String reporte;
        if(bloqueado == false){
            if(retiro <= saldo){
                saldo -= retiro;
                reporte = "Monto retirado " + retiro + ", saldo disponible "+ saldo;
            }else{
                reporte = "Usted no cuenta con ese saldo, disponible " + saldo;
            }
        }else{
            reporte = "Por favor, autentifiquese antes de proceder a este servicio";        
        }
        return reporte;
    }
    
    public String retirarTodoDinero(){
        String reporte;
        if(bloqueado == false){
            reporte = "Se retiro el dinero " + saldo + " "+tipoMoneda+" exitosamente";
            saldo = 0;
        }else{
            reporte = "Porfavor, autentifiquese antes de proceder a este servicio";
        }
        return reporte;
    }
    
    public String consultarDinero(){
        String reporte;
        if(bloqueado == false){
            reporte = "Usted cuenta con " + saldo + " disponible.";
        }else{
            reporte = "Por favor, autentifiquese antes de proceder a este servicio";    
        }
        return reporte;
    }

    public String obtenerGanancias(){
        String reporte;
        if(bloqueado == false){
            reporte = "Las ganancias del dia de hoy son " + saldo * 0.20;
        }else{
            reporte = "Porfavor, autentifiquese antes de proceder a este servicio";    
        }
        return reporte;
    }

    public String cambiarDolaresOBolivianos(){
        String reporte;
        if(bloqueado == false){
            //cambiar de boliviano a dolar
            if(tipoMoneda.equals("Bs")){
                //Actualmente 1 dolar = 6.87 bolivianos
                /*
                dolares              bolivianos
                1                      6.87
                x            Ejemplo = 152
                x = (1*152) / 6.87
                 */
                saldo = saldo / 6.87;
                tipoMoneda = "US";
                reporte = "El cambio de bolivianos a dolares se realizo exitosamente,tu saldo es: " + Math.round(saldo*100.0)/100.0 + " US";
            }
            //Cambiar de dolar a boliviano
            else{
                //Actualmente 1 dolar = 6.87 bolivianos
                /*
                dolares              bolivianos
                1                      6.87
                Ej:80                      x
                x = (80*6.87)/1
                 */
                saldo = saldo * 6.87;
                tipoMoneda = "Bs";
                reporte = "El cambio de dolares a bolivianos se realizo exitosamente, tu saldo es: " + Math.round(saldo*100.0)/100.0 + "Bs";
            }
            //cambiar a boliviano
        }else{
            reporte = "Por favor, autentifiquese antes de proceder a este servicio";    
        }
        return reporte;
    }

    public String cambiarContrasenia(String antiguaContrasenia, String nuevaContrasenia){
        String reporte;
        if(contrasenia.equals(antiguaContrasenia)){
            contrasenia = nuevaContrasenia;
            reporte = "Cambio de contrasenia con exito!!!";
        }else{
            reporte = "Contraseña antigua ingresada es invalida, porfavor intentelo de nuevo";    
        }
        return reporte;
    }
}
