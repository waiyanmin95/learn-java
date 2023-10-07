package JavaSE.Day3TypeArrays;

public class TypeInference {
    public static void main(String[] args) {
        // Type Inference for simplicity
        // Valid
        var i = 10;

        // Invalid
//        var x;
//        var y = x;

        // Valid
        var arr = new int[10];

        // Invalid
//        var[] arr = new int[20];

        // Invalid ( Composite/Type Literal Style )
//        var arr = {1,2,3};
    }
}
