/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author brian
 */
public class Selenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }
}
