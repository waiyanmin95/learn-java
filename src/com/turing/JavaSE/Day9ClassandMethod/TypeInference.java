package turing.JavaSE.Day9ClassandMethod;

import java.util.ArrayList;

public class TypeInference {
    public static void main(String[] args) {
        // Fully Form
        // ArrayList<String> xi = new ArrayList<String>();

        // Inference
        ArrayList<String> xi = new ArrayList<>();

        // Know from expression value/content "Hello".
        // Usage and context within the code.
        var s = "Hello";
    }
}
