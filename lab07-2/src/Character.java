public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;
    private boolean isAlive;
    private boolean isConscious;

    // Constructor
    public Character(int health, int stamina) {
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.health = health;
        this.stamina = stamina;
        this.isAlive = this.health > 0;
        this.isConscious = this.stamina > 0;
        System.out.println("Character created with " + this.maxHealth + " health and " + this.maxStamina + "stamina.");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isConscious() {
        return isConscious;
    }

    public void setHealth(int health) {
        this.health = Math.min(health, maxHealth);
    }

    public void setStamina(int stamina) {
        this.stamina = Math.min(stamina, maxStamina);
    }

    public void swingSword() {
        if (this.stamina - 10 >= 0) {
            this.stamina = this.stamina - 10;
            if (this.stamina <= 0) {
                System.out.println("Your character needs to cool down.");
            } else {
                System.out.println("Character swings sword. Stamina is now " + this.stamina);
            }
        } else {
            stamina = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damageAmount) {
        if (!isAlive) {
            System.out.println("The character is already dead.");
            return;
        }
        if (damageAmount < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }
        health -= damageAmount;
        if (health <= 0) {
            health = 0;
            isAlive = false;
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health);
        }
    }

    public void rest() {
        if (!isAlive) {
            System.out.println("Dead characters cannot rest.");
            return;
        }
        health = maxHealth;
        stamina = maxStamina;
        isConscious = true;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: " + health + ", stamina: " + stamina);
    }
}