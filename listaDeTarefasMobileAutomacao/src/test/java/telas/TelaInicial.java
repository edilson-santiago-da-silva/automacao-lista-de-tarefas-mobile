package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaInicial extends BaseTela {

    public TelaInicial(WebDriver app) {
        super(app);
    }

    public TelaCadastroDeTarefas abrirTelaAdicaoTarefa(){
        app.findElement(By.id("com.splendapps.splendo:id/fabAddTask")).click();

        return new TelaCadastroDeTarefas(app);
    }
}
