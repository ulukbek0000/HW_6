public class Weapon {
    private WeaponType type;
    private String name;

    public Weapon(WeaponType type, String name) {
        this.name = name;
        this.type = type;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
