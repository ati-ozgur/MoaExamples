package moaExamples;


import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;

import weka.core.Instance;
import weka.core.Instances;

import moa.tasks.*;

import moa.streams.generators.*;
import moa.streams.*;

import moa.options.*;
import moa.options.ClassOption;
import moa.options.IntOption;


LearnModel lm = new LearnModel();

char charOption = 'l'

ClassOption learnerOption = new ClassOption("learner", charOption,"Classifier to train.", Classifier.class, "moa.classifiers.trees.HoeffdingTree");

charOption = 's'
ClassOption streamOption = new ClassOption("stream", charOption,"Stream to learn from.", InstanceStream.class,
        "generators.RandomTreeGenerator");

charOption = 'm'
IntOption maxInstancesOption = new IntOption("maxInstances", charOption,
        "Maximum number of instances to train on per pass over the data.",
        100, 0, 100);

charOption = 'p'
IntOption numPassesOption = new IntOption("numPasses", charOption,
        "The number of passes to do over the data.", 1, 1,
        10);



lm.learnerOption = learnerOption;
lm.streamOption = streamOption;
lm.maxInstancesOption = maxInstancesOption;
lm.numPassesOption = numPassesOption;


Classifier learner  = lm.doTask();

println(learner);



