package com.twitter.test;

import com.twitter.appmanager.ApplicationManager;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  public ApplicationManager getApp() {
    return app;
  }
}
