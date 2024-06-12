package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        try {
            Class<?> classe = Exemplo.class;

            if (classe.isAnnotationPresent(Tabela.class)) {
                Annotation anotação = classe.getAnnotation(Tabela.class);
                System.out.println("Nome da Anotação na Classe: " + anotação.annotationType().getName());
                Tabela tabela = (Tabela) anotação;
                System.out.println("Anotação na Classe: " + tabela.value());
            }

            Field[] campos = classe.getDeclaredFields();
            for (Field campo : campos) {
                if (campo.isAnnotationPresent(Tabela.class)) {
                    Annotation anotação = campo.getAnnotation(Tabela.class);
                    System.out.println("Nome da Anotação no Campo: " + campo.getName());
                    Tabela tabela = (Tabela) anotação;
                    System.out.println("Anotação no Campo: " + tabela.value());
                }
            }

            Method[] métodos = classe.getDeclaredMethods();
            for (Method método : métodos) {
                if (método.isAnnotationPresent(Tabela.class)) {
                    Annotation anotação = método.getAnnotation(Tabela.class);
                    System.out.println("Nome da Anotação no Método: " + método.getName());
                    Tabela tabela = (Tabela) anotação;
                    System.out.println("Anotação no Método: " + tabela.value());
                }
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
}
