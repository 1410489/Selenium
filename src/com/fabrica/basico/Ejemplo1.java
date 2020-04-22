package com.fabrica.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {
    public static void main(String[] args) {
        //instaciar un objeto
        WebDriver driver;

        //declarar variables
        String baseUrl = "http://newtours.demoaut.com/";
        String actualResult="";
        String expectedResult="Welcome: Mercury Tours";

        //Indicar la localizacion del archivo chromedriver.exe
        //donde se encuentra nuestro archivo
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

        //Abrir el navegador chrome
        driver = new ChromeDriver();


    }



}
