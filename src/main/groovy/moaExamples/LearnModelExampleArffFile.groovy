package moaExamples

import moa.classifiers.Classifier
import moa.classifiers.trees.HoeffdingTree
import moa.streams.ArffFileStream
import moa.streams.InstanceStream
import moa.streams.generators.RandomRBFGenerator
import moa.tasks.LearnModel

/**
 * Created by atilla.ozgur on 13.11.2014.
 */


Classifier learner = new HoeffdingTree();
InstanceStream stream = new ArffFileStream("arffFiles\\breast-cancer.arff",10)

LearnModel lm = new LearnModel(learner,stream,100,100);

lm.doTask();

println(learner);



