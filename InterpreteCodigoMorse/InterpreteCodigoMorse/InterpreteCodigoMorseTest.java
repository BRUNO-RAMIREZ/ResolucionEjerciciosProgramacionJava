
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterpreteCodigoMorseTest
{
    private InterpreteCodigoMorse interprete;

    @BeforeEach
    public void setUp(){
        interprete = new InterpreteCodigoMorse();
    }

    @Test
    public void primerCaso(){
        String respuesta = interprete.interpretarCodigo("....*---*.-..*.-");
        String respuestaEsperada = "HOLA";
        assertEquals(respuesta, respuestaEsperada);
    }

    @Test
    public void segundoCaso(){
        String respuesta = interprete.interpretarCodigo("-*.*-.*--.*---@....*.-*--*-...*.-.*.");
        String respuestaEsperada = "TENGO HAMBRE";
        assertEquals(respuesta, respuestaEsperada);
    }

    @Test
    public void tercerCaso(){
        String respuesta = interprete.interpretarCodigo("....*-.-.-..*.-..*.-");
        String respuestaEsperada = "H#LA";
        assertEquals(respuesta, respuestaEsperada);
    }
}
