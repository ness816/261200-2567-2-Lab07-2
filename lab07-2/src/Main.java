public class Main {
    public static void main(String[] args) {
        //สร้างตัวละคร
        System.out.println("🏹 Character Created!");
        Character player = new Character(100, 30);

        // 🔥 ใช้ swingSword() หลายครั้งเพื่อให้เกิด Pass Out
        System.out.println("\n⚔️ Swinging sword...");
        player.swingSword(); // -10 stamina
        player.swingSword(); // -10 stamina
        player.swingSword(); // -10 stamina (Should trigger "pass out")

        // 💀 ใช้ takeDamage() หลายครั้งเพื่อให้เกิด Death Event
        System.out.println("\n💥 Taking Damage...");
        player.takeDamage(40); // -40 health
        player.takeDamage(50); // -50 health (Should trigger "Character is dead.")

        // 💤 พยายามใช้ rest() หลังจากตัวละครตาย (ควรพิมพ์ว่า "Dead characters cannot rest.")
        System.out.println("\n😴 Attempting to rest...");
        player.rest();

        // 🚀 ทดสอบ Rest อีกครั้งหลังจากสร้างตัวละครใหม่
        System.out.println("\n✨ Creating a new character...");
        player = new Character(50, 50);

        System.out.println("\n💤 Resting...");
        player.rest();
    }
}