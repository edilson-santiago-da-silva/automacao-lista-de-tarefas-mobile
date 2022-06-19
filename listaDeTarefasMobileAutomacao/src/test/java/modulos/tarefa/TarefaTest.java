package modulos.tarefa;


import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.TelaInicial;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


@DisplayName("Testes mobile da adicão de tarefas")
public class TarefaTest {

    private WebDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Moto G5 Plus");
        capacidades.setCapability("platform", "Android");
        capacidades.setCapability("udid", "0044226523");
        capacidades.setCapability("appPackage", "com.splendapps.splendo");
        capacidades.setCapability("appActivity", "com.splendapps.splendo.MainActivity");
        //capacidades.setCapability("app","C:\\Users\\edils\\Downloads\\Lojinha+Android+Nativa\\lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
        app.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @DisplayName("Validação de uma tarefa não permitida")
    @Test
    public void testValidacaoDeTarefaNaoPermitida() {
        String mensagemApresentada = new TelaInicial(app)
                .abrirTelaAdicaoTarefa()
                .configuracaoDatatarefa()
                .configuracaoHorarioTarefa()
                .selecaoRepetirTarefa()
                .submissaoDeTarefaInvalida()
                .obterCampoDeNovaTarefa();

        Assertions.assertEquals("Crie a tarefa aqui", mensagemApresentada);
    }
    @AfterEach
    public void afterEach() {
        app.quit();
    }
}


