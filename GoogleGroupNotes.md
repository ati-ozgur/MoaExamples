# Google Group Notes


According to Moa Use [Google Group Message from Albert Bifet](
https://groups.google.com/d/msg/moa-users/H11AKhDyZvQ/25kiBr6m4gEJ)

You should use "LearnModel" to learn the model with file A, and then 
"EvaluateModel" with file B and the model created using file A: 

    http://moa.cms.waikato.ac.nz/details/classification/command-line/ 



Evaluate Periodic Heldout Test



java -Xmx1400m  -classpath sizeofag.jar;moa.jar moa.DoTask EvaluatePeriodicHeldOutTest -l (HoeffdingTree -m 400000000) -s (ArffFileStream -f (adult.arff))-n 8840 -i 40000 -f 5000




java -classpath .;moa.jar;weka.jar -javaagent:sizeofag.jar moa.DoTask
LearnModel -l HoeffdingTree -s generators.WaveformGenerator -m 1000000
-O model1.moa


