package org.sohom;

import org.beanio.BeanReader;
import org.sohom.beans.ETF;
import org.sohom.beans.ETFConstituents;
import org.sohom.util.NSCCFileReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String filename = "/Users/sohompal/Downloads/ETF/src/main/java/etf213_canned_02261255_02981255.txt";
        BeanReader reader = new NSCCFileReader().createReader(filename);

        ArrayList<ETF> ETFS = new ArrayList<>();
        ETF etf;
        ETFConstituents constituents;
        while(true){
            Object obj = reader.read();
            if(obj == null) break;

            if(obj.getClass() == ETF.class){
                etf = (ETF) obj;
                ETFS.add(etf);
                System.out.println(etf);
            }
            else if(obj.getClass() == ETFConstituents.class){
                constituents = (ETFConstituents) obj;
                ETFS.get(ETFS.size()-1).addConstituents(constituents);
                System.out.println(constituents);
            }
            else{
                break;
            }
        }


        System.out.println(ETFS.get(4).getComponentCount());

        reader.close();

    }
}