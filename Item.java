public class Item {
    protected String name;
    protected String desc;
    protected int value;

    public Item(){
    }
    public Item(String name, String description, int value){
        this.name = name;
        this.desc = description;
        this.value = value;
    }
    public void setName(String nameStr){
        this.name = nameStr;
    }
    public String getName(){
        return this.name;
    }
}
