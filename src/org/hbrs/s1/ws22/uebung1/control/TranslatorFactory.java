package org.hbrs.s1.ws22.uebung1.control;

public class TranslatorFactory {

    //Methode erstellt ein neues Objekt der Klasse GermanTranslator
    public static Translator createGermanTranslator() {
        GermanTranslator translator = new GermanTranslator();
        return translator;
    }

}
