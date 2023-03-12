public class Main {
    public static void main(String[] args) {
        //Item i1 = new Item("item name", "item desc", 10);
        //Item i2 = new Item("item name2", "item desc2", 11);

        Gold goldbar = new Gold(100);

        //Weapon weapon = new Weapon("super weapon", "super 2 weapon", 10, 45);
        //weapon.setDamage(45);
        //int dvalue = weapon.getDamage();

        Sword superSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace spikyMace = new Mace();
        Arrow sharpArrow = new Arrow();
        System.out.println(superSword.name+ " " + superSword.desc);

        //Enemies
        Zombie fastZombie = new Zombie();
        Zombie slowZombie = new Zombie();
        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Dog spotDog = new Dog();
        GiantSpider blackWidow = new GiantSpider();
        Karen annoyingKaren = new Karen();

        Player player1 = new Player("Dylan", (short)10,(short)10,true);
        if (player1.getLife())
            System.out.println("Player is alive");
        else
            System.out.println("Player is not alive");

        GameBoard gameBoard = new GameBoard("Tic Tac Toe");
        System.out.println(gameBoard.name);

        //Actions
        MoveEast moveEast = new MoveEast();
        MoveNorth moveNorth = new MoveNorth();
        MoveSouth moveSouth = new MoveSouth();
        MoveWest moveWest = new MoveWest();
        Attack attack = new Attack();
        Flee flee = new Flee();
        ViewInventory viewInventory = new ViewInventory();
        Slide slide = new Slide();

        World world = new World();
        world.load_tiles();
    }

}