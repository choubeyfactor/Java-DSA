
public class arrayIntro {

    void demoArrays() {
        int[] ages = new int[5];
        float[] weights = new float[5];
        String[] names = new String[3];

        weights[0] = 23.5f;
        weights[1] = 23.8f;
        weights[2] = 32.1f;

        System.out.println(weights[0]);

    }

    public static void main(String[] args) {

        arrayIntro obj = new arrayIntro();
        obj.demoArrays();
    }
}