package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;




public class JOSEANDRESMORALESCALDERON {
    @Mock
    AsignarHorario asignarHorario;

    @Mock
    Carrera carrera;

    @Mock
    RegistroAcademico registroAcademico;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCodigoHorario() {
        when(registroAcademico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(2);
        when(registroAcademico.getAnio()).thenReturn(2012);
        try {
            Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
            assertEquals(140, horario.getCodigoHorario());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void testDescripcionHorario() {
        when(reg_academico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(2);
        when(reg_academico.getAnio()).thenReturn(2012);
        try {
            Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
            assertEquals("Vespertino", horario.getDescripcion());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}