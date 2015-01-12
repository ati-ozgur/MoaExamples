//  Example taken from google group
//  https://groups.google.com/forum/#!topic/moa-users/n5QLTjMpFMs

import moa.streams.generators.*;
import moa.streams.*
import weka.core.Instance

import javax.management.InstanceAlreadyExistsException;


WaveformGenerator streamA = new WaveformGenerator() ;
streamA.prepareForUse();

WaveformGenerator streamB = new WaveformGenerator() ;
streamB.getOptions().setViaCLIString("-i 2");
streamB.prepareForUse();

// and then use streamA.nextInstance() and streamB.nextInstance() 
// to combine the instances as you want.

for (int i = 0; i < 100; i++) {
    Instance ins1= streamB.nextInstance();
    System.out.println(ins1);
}
