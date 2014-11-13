package moaExamples;


import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.tasks.*;

import moa.streams.generators.*;
import moa.streams.*;

Classifier learner = new HoeffdingTree();
InstanceStream stream = new RandomRBFGenerator();

LearnModel lm = new LearnModel(learner,stream,100,100);

lm.doTask();

println(learner);

