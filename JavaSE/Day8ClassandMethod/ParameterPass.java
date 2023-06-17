package JavaSE.Day8ClassandMethod;

class Data {
    int data;

    public Data(int data) {
        this.data = data;
    }
}

public class ParameterPass {
    void increase(int a) {
        a++;
    }

    void change(Data d) {
        System.out.println("Change Data = " + d.data);
        d.data++;
    }

    void changeme(Data d) {
        System.out.println("Change Data = " + d.data);
        d = new Data(10);
    }

    public static void main(String[] args) {
        ParameterPass pass = new ParameterPass();

        int value = 100;
        pass.increase(value);

        System.out.println("Data = " + value);

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        Data tom = new Data(20);
        pass.change(tom);
        System.out.println("Tom's Data = " + tom.data);


        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        Data jerry = new Data(1000);
        pass.changeme(jerry);
        System.out.println("Jerry's Data After changeme = " + jerry.data);
    }
}
