package io.elmiguelo.model;

public class Keyboard extends InputDevice{
    private final int keyboardId;
    private static int keyboardCounter;

    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.keyboardId = ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardId=" + keyboardId +
                super.toString() + '}';
    }
}
