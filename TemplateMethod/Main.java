package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        ConversorTexto conversorMaiuscula = new TudoMaiuscula();
        String textoMaiusculo = conversorMaiuscula.converterTexto("Olá Mundo!");
        System.out.println(textoMaiusculo);
        
        ConversorTexto conversorMinuscula = new TudoMinuscula();
        String textoMinusculo = conversorMinuscula.converterTexto("Olá Mundo!");
        System.out.println(textoMinusculo);
    }
}

