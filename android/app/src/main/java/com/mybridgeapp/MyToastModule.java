package com.mybridgeapp;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.jetbrains.annotations.NotNull;

public class MyToastModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactContext;

    MyToastModule(ReactApplicationContext context){
        super(context);
        reactContext = context;
    }

    @NonNull
    @NotNull
    @Override
    public String getName() {
        return "MyToastModule";
    }

    @ReactMethod
    public void showMessage(String message){
        Toast.makeText(getReactApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}
