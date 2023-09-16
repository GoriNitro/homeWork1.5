import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setDefenceType("Magic");
        boss.setDamage(90);
        boss.setHealth(800);
        System.out.println("Boss Statistic");
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Defence type: " + boss.getDefenceType());
    }
}
