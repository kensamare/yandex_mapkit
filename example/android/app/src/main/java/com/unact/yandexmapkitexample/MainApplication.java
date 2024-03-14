package com.unact.yandexmapkitexample;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class MainApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    MapKitFactory.setApiKey("33edd24d-ea27-47be-8c78-464b5de3f0e3");
  }
}
