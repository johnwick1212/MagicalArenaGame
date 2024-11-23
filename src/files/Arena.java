package files;

class Arena {
    private Dice dice;

    public Arena() {
        this.dice = new Dice(6);
    }

    public void startMatch(Player player1, Player player2) {
        System.out.println("Starting match between " + player1.getName() + " and " + player2.getName());

        while (player1.isAlive() && player2.isAlive()) {
            Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
            Player defender = attacker == player1 ? player2 : player1;


            int attackRoll = dice.roll();
            int defenseRoll = dice.roll();

 
            int attackDamage = attacker.getAttack() * attackRoll;
            int defenseDamage = defender.getStrength() * defenseRoll;
            int netDamage = Math.max(0, attackDamage - defenseDamage);


            defender.reduceHealth(netDamage);


            System.out.println(attacker.getName() + " attacks with roll: " + attackRoll);
            System.out.println(defender.getName() + " defends with roll: " + defenseRoll);
            System.out.println(defender.getName() + " takes " + netDamage + " damage. Health: " + defender.getHealth());


            if (!defender.isAlive()) {
                System.out.println(defender.getName() + " is defeated! " + attacker.getName() + " wins!");
                break;
            }
        }
    }
}