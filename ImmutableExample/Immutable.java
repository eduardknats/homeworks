package Immutable;


public final class Immutable {

    private final Mutable value;

    public Immutable (Mutable value) {
        this.value = new Mutable(value.getName());
    }

    public Mutable getValue() {
        return new Mutable(value.getName());
    }


    public static void main(String[] args) {
        Mutable mutable = new Mutable("имя до изменения");
        Immutable immutable = new Immutable(mutable);
        mutable.setName("имя после изменения");

        System.out.println("Попытка изменения через конструктор");
        System.out.println("immutable " + immutable.getValue().getName());
        System.out.println("mutable " + mutable.getName());
        System.out.println();

        System.out.println("Попытка изменения через getter");
        Mutable mutableCopy = immutable.getValue();
        mutableCopy.setName("новое имя");
        System.out.println("immutable " + immutable.value.getName());
        System.out.println("mutable " + mutableCopy.getName());
    }
}

