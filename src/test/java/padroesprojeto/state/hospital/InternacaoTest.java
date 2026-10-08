package padroesprojeto.state.hospital;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InternacaoTest {

    Internacao internacao;

    @BeforeEach
    public void setUp() {
        internacao = new Internacao();
    }

    // Paciente Internado

    @Test
    public void naoDeveInternarPacienteInternado() {
        internacao.setEstado(InternacaoEstadoInternado.getInstance());
        assertFalse(internacao.internar());
        assertEquals(InternacaoEstadoInternado.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveDarAltaMedicaPacienteInternado() {
        internacao.setEstado(InternacaoEstadoInternado.getInstance());
        assertTrue(internacao.darAltaMedica());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveColocarEmObservacaoPacienteInternado() {
        internacao.setEstado(InternacaoEstadoInternado.getInstance());
        assertTrue(internacao.colocarEmObservacao());
        assertEquals(InternacaoEstadoEmObservacao.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveDarAltaAdministrativaPacienteInternado() {
        internacao.setEstado(InternacaoEstadoInternado.getInstance());
        assertTrue(internacao.darAltaAdministrativa());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveRegistrarEvasaoPacienteInternado() {
        internacao.setEstado(InternacaoEstadoInternado.getInstance());
        assertTrue(internacao.registrarEvasao());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveTransferirPacienteInternado() {
        internacao.setEstado(InternacaoEstadoInternado.getInstance());
        assertTrue(internacao.transferir());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    // Paciente EmObservacao

    @Test
    public void deveInternarPacienteEmObservacao() {
        internacao.setEstado(InternacaoEstadoEmObservacao.getInstance());
        assertTrue(internacao.internar());
        assertEquals(InternacaoEstadoInternado.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaMedicaPacienteEmObservacao() {
        internacao.setEstado(InternacaoEstadoEmObservacao.getInstance());
        assertFalse(internacao.darAltaMedica());
        assertEquals(InternacaoEstadoEmObservacao.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveColocarEmObservacaoPacienteEmObservacao() {
        internacao.setEstado(InternacaoEstadoEmObservacao.getInstance());
        assertFalse(internacao.colocarEmObservacao());
        assertEquals(InternacaoEstadoEmObservacao.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveDarAltaAdministrativaPacienteEmObservacao() {
        internacao.setEstado(InternacaoEstadoEmObservacao.getInstance());
        assertTrue(internacao.darAltaAdministrativa());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveRegistrarEvasaoPacienteEmObservacao() {
        internacao.setEstado(InternacaoEstadoEmObservacao.getInstance());
        assertTrue(internacao.registrarEvasao());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveTransferirPacienteEmObservacao() {
        internacao.setEstado(InternacaoEstadoEmObservacao.getInstance());
        assertFalse(internacao.transferir());
        assertEquals(InternacaoEstadoEmObservacao.getInstance(), internacao.getEstado());
    }

    // Paciente AltaMedica

    @Test
    public void naoDeveInternarPacienteAltaMedica() {
        internacao.setEstado(InternacaoEstadoAltaMedica.getInstance());
        assertFalse(internacao.internar());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaMedicaPacienteAltaMedica() {
        internacao.setEstado(InternacaoEstadoAltaMedica.getInstance());
        assertFalse(internacao.darAltaMedica());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveColocarEmObservacaoPacienteAltaMedica() {
        internacao.setEstado(InternacaoEstadoAltaMedica.getInstance());
        assertFalse(internacao.colocarEmObservacao());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaAdministrativaPacienteAltaMedica() {
        internacao.setEstado(InternacaoEstadoAltaMedica.getInstance());
        assertFalse(internacao.darAltaAdministrativa());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveRegistrarEvasaoPacienteAltaMedica() {
        internacao.setEstado(InternacaoEstadoAltaMedica.getInstance());
        assertFalse(internacao.registrarEvasao());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveTransferirPacienteAltaMedica() {
        internacao.setEstado(InternacaoEstadoAltaMedica.getInstance());
        assertFalse(internacao.transferir());
        assertEquals(InternacaoEstadoAltaMedica.getInstance(), internacao.getEstado());
    }

    // Paciente AltaAdministrativa

    @Test
    public void naoDeveInternarPacienteAltaAdministrativa() {
        internacao.setEstado(InternacaoEstadoAltaAdministrativa.getInstance());
        assertFalse(internacao.internar());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaMedicaPacienteAltaAdministrativa() {
        internacao.setEstado(InternacaoEstadoAltaAdministrativa.getInstance());
        assertFalse(internacao.darAltaMedica());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveColocarEmObservacaoPacienteAltaAdministrativa() {
        internacao.setEstado(InternacaoEstadoAltaAdministrativa.getInstance());
        assertFalse(internacao.colocarEmObservacao());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaAdministrativaPacienteAltaAdministrativa() {
        internacao.setEstado(InternacaoEstadoAltaAdministrativa.getInstance());
        assertFalse(internacao.darAltaAdministrativa());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveRegistrarEvasaoPacienteAltaAdministrativa() {
        internacao.setEstado(InternacaoEstadoAltaAdministrativa.getInstance());
        assertFalse(internacao.registrarEvasao());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveTransferirPacienteAltaAdministrativa() {
        internacao.setEstado(InternacaoEstadoAltaAdministrativa.getInstance());
        assertFalse(internacao.transferir());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    // Paciente Evasao

    @Test
    public void naoDeveInternarPacienteEvasao() {
        internacao.setEstado(InternacaoEstadoEvasao.getInstance());
        assertFalse(internacao.internar());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaMedicaPacienteEvasao() {
        internacao.setEstado(InternacaoEstadoEvasao.getInstance());
        assertFalse(internacao.darAltaMedica());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveColocarEmObservacaoPacienteEvasao() {
        internacao.setEstado(InternacaoEstadoEvasao.getInstance());
        assertFalse(internacao.colocarEmObservacao());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveDarAltaAdministrativaPacienteEvasao() {
        internacao.setEstado(InternacaoEstadoEvasao.getInstance());
        assertTrue(internacao.darAltaAdministrativa());
        assertEquals(InternacaoEstadoAltaAdministrativa.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveRegistrarEvasaoPacienteEvasao() {
        internacao.setEstado(InternacaoEstadoEvasao.getInstance());
        assertFalse(internacao.registrarEvasao());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveTransferirPacienteEvasao() {
        internacao.setEstado(InternacaoEstadoEvasao.getInstance());
        assertFalse(internacao.transferir());
        assertEquals(InternacaoEstadoEvasao.getInstance(), internacao.getEstado());
    }

    // Paciente Transferido

    @Test
    public void naoDeveInternarPacienteTransferido() {
        internacao.setEstado(InternacaoEstadoTransferido.getInstance());
        assertFalse(internacao.internar());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaMedicaPacienteTransferido() {
        internacao.setEstado(InternacaoEstadoTransferido.getInstance());
        assertFalse(internacao.darAltaMedica());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveColocarEmObservacaoPacienteTransferido() {
        internacao.setEstado(InternacaoEstadoTransferido.getInstance());
        assertFalse(internacao.colocarEmObservacao());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveDarAltaAdministrativaPacienteTransferido() {
        internacao.setEstado(InternacaoEstadoTransferido.getInstance());
        assertFalse(internacao.darAltaAdministrativa());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveRegistrarEvasaoPacienteTransferido() {
        internacao.setEstado(InternacaoEstadoTransferido.getInstance());
        assertFalse(internacao.registrarEvasao());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    @Test
    public void naoDeveTransferirPacienteTransferido() {
        internacao.setEstado(InternacaoEstadoTransferido.getInstance());
        assertFalse(internacao.transferir());
        assertEquals(InternacaoEstadoTransferido.getInstance(), internacao.getEstado());
    }

    @Test
    public void deveIniciarComoInternado() {
        assertEquals("Internado", internacao.getNomeEstado());
    }
}
