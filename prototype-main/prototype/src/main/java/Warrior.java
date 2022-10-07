/*
Estou imaginando o cenário comentado em sala de aula, sobre um jogo de videogame onde
os inimigos vão aparecendo aos montes.
 */

public class Warrior implements Cloneable{
    private int code;
    private String weapon;
    private int strength;
    private int speed;

    public Warrior(int code, String weapon, int strength, int speed) {
        this.code = code;
        this.weapon = weapon;
        this.strength = strength;
        this.speed = speed;
    }

    public int getCode() {
        return code;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public Warrior clone() throws CloneNotSupportedException {
        Warrior warriorClone = (Warrior) super.clone();
        return warriorClone;
    }

    //função somente para o assertEquals dos casos de teste
    @Override
    public String toString() {
        return "Guerreiro{" +
                "código=" + code +
                ", arma=" + weapon +
                ", força=" + strength +
                ", velocidade=" + speed +
                "}";
    }
}