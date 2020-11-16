package com.pa.strategy.solutionStrategy;
/*
 *@author patriciamacedo
 */
import java.util.Map;

public class StrategyDiversity implements Strategy {


    @Override

    public float calculateGlobalIndex(Map<Integer, Programmer> personList){
        int countYoung=0;
        int countOld=0;

        for (Programmer programmer : personList.values()) {

            if(programmer.getYearsOfExperience()>5)
                countOld++;
            if(programmer.getYearsOfExperience()<=5)
                countYoung++;

        }
       return countYoung*1.f/countOld;

    }
}