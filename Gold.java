public class Gold extends Item{
    private int amt;

    public  Gold(int amt){
        super("Gold Coin", String.format("A round Shinny Gold Coin", (amt)), amt);
        this.amt = amt;
    }
}
