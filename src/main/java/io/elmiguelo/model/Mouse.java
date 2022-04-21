package io.elmiguelo.model;

public class Mouse extends InputDevice{
    private final int mouseId;
    private static int mouseCounter;

    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        this.mouseId = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseId=" + mouseId +
                super.toString() + '}';
    }
}
