package TemplateMethod;

public abstract class ConversorTexto {
    
    public String converterTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresConvertidos);
        return resultado;
    }
    
    protected char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }
    
    protected String juntarCaracteres(char[] chars) {
        return new String(chars);
    }
    
    protected abstract char[] converterCaracteres(char[] chars);
}
