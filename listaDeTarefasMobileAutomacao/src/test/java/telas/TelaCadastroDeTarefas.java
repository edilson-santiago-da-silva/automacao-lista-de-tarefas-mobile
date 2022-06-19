package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaCadastroDeTarefas extends BaseTela {

    public TelaCadastroDeTarefas(WebDriver app) {
        super(app);
    }
    public TelaCadastroDeTarefas configuracaoDatatarefa() {
        app.findElement(By.id("com.splendapps.splendo:id/edtDueD")).click();
        app.findElement(By.xpath("//android.view.View[@text='17']")).click();
        app.findElement(By.id("android:id/button1")).click();

        return this;
    }
    public TelaCadastroDeTarefas configuracaoHorarioTarefa() {
        app.findElement(By.id("com.splendapps.splendo:id/btnSetT")).click();
        app.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='18']")).click();
        app.findElement(By.id("android:id/button1")).click();

        return this;
    }
    public TelaCadastroDeTarefas selecaoRepetirTarefa() {
        app.findElement(By.id("com.splendapps.splendo:id/spinnerRepeat")).click();
        app.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();

        return this;
    }
    public TelaCadastroDeTarefas submissaoDeTarefaInvalida() {
        app.findElement(By.id("com.splendapps.splendo:id/fabSaveTask")).click();

        return this;
    }
    public String obterCampoDeNovaTarefa() {
        return app.findElement(By.id("com.splendapps.splendo:id/edtTaskName")).getText();

    }
}
