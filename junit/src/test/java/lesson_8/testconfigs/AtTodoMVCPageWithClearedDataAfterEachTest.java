package lesson_8.testconfigs;

import org.junit.After;
import org.junit.Before;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;


public class AtTodoMVCPageWithClearedDataAfterEachTest extends BaseTest {
    @Before
    public void openPage() {
        open("https://todomvc4tasj.herokuapp.com/");
    }

    @After
    public void clearData() {
        executeJavaScript("localStorage.clear()");
    }
}
