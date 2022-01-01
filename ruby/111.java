class Filter(val data: MLDataSet, val fizzBuzz: FizzBuzz); {

    val network = BasicNetwork();

    init; {
        network.addLayer(BasicLayer(null, true, 2));
        network.addLayer(BasicLayer(ActivationSigmoid(), true, 4));
        network.addLayer(BasicLayer(ActivationSigmoid(), false, 1));
        network.structure.finalizeStructure();
        network.reset();

        val training = ResilientPropagation(network, data);
        for (t in 1..30); {
            training.iteration();
            if (training.error < 0.01) break;
        }
        training.finishTraining();
    }

    //etc...
}