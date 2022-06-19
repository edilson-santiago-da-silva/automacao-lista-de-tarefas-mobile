package telas;

import org.openqa.selenium.WebDriver;

public class BaseTela {
    protected WebDriver app;

    public BaseTela(WebDriver app) {
        this.app = app;
    }
}
