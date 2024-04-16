package com.euroTech.tests.day04_basic_locators;

public class _3_ByClassName {
    public static void main(String[] args) {
        /**
         * open chrome browser and navigate to http://www.eurotech.study/
         * accept cookies if any
         * locate main paragraph web element by using class name locator
         * get the text of web element and print it
         * close driver.
         */
    }
}
/**
 * 1. dinamik olmazlar..
 * 2. çoğunlukla birden fazla web elementin class name attribute değeri aynı olabilir. birden fazla web elementi
 * işaret etmeleri durumunda selenium ilk elemente gider ve onunla işlem yapar..
 * 3. unique (eşsiz) olup olmadığı dev tools arama (ctrl+f ile açılan yerde) bölümünde başına "." işareti
 *  konularak kontrol edilebilir. By.className("clasname") içine yazılırken "." işareti olmadan kullanılır..
 *  4. class name değeri genellikle space yani boşluk içerir.. bu durumda By.className("clas name") ile kullanılamazlar.
 *  bu durumda cssSelector ile uygun işlem yapıldıktan sonra kullanılabilirler...(Css konusu)
 */