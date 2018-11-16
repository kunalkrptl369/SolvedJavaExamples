package inheritencePgm;

public class methodOverriding {
    double dim1;
    double dim2;

    methodOverriding(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area of figured is undefined");
        return 0;
    }
}

class Rect extends methodOverriding {
    Rect(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Rectangle.");
        return dim1 * dim2;
    }
}

class tringle extends methodOverriding {
    tringle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Tringle ");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {
    public static void main(String args[]) {
        methodOverriding mo = new methodOverriding(10, 4);
        Rect r = new Rect(2, 3);
        tringle t = new tringle(3, 5);
        methodOverriding meth;

        meth = r;
        System.out.println("area is " + meth.area());

        meth = t;
        System.out.println("area is "+meth.area());

        meth = mo;
        System.out.println("area is "+meth.area());
    }
}