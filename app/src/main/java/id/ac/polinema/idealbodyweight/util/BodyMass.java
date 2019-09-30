package id.ac.polinema.idealbodyweight.util;

public class BodyMass {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private int gender;
    private int height;
    private int weight;
    private float index;


    public BodyMass(int gender, int height, int weight) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return weight / (height / 100 ^ 2);
//        switch (gender) {
//            case MALE: return (height - 100) - ((height - 100) * 0.1f);
//            case FEMALE: return (height - 100) + ((height - 100) * 0.15f);
//            default: return 0f;
//        }
    }
}

