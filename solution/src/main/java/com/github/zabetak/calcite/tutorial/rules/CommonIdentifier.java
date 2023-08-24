package com.github.zabetak.calcite.tutorial.rules;

import java.util.HashMap;

import com.github.zabetak.calcite.tutorial.operatormap.OperatorMMap;
public class CommonIdentifier {
public static void getPopulated(){
    HashMap<String,String> OperatorMap = OperatorMMap.Operator_Map;

    OperatorMap.put("ADD","ADDITION");
    OperatorMap.put("SUB","SUBTRACTION");
    OperatorMap.put("Len","LOC");
    OperatorMap.put("CharLen","LOC");


}
}
