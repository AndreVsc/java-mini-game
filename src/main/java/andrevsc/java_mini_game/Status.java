package andrevsc.java_mini_game;

import org.springframework.stereotype.Component;

@Component
public class Status {
    private int vida;
    private int magia;
    private int forca;
    private int defesa;
    private int carisma;
    private int precisao;
    private int agilidade;
    private int stamina;
    private int inteligencia;
    private int furtividade;
    private int sorte;
    private int resistenciaMagica;
    private int resistenciaFisica;

    public Status() {
        this.vida = 100;
        this.magia = 100;
        this.forca = 10;
        this.defesa = 10;
        this.carisma = 0;
        this.precisao = 50;
        this.agilidade = 10;
        this.stamina = 10;
        this.inteligencia = 0;
        this.furtividade = 0;
        this.sorte = 0;
        this.resistenciaMagica = 0;
        this.resistenciaFisica = 0;
    }

    public void listarStatus() {
        System.out.println("Vida: " + vida + "          | Resistencia Magica: " + resistenciaMagica + " | Resistencia Fisica: " + resistenciaFisica);
        System.out.println("Magia: " + magia + "         | Forca: " + forca + "             | Defesa: " + defesa);
        System.out.println("Carisma: " + carisma + "         | Agilidade: " + agilidade + "         | Stamina: " + stamina);
        System.out.println("Inteligencia: " + inteligencia + "    | Furtividade: " + furtividade + "        | Sorte: " + sorte);
    }

    public void subirNivel() {
        forca += 2;
        defesa += 2;
        carisma += 1;
        precisao += 1;
        agilidade += 1;
        stamina += 1;
        inteligencia += 1;
        furtividade += 1;
        sorte += 1;
        resistenciaMagica += 1;
        resistenciaFisica += 1;
        listarNovoStatus();
    }
    
    void listarNovoStatus() {
        System.out.println(String.format(
            "Vida: %d + 2 | Resistencia Magica: %d | Resistencia Fisica: %d",
            vida - 2, resistenciaMagica, resistenciaFisica
        ));
        System.out.println(String.format(
            "Magia: %d | Forca: %d | Defesa: %d",
            magia, forca, defesa
        ));
        System.out.println(String.format(
            "Carisma: %d | Precisao: %d | Agilidade: %d | Stamina: %d",
            carisma, precisao, agilidade, stamina
        ));
        System.out.println(String.format(
            "Inteligencia: %d | Furtividade: %d | Sorte: %d",
            inteligencia, furtividade, sorte
        ));
    }
}