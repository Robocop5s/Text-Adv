public class Weapon extends Item{
    private int damage;

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public  Weapon(String name, String description, int value, int damage){
        super(name, description, value);
        this.damage = damage;
    }

    public String str(){
        return String.format("{0}\n=====\n{1}\nDamage: {3}",
                this.name, this.desc, this.desc, this.damage);
    }
}
