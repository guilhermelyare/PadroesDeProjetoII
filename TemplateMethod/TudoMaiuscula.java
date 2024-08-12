package TemplateMethod;

public class TudoMaiuscula extends ConversorTexto {

    @Override
    protected char[] converterCaracteres(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return chars;
    }
}
