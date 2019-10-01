package id.ac.polinema.idealbodyweight.util;

public class BodyMass {
    private float height;
    private int weight;
    private float index;


    public BodyMass(float height, int weight) {
        this.height = height;
        this.weight = weight;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return weight / ((height / 100 ) * (height / 100 ));
    }
}

