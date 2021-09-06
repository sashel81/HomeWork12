package andersenlab.com;

public interface TriangleAction {
    static float areaCounter(int a, int b, int c) {
        if ((a<=0)||(b<=0)||(c<=0))
        throw new IllegalArgumentException("argument of function is negative");
        float semPer = (a + b + c) / 2;
        return (float) Math.sqrt((semPer * (semPer - a) * (semPer - b) * (semPer - c)));
    }


}
