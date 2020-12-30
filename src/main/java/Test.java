import ai.brewnet.*;

public class Test {

    public static void main(String[] args) {

        final NeuralNetwork model = new NeuralNetwork();

        model.addLayer(new Layer.Dense(2, new Activation.Relu()));
        model.addLayer(new Layer.Dense(12, new Activation.Relu()));
        model.addLayer(new Layer.Dense(24, new Activation.Relu()));
        model.addLayer(new Layer.Dense(1, new Activation.Linear()));

        model.compile(new Optimizer.SGD(0.001));

        final double[][] x = new double[][]{
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
                new double[]{0, 1},
                new double[]{1, 0},
                new double[]{0, 0},
                new double[]{1, 1},
        };
        final double[][] y = new double[][]{
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
                new double[]{1},
                new double[]{1},
                new double[]{0},
                new double[]{1},
        };

        System.out.println(model);

        model.fit(x, y, 1000, 6);

        System.out.println(model.predict(new double[][]{x[0]}));
        System.out.println(model.predict(new double[][]{x[1]}));
        System.out.println(model.predict(new double[][]{x[2]}));
        System.out.println(model.predict(new double[][]{x[3]}));

    }

}
