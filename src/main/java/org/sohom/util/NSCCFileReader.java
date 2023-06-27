package org.sohom.util;
import org.beanio.BeanReader;
import org.beanio.BeanReaderIOException;
import org.beanio.StreamFactory;

import java.io.File;

public class NSCCFileReader {

    /**Creates a BeanReader that reads the input file and unmarshalls the obejcts from the file.**/
    public BeanReader createReader(String filename) throws IllegalArgumentException, BeanReaderIOException {
        StreamFactory factory = StreamFactory.newInstance();
        factory.load("/Users/sohompal/Downloads/ETF/src/main/resources/mapping.xml");
        BeanReader reader = factory.createReader("NSCC", new File(filename));
        return reader;
    }


}
