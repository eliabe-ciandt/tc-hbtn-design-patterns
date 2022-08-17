public class Director {

    void buildGuerreiro(Builder builder) {
        builder.setNome("Guerreiro");
        builder.setInteligencia(1);
        builder.setForca(8);
        builder.setDestreza(6);
        builder.setVigor(5);
        builder.setResistencia(10);
        builder.setTipo();
    }

    void buildLadrao(Builder builder) {
        builder.setNome("Ladrao");
        builder.setInteligencia(2);
        builder.setForca(6);
        builder.setDestreza(10);
        builder.setVigor(8);
        builder.setResistencia(5);
        builder.setTipo();
    }

    void buildMago(Builder builder) {
        builder.setNome("Mago");
        builder.setInteligencia(10);
        builder.setForca(2);
        builder.setDestreza(4);
        builder.setVigor(5);
        builder.setResistencia(3);
        builder.setTipo();
    }
}
